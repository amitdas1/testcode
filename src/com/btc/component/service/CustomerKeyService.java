package com.btc.component.service;



import com.btc.adapter.dao.to.CustomerKeysTo;

import btc.dao.CustomerKeysDao;
import btc.to.PaymentProcessingRequestTo;

public class CustomerKeyService {

	public CustomerKeysDao customerKeysDao;
	public CustomerKeysTo customerKeysTo;

	
	
	public CustomerKeysDao getCustomerKeysDao() {
		return customerKeysDao;
	}
	public void setCustomerKeysDao(CustomerKeysDao customerKeysDao) {
		this.customerKeysDao = customerKeysDao;
	}
	public CustomerKeysTo getCustomerKeysTo() {
		return customerKeysTo;
	}
	public void setCustomerKeysTo(CustomerKeysTo customerKeysTo) {
		this.customerKeysTo = customerKeysTo;
	}
	
	
	
	
	 public String getLastTransaction() {
			// TODO Auto-generated method stub
			return this.customerKeysDao.getLastTxnID();
		 }

	 
	 public synchronized int insertCustomerKeys(PaymentProcessingRequestTo pprt){
			// customerid, fromadd, toadd, btcAmount, txnId, status, action
			
			customerKeysTo.setCustomerid(pprt.getCustomer_Id());
			customerKeysTo.setFromadd(pprt.getFromadd());
			customerKeysTo.setToadd(pprt.getToadd());
			customerKeysTo.setBtcAmount(pprt.getBtc_amount());
			customerKeysTo.setTxnId(pprt.getTxnId());
			customerKeysTo.setStatus(pprt.getStatus());
			customerKeysTo.setAction(pprt.getAction());
		 	customerKeysTo.setCurrency(pprt.getCurrency());
			
			int x = customerKeysDao.insertCustomerKeyDao(customerKeysTo);
			
			return x;
			
		}
	 
	 
	 
	 public synchronized int insertCustomerTriggerKeys(PaymentProcessingRequestTo pprt){
			// customerid, fromadd, toadd, btcAmount, txnId, status, action
			
			customerKeysTo.setCustomerid(pprt.getCustomer_Id());
			customerKeysTo.setFromadd(pprt.getFromadd());
			customerKeysTo.setToadd(pprt.getToadd());
			customerKeysTo.setBtcAmount(pprt.getBtc_amount());
			customerKeysTo.setTxnId(pprt.getTxnId());
			customerKeysTo.setStatus(pprt.getStatus());
			customerKeysTo.setAction(pprt.getAction());
		 	customerKeysTo.setCurrency(pprt.getCurrency());
			
			int x = customerKeysDao.insertTRIGGERCustomerKeyDao(customerKeysTo);
			
			return x;
			
		}
	 
	 
	 public String getreceiveKeyFromCustomerTriggers(String customer_Id) {
			// TODO Auto-generated method stub
			 return customerKeysDao.getreceiveKeyFromCustomerTriggers(customer_Id);
		}
	 
	 
	 
	 
	  
}
