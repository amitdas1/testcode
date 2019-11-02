package com.btc.component.service;



import com.btc.adapter.dao.to.CustomerLedgerTo;

import btc.dao.CustomerLedgerDao;
import btc.to.CustomerRequestTo;

public class CustomerLedgerService {

	public CustomerLedgerTo customerLedgerTo;
	public CustomerLedgerDao customerLedgerDao;
	
	public CustomerLedgerTo getCustomerLedgerTo() {
		return customerLedgerTo;
	}

	public void setCustomerLedgerTo(CustomerLedgerTo customerLedgerTo) {
		this.customerLedgerTo = customerLedgerTo;
	}

	public void setCustomerLedgerDao(CustomerLedgerDao customerLedgerDao) {
		this.customerLedgerDao = customerLedgerDao;
	}
	
	public CustomerLedgerDao getCustomerLedgerDao() {
		return customerLedgerDao;
	}
	
	
	
	public synchronized CustomerLedgerTo customerLedgerList(CustomerRequestTo rar){
		customerLedgerTo.setCustomerId(rar.getCustomer_Id());
		customerLedgerTo = customerLedgerDao.getCustomerLedger(customerLedgerTo);
		
		return customerLedgerTo;
	}
}
