package com.btc.client.api.to;

import java.io.Serializable;
import java.util.List;

import com.btc.client.jsonconverter.WalletJsonResInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class WalletResponseTO implements Serializable {

	private static final long serialVersionUID = 6249001176588145206L;

	private String address;
	private String transactionId;
	private String amountPresent;
	private String errorMessage;
	private String auditId;
	private String[] listAddress; 
	private List payList;
	private String isvalid;
	private WalletJsonResInner walletjsonresInner;
	private List<WalletJsonResInner> walletjsonresInnerList;
	private String confirmation;

	//For Trigger 
    private String hex;
	
	private String complete;
	

	public List getPayList() {
		return payList;
	}

	public void setPayList(List payList) {
		this.payList = payList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAmountPresent() {
		return amountPresent;
	}

	public void setAmountPresent(String amountPresent) {
		this.amountPresent = amountPresent;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String[] getListAddress() {
		return listAddress;
	}

	public void setListAddress(String[] listAddress) {
		this.listAddress = listAddress;
	}
  
	public WalletJsonResInner getWalletjsonresInner() {
		return walletjsonresInner;
	}

	public void setWalletjsonresInner(WalletJsonResInner walletjsonresInner) {
		this.walletjsonresInner = walletjsonresInner;
	}

	public List<WalletJsonResInner> getWalletjsonresInnerList() {
		return walletjsonresInnerList;
	}

	public void setWalletjsonresInnerList(List<WalletJsonResInner> walletjsonresInnerList) {
		this.walletjsonresInnerList = walletjsonresInnerList;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}
	
	
	
}
