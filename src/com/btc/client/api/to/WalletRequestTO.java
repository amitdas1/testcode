package com.btc.client.api.to;

import java.io.Serializable;

public class WalletRequestTO implements Serializable {

	private static final long serialVersionUID = 5765426349265255198L;

	private String address;
	private Integer count;
	private String amountToTransfer;
	private String auditId;
	private String account;
	private String currency;
	
	//For Trigger
	private String unsigned_tx;
	private String hex;
	
	
	
	
	
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getAmountToTransfer() {
		return amountToTransfer;
	}

	public void setAmountToTransfer(String amountToTransfer) {
		this.amountToTransfer = amountToTransfer;
	}

	public String getAuditId() {
		return auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUnsigned_tx() {
		return unsigned_tx;
	}

	public void setUnsigned_tx(String unsigned_tx) {
		this.unsigned_tx = unsigned_tx;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}
	
	
}
