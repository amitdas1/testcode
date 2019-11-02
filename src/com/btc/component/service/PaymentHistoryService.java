package com.btc.component.service;


import java.math.BigDecimal;

import com.btc.adapter.dao.to.PaymentHistoryTo;

import btc.dao.PaymentHistoryDao;
import btc.to.PaymentProcessingRequestTo;

public class PaymentHistoryService {

	public PaymentHistoryTo paymentHistoryTo;
	public PaymentHistoryDao paymentHistoryDao;
	 
	 public PaymentHistoryTo getPaymentHistoryTo() {
			return paymentHistoryTo;
		}
		public void setPaymentHistoryTo(PaymentHistoryTo paymentHistoryTo) {
			this.paymentHistoryTo = paymentHistoryTo;
		}
		public void setPaymentHistoryDao(PaymentHistoryDao paymentHistoryDao) {
			this.paymentHistoryDao = paymentHistoryDao;
		  }
		  public PaymentHistoryDao getPaymentHistoryDao() {
			return paymentHistoryDao;
		  }
		  
	 
	public String getMiningFees(String btc_amount) {
		// TODO Auto-generated method stub
		
	return 	this.paymentHistoryDao.getTxnMiningfees(btc_amount);
		//return null;
	}
	
	
	  public synchronized PaymentHistoryTo getPaymentHistory(PaymentProcessingRequestTo paymentRequestTo){
		  paymentHistoryTo.setCustomerId(paymentRequestTo.getCustomer_Id());
		  paymentHistoryTo = paymentHistoryDao.getPayment(paymentHistoryTo);
		  
		return paymentHistoryTo;
		  
	  }
	 

	 public String statusCall(String customerid) {
		 String x = paymentHistoryDao.statuscall(customerid);
	
		 return x;
	 }
	
	
	
