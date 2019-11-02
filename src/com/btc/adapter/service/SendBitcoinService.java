package com.btc.adapter.service;


import com.btc.client.api.controller.ControllerFactory;
import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;
import com.btc.component.service.PaymentHistoryService;

import btc.to.PaymentProcessingRequestTo;

public class SendBitcoinService {

	
	PaymentHistoryService paymentHistService;
	
	
	public SendBitcoinService(PaymentHistoryService paymentHistService) {
		// TODO Auto-generated constructor stub
		
		this.paymentHistService=paymentHistService;
	}
	
	
	
	public String toOtherWalletFees(String btc_amount) {
		// TODO Auto-generated method stub
		
		return this.paymentHistService.getMiningFees(btc_amount);
	//	return null;
	}
	
	public String getWalletBalance(PaymentProcessingRequestTo paymentPReq) {
		// TODO Auto-generated method stub
		
		IWalletRequestController walletRequestController = (IWalletRequestController)ControllerFactory.provideWalletController();
		WalletRequestTO walletRequestTo = new WalletRequestTO(); 
		walletRequestTo.setAuditId(paymentPReq.getCustomer_Id());	
		walletRequestTo.setCurrency(paymentPReq.getCurrency());
		WalletResponseTO walletResponse = walletRequestController.getBalanceOverAll(walletRequestTo);
		return walletResponse.getAmountPresent();
	}
	public WalletResponseTO getAddressBtcCheck(PaymentProcessingRequestTo paymentPReq) {
		// TODO Auto-generated method stub
		
		IWalletRequestController walletRequestController = (IWalletRequestController)ControllerFactory.provideWalletController();
		WalletRequestTO walletRequestTO = new WalletRequestTO();
		//walletRequestTO.setAuditId(paymentPReq.getCustomer_Id());
		walletRequestTO.setCurrency("btc");
		walletRequestTO.setAddress(paymentPReq.getToadd());
		WalletResponseTO walletResponseTO = walletRequestController.validAddressCheck(walletRequestTO);
		return walletResponseTO;	
	}
	
	
	public String toBCHOtherWalletTrasnsfer(PaymentProcessingRequestTo paymentPReq) {
		// TODO Auto-generated method stub
		IWalletRequestController walletRequestController = (IWalletRequestController)ControllerFactory.provideWalletController();
		//WalletRequestTO walletRequestTo = new WalletRequestTO(); 
		//walletRequestTo.setAuditId(paymentPReq.getCustomer_Id());	
		//walletRequestTo.setCurrency(paymentPReq.getCurrency());
		
		WalletRequestTO walletRequestTO = new WalletRequestTO();  
		walletRequestTO.setAuditId(paymentPReq.getCustomer_Id());
		walletRequestTO.setAmountToTransfer(""+Double.parseDouble(paymentPReq.getBtc_amount()));
		walletRequestTO.setAddress(paymentPReq.getToadd());
		walletRequestTO.setCurrency(paymentPReq.getCurrency());
		WalletResponseTO walletResponseTO = walletRequestController.sendToAddress(walletRequestTO);
		System.out.println("TxnID:"+walletResponseTO.getTransactionId());
		WalletResponseTO walletResponseTo = walletRequestController.getTransaction(walletRequestTO, walletResponseTO.getTransactionId());
		String strTxnID=walletResponseTO.getTransactionId();
		System.out.println("TxnID :"+strTxnID);  
					
		return strTxnID;
  
}
	
	

	
	
}
