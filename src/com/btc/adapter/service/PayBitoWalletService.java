package com.btc.adapter.service;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.btc.adapter.dao.to.CustomerKeysTo;
import com.btc.adapter.dao.to.CustomerLedgerTo;
import com.btc.adapter.dao.to.PaymentHistoryTo;
import com.btc.client.api.controller.ControllerFactory;
import com.btc.client.api.to.CounterPartyRequestTo;
import com.btc.client.api.to.CounterPartyResponseTo;
import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;
import com.btc.client.jsonconverter.Details;
import com.btc.component.service.CounterPartyService;
import com.btc.component.service.CustomerKeyService;
import com.btc.component.service.CustomerLedgerService;
import com.btc.component.service.PaymentHistoryService;

import btc.dao.AuditDAO;
import btc.to.AdapterResponse;
import btc.to.AuditTo;
import btc.to.CustomerRequestTo;
import btc.to.CustomerResponseTo;
import btc.to.PaymentProcessingRequestTo;
import btc.to.PaymentProcessingResponseTo;
import btc.wallet.WalletNotifyTransaction;

public class PayBitoWalletService {

public PaymentHistoryService paymentHistService;
	
public CustomerKeyService customerKeyService;

public CustomerLedgerService customerLedService;

@Autowired
AuditDAO auditDAO;
	
public PaymentHistoryService getPaymentHistService() {
	return paymentHistService;
}


public void setPaymentHistService(PaymentHistoryService paymentHistService) {
	this.paymentHistService = paymentHistService;
}


public CustomerKeyService getCustomerKeyService() {
	return customerKeyService;
}

public void setCustomerKeyService(CustomerKeyService customerKeyService) {
	this.customerKeyService = customerKeyService;
}


public CustomerLedgerService getCustomerLedService() {
	return customerLedService;
}

public void setCustomerLedService(CustomerLedgerService customerLedService) {
	this.customerLedService = customerLedService;
}






public PaymentProcessingResponseTo sendtoPaybitoToOther(PaymentProcessingRequestTo paymentPReq){
		
		// paybito to other wallet user
	
	   String triggerBalance=paymentPReq.getBtc_amount();
	   
	   String triggerscurrency=paymentPReq.getCurrency();
	    IWalletRequestController walletRequestController=null;
	  
		PaymentProcessingResponseTo response=new PaymentProcessingResponseTo();
		CustomerRequestTo req=new CustomerRequestTo();
		req.setCustomer_Id(paymentPReq.getCustomer_Id());
		CustomerResponseTo res=this.getCustomerBalance(req); 
		System.out.println("BTc Balance==="+res.getBtc_balance());
		System.out.println("Trigger Balance==="+res.getTriggers_balance());
		CustomerKeysTo customerKeysTo=new CustomerKeysTo();
		//--------------adding for triggers
		
		CounterPartyService counterPartyService=new CounterPartyService();
		
		CounterPartyRequestTo counterPartyRequestTo=new CounterPartyRequestTo();
		CounterPartyResponseTo counterPartyResponseTo=null;
		
		String pubkey=customerKeyService.getreceiveKeyFromCustomerTriggers(paymentPReq.getCustomer_Id());
		
		System.out.println("pubkey"+pubkey);
		
		System.out.println("pubkey"+customerKeysTo.getSenderPublicKey());
	//	System.out.println("Triggers pubkey"+pubkey.getSenderPublicKey());
		//if (pubkey.getSenderPublicKey().equalsIgnoreCase("0")) {
	//	if (pubkey.getSenderPublicKey().equals("null") ) {
		if (pubkey==null) {
		
			 walletRequestController = (IWalletRequestController) ControllerFactory
					.provideWalletController();

			WalletRequestTO walletrequest = new WalletRequestTO();
			walletrequest.setAuditId(paymentPReq.getCustomer_Id());
			walletrequest.setCurrency("btc");

			WalletResponseTO walletresponse = walletRequestController.getNewAddress(walletrequest);
			String strAddr = walletresponse.getAddress();
		//	pubkey.setSenderPublicKey(strAddr);
			
			customerKeysTo.setSenderPublicKey(strAddr);
			System.out.println("new address===" + strAddr);

			
		
			walletrequest.setAddress(strAddr);
			walletrequest.setCurrency("btc");
			
			WalletResponseTO  walletresponsee = walletRequestController.getPrivateKey(walletrequest);
			String strPrivateAddress = walletresponsee.getAddress();
			
			System.out.println("private address :"+strPrivateAddress);
			
			AuditTo auditTo = new AuditTo();
			
			System.out.println("cusid"+paymentPReq.getCustomer_Id());
			auditTo.setCUSTOMERID(paymentPReq.getCustomer_Id());
			System.out.println();
			auditTo.setPUBKEY(strAddr);
			auditTo.setPRIVATEKEY(strPrivateAddress);
             
			int xx = auditDAO.insertIntoSendingAuditTable(auditTo);
			System.out.println("xx"+xx);
			String fromadd= auditDAO.getreceiveKeyFromCustomerTriggers(auditTo.getCUSTOMERID());
			System.out.println("fromadd"+fromadd);
			if(fromadd==null){
			
			//insert customerTriggerkeys table
			int xx1 = auditDAO.insertTRIGGERCustomerKeyDao(auditTo);
			System.out.println("xx1"+xx1);
			}
			
			System.out.println("xx"+xx);
		} else {
			customerKeysTo.setSenderPublicKey(pubkey);
		}
		
		System.out.println("customerKeysTo.getSenderPublicKey()"+customerKeysTo.getSenderPublicKey());
		counterPartyRequestTo.setSource(customerKeysTo.getSenderPublicKey());
		counterPartyRequestTo.setDestination(paymentPReq.getToadd());
		counterPartyRequestTo.setToken("TRIGGERS");
		counterPartyRequestTo.setQuantity(paymentPReq.getBtc_amount());
		if (paymentPReq.getCurrency().equals("triggers")) {

			SendBitcoinService sendBitcoin = new SendBitcoinService(this.paymentHistService);
		//	String strMiningFees = sendBitcoin.toOtherWalletFees(paymentPReq.getBtc_amount());

		//	double dblAmount = Double.parseDouble(paymentPReq.getBtc_amount()) + Double.parseDouble(strMiningFees);
			
			double dblAmount =Double.parseDouble(paymentPReq.getBtc_amount());
			/*String BtcBalance=res.getBtc_balance();
			String triggerBalance= res.getTriggers_balance();*/
			

			if (Double.parseDouble(res.getTriggers_balance()) >= dblAmount) {
			
		//	if (Double.parseDouble(res.getBtc_balance()) >= 0.0) {
				System.out.println("Amount : " + dblAmount);

			/*	if (Double.parseDouble(sendBitcoin.getWalletBalance(paymentPReq)) > Double
						.parseDouble(paymentPReq.getBtc_amount())) {*/

				//	String btcTxnID = customerKeyService.getLastTransaction();
					
				BigDecimal sendTriggerBtcBalance=new BigDecimal(0.0002).setScale(8,BigDecimal.ROUND_DOWN);
				System.out.println("sendTriggerBtcBalance=="+sendTriggerBtcBalance);
				
				int btcBalancePerAddress=counterPartyService.getSendTriggerBalance(pubkey);
				
				System.out.println("btcBalancePerAddress"+btcBalancePerAddress);
				
				BigDecimal sendTriggerBtcBalance1=new BigDecimal(btcBalancePerAddress);
				BigDecimal divide=new BigDecimal(100000000);
				
				BigDecimal sendTriggerBtcBalance2=sendTriggerBtcBalance1.divide(divide);
				System.out.println("sendTriggerBtcBalance2=="+sendTriggerBtcBalance2);
				
				//BigDecimal sendTriggerBtcBalance2 = new BigDecimal(sendTriggerBtcBalance21).setScale(8,BigDecimal.ROUND_DOWN);
				
				//BigDecimal btcBalancePerAddressDivided= new BigDecimal();
				//System.out.println("btcBalancePerAddressDivided==="+btcBalancePerAddressDivided);
				if(sendTriggerBtcBalance.compareTo(sendTriggerBtcBalance2)==0 ||sendTriggerBtcBalance.compareTo(sendTriggerBtcBalance2)==-1){
				
					System.out.println("To Address==============" + paymentPReq.getToadd());
					WalletResponseTO bitcoinvalidAddress = sendBitcoin.getAddressBtcCheck(paymentPReq);
					boolean btcvalidAddress = Boolean.parseBoolean(bitcoinvalidAddress.getIsvalid());
					System.out.println("b1::::" + bitcoinvalidAddress.getIsvalid());

					if (btcvalidAddress == true) {
						paymentHistService.insertSendPaymentHistory(paymentPReq);
						
						 System.out.println("paymentPReq.getCustomer_Id()"+paymentPReq.getCustomer_Id());
			    	       String status = paymentHistService.statusCall(paymentPReq.getCustomer_Id());
			    	       
							 System.out.println("Status : " + status);
							if (status.equals("0")) {
								
								response.setError("Send can't be processed due to network problem.. please try after sometime.");
							}
							else {
								
								
								counterPartyResponseTo=counterPartyService.getSendTrigger(counterPartyRequestTo);
								
								String strTxnID=counterPartyResponseTo.getUnsigned_tx();
								
								System.out.println("hash key generate==="+strTxnID);
							//	String strTxnID = sendBitcoin.toBCHOtherWalletTrasnsfer(paymentPReq);
							
							if (strTxnID == null || strTxnID.length() == 0) {
								System.out.println("null  value postion");
								paymentHistService.rollBackcall(paymentPReq);
								response.setError(
										"Transaction can't be processed due to insufficient BTC balance.. Please Add BTC in your wallet.");

							} else {

								 walletRequestController = (IWalletRequestController) ControllerFactory
										.provideWalletController();

								WalletRequestTO walletrequest = new WalletRequestTO();

								walletrequest.setCurrency("btc");
								walletrequest.setUnsigned_tx(counterPartyResponseTo.getUnsigned_tx());
								WalletResponseTO walletResponseTO = walletRequestController.signRawTransaction(walletrequest);
										

								if (walletResponseTO.getHex() != null) {
									walletrequest.setCurrency("btc");
									walletrequest.setHex(walletResponseTO.getHex());
									walletResponseTO = walletRequestController.sendRawTransaction(walletrequest);

									String TriggerTxnid = walletResponseTO.getTransactionId();
									System.out.println("strTxnID" + TriggerTxnid);
									
									WalletResponseTO wres = new WalletNotifyTransaction().getTransactionInform(TriggerTxnid);

									List<Details> listDetails=wres.getWalletjsonresInner().getDetails();
									if(listDetails.size()>0)
									  System.out.println("size : "+listDetails.size());

									synchronized (this) {
										for (int z = listDetails.size() - 1; z >= 0; z--) {
											if (wres.getWalletjsonresInner().getDetails().get(z).getCategory()
													.equals("send")) {

												
												String paidAmt1 = wres.getWalletjsonresInner().getDetails().get(z)
														.getFee();
												String[] paidAmt2 = paidAmt1.split("-");
												String paidAmt = paidAmt2[1].trim();
												System.out.println("send btc amount::" + paidAmt);
												paymentPReq.setCurrency("btc");
												paymentPReq.setBtc_amount(paidAmt);


											}

										}
										paymentHistService.insertPaymentHistoryTriggerBtcDetails(paymentPReq);

									}
									
									
									
									//System.out.println("strTxnID" + TriggerTxnid);
									paymentPReq.setTxnId(TriggerTxnid);

									PaymentHistoryTo p = new PaymentHistoryTo();
									String txno = p.getTransactionId();
									System.out.println("==============" + txno);
									String cusid = paymentPReq.getCustomer_Id();
									System.out.println("txno:" + txno + ":" + "cusid:" + cusid);
								
									paymentPReq.setCurrency(triggerscurrency);	
									paymentPReq.setBtc_amount(triggerBalance);
									int x = customerKeyService.insertCustomerTriggerKeys(paymentPReq);
									// paymentHistService.updatePaymentHistoryForNodeBtcTransactionid(paymentPReq);

									System.out.println("customer key :" + x);

									response = this.getClosingBalance(paymentPReq);

									// response.setBtc_txnID(strTxnID);
								//	response.setError("Your transaction is successfully completed ");
								//	String s=" ";
									response.setError("success");
									response.setTriggers_txnID(TriggerTxnid);
								}
							}
						}
					} else {
						response.setError(" Your Address is wrong");
				//	}

					// }
					// else {
					// response.setError("Send can't be processed due to network
					// problem.. please try after sometime.");
					// }
				}
			/*else {
				response.setError("Insufficient Fund ");
			}*/
			}else {
				response.setError("You have Insufficient BTC balane for sending Triggers..");
			}
					
		} else {
			response.setError("Insufficient triggers Fund ");
		}
		}
	
		return response;
}




public synchronized PaymentProcessingResponseTo getClosingBalance(PaymentProcessingRequestTo ppReq){
	
	PaymentProcessingResponseTo response=new PaymentProcessingResponseTo();
	PaymentHistoryTo paymentHistoryTo=this.paymentHistService.getPaymentHistory(ppReq);
	response.setClosing_btc_bal(paymentHistoryTo.getClosingBtcBalance());
	response.setClosing_fiat_bal(paymentHistoryTo.getClosingFiatBalance());
	response.setClosingBccBalance(paymentHistoryTo.getClosingBccBalance());
	response.setClosingEthBalance(paymentHistoryTo.getClosingEthBalance());
	response.setClosingHCXBalance(paymentHistoryTo.getClosingHcxBalance());
	response.setClosingIECBalance(paymentHistoryTo.getClosingIecBalance());
	
	response.setClosingLtcBalance(paymentHistoryTo.getClosingLtcBalance());
	response.setClosingDiamBalance(paymentHistoryTo.getClosingDiamBalance());
	response.setClosingTriggersBalance(paymentHistoryTo.getClosingTriggersBalance());
	response.setClosingTrigxBalance(paymentHistoryTo.getClosingTrigxBalance());
	
	//bsv
	response.setClosingBsvBalance(paymentHistoryTo.getClosingBsvBalance());
	response.setClosingEtcBalance(paymentHistoryTo.getClosingEtcBalance());
	
	return response;
	
}



public synchronized CustomerResponseTo getCustomerBalance(CustomerRequestTo rar){
	CustomerResponseTo response=new CustomerResponseTo();
	CustomerLedgerTo customerLedger=customerLedService.customerLedgerList(rar);
	response.setFiat_balance(customerLedger.getFiatBalance());
	response.setBtc_balance(customerLedger.getBtcBalance());
	response.setBuyBtc(customerLedger.getBuyBtc());
	response.setSellBtc(customerLedger.getSellBtc());
	response.setBcc_balance(customerLedger.getBccBalance());
	response.setBuyBcc(customerLedger.getBuyBcc());
	response.setSellBcc(customerLedger.getSellBcc());
	response.setEth_balance(customerLedger.getEthBalance());
	response.setBuyEth(customerLedger.getBuyEth()); 
	response.setSellEth(customerLedger.getSellEth());
	response.setHcx_balance(customerLedger.getHcx_balance());
	response.setBuyhcx(customerLedger.getBuyhcx());
	response.setSellhcx(customerLedger.getSellhcx());
	response.setIec_balance(customerLedger.getIec_balance());
	response.setBuyIec(customerLedger.getBuyIec());
	response.setSellIec(customerLedger.getSellIec());
	response.setLtc_balance(customerLedger.getLtc_balance());
	response.setBuyLtc(customerLedger.getBuyLtc());
	response.setSellLtc(customerLedger.getSellLtc());

	
	response.setTriggers_balance(customerLedger.getTriggers_balance());
	response.setBuyTriggers(customerLedger.getBuyTriggers());
	response.setSellTriggers(customerLedger.getSellTriggers());
	
	response.setTrigx_privKey(customerLedger.getTrigx_privKey());
	response.setTriggers_pubKey(customerLedger.getTrigx_pubKey());
	response.setTrigx_balance(customerLedger.getTrigx_balance());
	response.setBuytrigx(customerLedger.getBuytrigx());
	response.setSelltrigx(customerLedger.getSelltrigx());

	
	return response; 
	
  }
}