	public synchronized int insertSendPaymentHistory(PaymentProcessingRequestTo rar){
		  
		  paymentHistoryTo.setCreditBtcAmount(null);
		  paymentHistoryTo.setDebitBtcAmount(null);
		  paymentHistoryTo.setCreditBccAmount(null);
		  paymentHistoryTo.setDebitBccAmount(null);
		  paymentHistoryTo.setCreditEthAmount(null);
		  paymentHistoryTo.setDebitEthAmount(null);
		  paymentHistoryTo.setCreditHcxAmount(null);
		  paymentHistoryTo.setDebitHcxAmount(null);
		  paymentHistoryTo.setBtcTransactionId(null);
		  paymentHistoryTo.setBccTransactionId(null);
		  paymentHistoryTo.setEthTransactionId(null);
		  paymentHistoryTo.setHcxTransactionId(null);
		  paymentHistoryTo.setCreditIecAmount(null);
		  paymentHistoryTo.setDebitIecAmount(null);
		  paymentHistoryTo.setIecTransactionId(null);
		  
		  paymentHistoryTo.setCreditDiamAmount(null);
		  paymentHistoryTo.setDebitDiamAmount(null);
		  paymentHistoryTo.setDiamTransactionId(null);

        paymentHistoryTo.setDebitLtcAmount(null);
		  paymentHistoryTo.setCreditLtcAmount(null);
		  paymentHistoryTo.setLtcTransactionId(null);
		  
		  
		  paymentHistoryTo.setDebitTriggersAmount(null);
		  paymentHistoryTo.setCreditTriggersAmount(null);
		  paymentHistoryTo.setTriggersTransactionId(null);
		  
		  paymentHistoryTo.setDebitTrigxAmount(null);
		  paymentHistoryTo.setCreditTrigxAmount(null);
		  paymentHistoryTo.setTrigxTransactionId(null);
		 //bsv
		  paymentHistoryTo.setCreditBsvAmount(null);
		  paymentHistoryTo.setDebitBsvAmount(null);
		  paymentHistoryTo.setBsvTransactionId(null);
		  
		  //Zec
		  paymentHistoryTo.setCreditZecAmount(null);
		  paymentHistoryTo.setDebitZecAmount(null);
		  paymentHistoryTo.setZecTransactionId(null);
		  
		  //etc
		  paymentHistoryTo.setCreditEtcAmount(null);
		  paymentHistoryTo.setDebitEtcAmount(null);
		  paymentHistoryTo.setEtcTransactionId(null);
		//diam
		  paymentHistoryTo.setDiamTransactionId(null);
		  paymentHistoryTo.setCreditDiamAmount(null);
		  paymentHistoryTo.setDebitDiamAmount(null);
		  //end
		  
		  System.out.println("customer ID :"+rar.getCustomer_Id());
		  if(rar.getCurrency().equals("btc")){
			  
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(rar.getTxnId());
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
			  
			  
		  }else if(rar.getCurrency().equals("bcc")){
			  
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(rar.getTxnId());
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
			  
		  }else if(rar.getCurrency().equals("eth")){
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(rar.getTxnId());
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
		  }
		  else if(rar.getCurrency().equals("etc")){
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEtcTransactionId(rar.getTxnId());
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setEthTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
		  }else if(rar.getCurrency().equals("ltc")){
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setDebitLtcAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditLtcAmount(null);
			  paymentHistoryTo.setLtcTransactionId(rar.getTxnId());
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
		  }else if(rar.getCurrency().equals("hcx")){
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(rar.getBtc_amount());
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(rar.getTxnId());
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
		  }
         else if(rar.getCurrency().equals("bsv")){
			  
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setBsvTransactionId(rar.getTxnId());
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  //diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
			  
		  }  
      

         else if(rar.getCurrency().equals("diam")){
			  
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(null);
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(null);
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  //diam
			  paymentHistoryTo.setDiamTransactionId(rar.getTxnId());
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCorporate_remit_id(rar.getCorporate_remit_id());
			  //end
		  }
		  
		  else if(rar.getCurrency().equals("triggers")){
			  paymentHistoryTo.setDebitTriggersAmount(rar.getBtc_amount());
			  paymentHistoryTo.setTriggersTransactionId(rar.getTxnId());
			  
		  }else if(rar.getCurrency().equals("trigx")){
			  paymentHistoryTo.setDebitTrigxAmount(rar.getBtc_amount());
			  paymentHistoryTo.setTrigxTransactionId(rar.getTxnId());
			  
		  }
		  
	     	 paymentHistoryTo.setCustomerId(rar.getCustomer_Id());
		//  paymentHistoryTo.setDebitBtcAmount(rar.getBtc_amount());
		//  paymentHistoryTo.setCreditBtcAmount(null);
		 
		  paymentHistoryTo.setDescription(rar.getDescription());
		  paymentHistoryTo.setAction(rar.getAction());
		  paymentHistoryTo.setCreditFiatAmount(null);
		  paymentHistoryTo.setDebitFiatAmount(null);
		  paymentHistoryTo.setFiatAmount(null);
		  paymentHistoryTo.setTxnCharge(null);
		  paymentHistoryTo.setChargeCGST(null);
		  paymentHistoryTo.setChargeSGST(null);
		  paymentHistoryTo.setFiatTransactionId(null);
		  paymentHistoryTo.setMining_fees(rar.getMining_fees());
		  paymentHistoryTo.setCurrency(rar.getCurrency());
		  paymentHistoryTo.setStatus("0");
		  paymentHistoryTo.setOrderID(null);
		 // paymentHistoryTo.setFiatTransactionId(rar.getInvoice_no());
		  int x = paymentHistoryDao.insertPaymentHistory(paymentHistoryTo);
		
		  return x;
		
	  }
	  
	
	//new ---------------------
	
	
	public synchronized int insertPaymentHistoryTriggerBtcDetails(PaymentProcessingRequestTo rar){
		  
		  paymentHistoryTo.setCreditBtcAmount(null);
		  paymentHistoryTo.setDebitBtcAmount(null);
		  paymentHistoryTo.setCreditBccAmount(null);
		  paymentHistoryTo.setDebitBccAmount(null);
		  paymentHistoryTo.setCreditEthAmount(null);
		  paymentHistoryTo.setDebitEthAmount(null);
		  paymentHistoryTo.setCreditHcxAmount(null);
		  paymentHistoryTo.setDebitHcxAmount(null);
		  paymentHistoryTo.setBtcTransactionId(null);
		  paymentHistoryTo.setBccTransactionId(null);
		  paymentHistoryTo.setEthTransactionId(null);
		  paymentHistoryTo.setHcxTransactionId(null);
		  paymentHistoryTo.setCreditIecAmount(null);
		  paymentHistoryTo.setDebitIecAmount(null);
		  paymentHistoryTo.setIecTransactionId(null);
		  paymentHistoryTo.setDebitTriggersAmount(null);
		  paymentHistoryTo.setCreditTriggersAmount(null);
		  paymentHistoryTo.setTriggersTransactionId(null);
		  
		  paymentHistoryTo.setDebitTrigxAmount(null);
		  paymentHistoryTo.setCreditTrigxAmount(null);
		  paymentHistoryTo.setTrigxTransactionId(null);
		
		  
		  System.out.println("customer ID :"+rar.getCustomer_Id());
		  if(rar.getCurrency().equals("btc")){
			  
			  paymentHistoryTo.setCreditBtcAmount(null);
			  paymentHistoryTo.setDebitBtcAmount(rar.getBtc_amount());
			  paymentHistoryTo.setCreditBccAmount(null);
			  paymentHistoryTo.setDebitBccAmount(null);
			  paymentHistoryTo.setCreditEthAmount(null);
			  paymentHistoryTo.setDebitEthAmount(null);
			  paymentHistoryTo.setCreditHcxAmount(null);
			  paymentHistoryTo.setDebitHcxAmount(null);		
			  paymentHistoryTo.setBtcTransactionId(rar.getTxnId());
			  paymentHistoryTo.setBccTransactionId(null);
			  paymentHistoryTo.setEthTransactionId(null);
			  paymentHistoryTo.setHcxTransactionId(null);
			  paymentHistoryTo.setCreditIecAmount(null);
			  paymentHistoryTo.setDebitIecAmount(null);
			  paymentHistoryTo.setIecTransactionId(null);
			  
			  paymentHistoryTo.setCreditEtcAmount(null);
			  paymentHistoryTo.setDebitEtcAmount(null);
			  paymentHistoryTo.setEtcTransactionId(null);
			  paymentHistoryTo.setCreditBsvAmount(null);
			  paymentHistoryTo.setDebitBsvAmount(null);
			  paymentHistoryTo.setBsvTransactionId(null);
			//diam
			  paymentHistoryTo.setDiamTransactionId(null);
			  paymentHistoryTo.setCreditDiamAmount(null);
			  paymentHistoryTo.setDebitDiamAmount(null);
			  //end
			  
			  
		  }
		  
		  else if(rar.getCurrency().equals("triggers")){
			  paymentHistoryTo.setDebitTriggersAmount(rar.getBtc_amount());
			  paymentHistoryTo.setTriggersTransactionId(rar.getTxnId());
			  
		  }else if(rar.getCurrency().equals("trigx")){
			  paymentHistoryTo.setDebitTrigxAmount(rar.getBtc_amount());
			  paymentHistoryTo.setTrigxTransactionId(rar.getTxnId());
			  
		  }
		  
	     	 paymentHistoryTo.setCustomerId(rar.getCustomer_Id());
		//  paymentHistoryTo.setDebitBtcAmount(rar.getBtc_amount());
		//  paymentHistoryTo.setCreditBtcAmount(null);
		 
		  paymentHistoryTo.setDescription(rar.getDescription());
		  paymentHistoryTo.setAction(rar.getAction());
		  paymentHistoryTo.setCreditFiatAmount(null);
		  paymentHistoryTo.setDebitFiatAmount(null);
		  paymentHistoryTo.setFiatAmount(null);
		  paymentHistoryTo.setTxnCharge(null);
		  paymentHistoryTo.setChargeCGST(null);
		  paymentHistoryTo.setChargeSGST(null);
		  paymentHistoryTo.setFiatTransactionId(null);
		  paymentHistoryTo.setMining_fees(rar.getMining_fees());
		  paymentHistoryTo.setCurrency(rar.getCurrency());
		  paymentHistoryTo.setStatus("0");
		  paymentHistoryTo.setOrderID(null);
		 // paymentHistoryTo.setFiatTransactionId(rar.getInvoice_no());
		  int x = paymentHistoryDao.insertPaymentHistoryTriggerBtcDetails(paymentHistoryTo);
		
		  return x;
		
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public /*synchronized*/ int rollBackcall(PaymentProcessingRequestTo rar){
	     System.out.println(rar.getBtc_amount());

	     BigDecimal val =new BigDecimal(rar.getBtc_amount());
	     System.out.println("val"+val);
	  //   BigDecimal val1 =new BigDecimal(rar.getMining_fees());
	   //  System.out.println("val"+val1);
	    // BigDecimal val2=val.add(val1);
	 //    System.out.println("Val: "+val2);
	    // String amount= String.valueOf(val2.setScale(10,BigDecimal.ROUND_DOWN));
	     
	     String amount= String.valueOf(val.setScale(10,BigDecimal.ROUND_DOWN));
	     
	     
	     System.out.println("Amount: "+amount);
	          paymentHistoryTo.setDebitBtcAmount(null);
	          paymentHistoryTo.setCreditBccAmount(null);
	          paymentHistoryTo.setDebitBccAmount(null);
	          paymentHistoryTo.setCreditEthAmount(null);
	          paymentHistoryTo.setDebitEthAmount(null);
	          paymentHistoryTo.setCreditHcxAmount(null);
	          paymentHistoryTo.setDebitHcxAmount(null);
	          paymentHistoryTo.setBtcTransactionId(null);
	          paymentHistoryTo.setBccTransactionId(null);
	          paymentHistoryTo.setEthTransactionId(null);
	          paymentHistoryTo.setHcxTransactionId(null);
	          paymentHistoryTo.setCreditIecAmount(null);
	          paymentHistoryTo.setDebitIecAmount(null);
	          paymentHistoryTo.setIecTransactionId(null);

	          paymentHistoryTo.setCreditDiamAmount(null);
	          paymentHistoryTo.setDebitDiamAmount(null);
	          paymentHistoryTo.setDiamTransactionId(null);

	          paymentHistoryTo.setDebitLtcAmount(null);
	          paymentHistoryTo.setCreditLtcAmount(null);
	          paymentHistoryTo.setLtcTransactionId(null);


	          paymentHistoryTo.setDebitTriggersAmount(null);
	          paymentHistoryTo.setCreditTriggersAmount(null);
	          paymentHistoryTo.setTriggersTransactionId(null);

	          paymentHistoryTo.setDebitTrigxAmount(null);
	          paymentHistoryTo.setCreditTrigxAmount(null);
	          paymentHistoryTo.setTrigxTransactionId(null);
	         //bsv
	          paymentHistoryTo.setCreditBsvAmount(null);
	          paymentHistoryTo.setDebitBsvAmount(null);
	          paymentHistoryTo.setBsvTransactionId(null);

	          //Zec
	          paymentHistoryTo.setCreditZecAmount(null);
	          paymentHistoryTo.setDebitZecAmount(null);
	          paymentHistoryTo.setZecTransactionId(null);

	          //etc
	          paymentHistoryTo.setCreditEtcAmount(null);
	          paymentHistoryTo.setDebitEtcAmount(null);
	          paymentHistoryTo.setEtcTransactionId(null);
	        //diam
	          paymentHistoryTo.setDiamTransactionId(null);
	          paymentHistoryTo.setCreditDiamAmount(null);
	          paymentHistoryTo.setDebitDiamAmount(null);
	          //end
	        /*
	         * Integer i=Integer.valueOf(rar.getBtc_amount()); System.out.println("iiii"+i);
	         */
	          System.out.println("customer ID :"+rar.getCustomer_Id());
	          if(rar.getCurrency().equals("btc")){

	              paymentHistoryTo.setCreditBtcAmount(amount);
	              paymentHistoryTo.setDebitBtcAmount(null);
	              paymentHistoryTo.setCreditBccAmount(null);
	              paymentHistoryTo.setDebitBccAmount(null);
	              paymentHistoryTo.setCreditEthAmount(null);
	              paymentHistoryTo.setDebitEthAmount(null);
	              paymentHistoryTo.setCreditHcxAmount(null);
	              paymentHistoryTo.setDebitHcxAmount(null);
	              paymentHistoryTo.setBtcTransactionId(rar.getTxnId());
	              paymentHistoryTo.setBccTransactionId(null);
	              paymentHistoryTo.setEthTransactionId(null);
	              paymentHistoryTo.setHcxTransactionId(null);
	              paymentHistoryTo.setCreditIecAmount(null);
	              paymentHistoryTo.setDebitIecAmount(null);
	              paymentHistoryTo.setIecTransactionId(null);

	              paymentHistoryTo.setCreditEtcAmount(null);
	              paymentHistoryTo.setDebitEtcAmount(null);
	              paymentHistoryTo.setEtcTransactionId(null);
	              paymentHistoryTo.setCreditBsvAmount(null);
	              paymentHistoryTo.setDebitBsvAmount(null);
	              paymentHistoryTo.setBsvTransactionId(null);
	            //diam
	              paymentHistoryTo.setDiamTransactionId(null);
	              paymentHistoryTo.setCreditDiamAmount(null);
	              paymentHistoryTo.setDebitDiamAmount(null);
	              //end


	          }

	          else if(rar.getCurrency().equals("triggers")){
	              paymentHistoryTo.setDebitTriggersAmount(null);
	              paymentHistoryTo.setCreditTriggersAmount(amount);
	              paymentHistoryTo.setTriggersTransactionId(rar.getTxnId());

	          }else if(rar.getCurrency().equals("trigx")){
	              paymentHistoryTo.setDebitTrigxAmount(rar.getBtc_amount());
	             // paymentHistoryTo.setCreditTrigxAmount(rar.getBtc_amount());
	              paymentHistoryTo.setTrigxTransactionId(rar.getTxnId());

	          }

	              paymentHistoryTo.setCustomerId(rar.getCustomer_Id());
	        //  paymentHistoryTo.setDebitBtcAmount(rar.getBtc_amount());
	        //  paymentHistoryTo.setCreditBtcAmount(null);

	          paymentHistoryTo.setDescription(rar.getDescription());
	          paymentHistoryTo.setAction("rollback");
	          paymentHistoryTo.setCreditFiatAmount(null);
	          paymentHistoryTo.setDebitFiatAmount(null);
	          paymentHistoryTo.setFiatAmount(null);
	          paymentHistoryTo.setTxnCharge(null);
	          paymentHistoryTo.setChargeCGST(null);
	          paymentHistoryTo.setChargeSGST(null);
	          paymentHistoryTo.setFiatTransactionId(null);
	          paymentHistoryTo.setMining_fees(null);
	          paymentHistoryTo.setCurrency(rar.getCurrency());
	          paymentHistoryTo.setStatus("0");
	          paymentHistoryTo.setOrderID(null);
	         // paymentHistoryTo.setFiatTransactionId(rar.getInvoice_no());
	          int x = paymentHistoryDao.insertPaymentHistory(paymentHistoryTo);

	          return x;

	        /*PaymentHistoryThread paymentThread = new PaymentHistoryThread(paymentHistoryTo, paymentHistoryDao,0);
	          paymentThread.start();
	          */
	      }
	
	
	public  int updatePaymentHistoryForNodeBtcTransactionid(PaymentProcessingRequestTo rar /*String txno,String cusid,String strTxnID*/){
		  paymentHistoryTo.setBtcTransactionId(rar.getTxnId());
		  System.out.println("Btctxnid "+rar.getTxnId());
		 return  paymentHistoryDao.updatePaymentHistoyBtcNodeTxid(paymentHistoryTo);
		  
			
		}
}
