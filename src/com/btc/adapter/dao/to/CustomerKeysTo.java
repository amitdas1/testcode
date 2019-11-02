package com.btc.adapter.dao.to;

public class CustomerKeysTo {
	
	// customerid, fromadd, toadd, btcAmount, txnId, status, action
	public String customerid;
	public String fromadd;
	public String toadd;
	public String btcAmount;
	public String txnId;
	public String status;
	public String action;
	private String currency;
	private String senderId;
	private String senderPrivateKey;
	private String senderPublicKey; 
	private String recvId;
	private String receiverPrivateKey;	
	private String receiverPublicKey;
	private String hcxLedger;
	private String country;
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getFromadd() {
		return fromadd;
	}
	public void setFromadd(String fromadd) {
		this.fromadd = fromadd;
	}
	public String getToadd() {
		return toadd;
	}
	public void setToadd(String toadd) {
		this.toadd = toadd;
	}
	public String getBtcAmount() {
		return btcAmount;
	}
	public void setBtcAmount(String btcAmount) {
		this.btcAmount = btcAmount;
	}
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSenderPrivateKey() {
		return senderPrivateKey;
	}
	public void setSenderPrivateKey(String senderPrivateKey) {
		this.senderPrivateKey = senderPrivateKey;
	}
	public String getSenderPublicKey() {
		return senderPublicKey;
	}
	public void setSenderPublicKey(String senderPublicKey) {
		this.senderPublicKey = senderPublicKey;
	}
	public String getReceiverPrivateKey() {
		return receiverPrivateKey;
	}
	public void setReceiverPrivateKey(String receiverPrivateKey) {
		this.receiverPrivateKey = receiverPrivateKey;
	}
	public String getReceiverPublicKey() {
		return receiverPublicKey;
	}
	public void setReceiverPublicKey(String receiverPublicKey) {
		this.receiverPublicKey = receiverPublicKey;
	}
	public String getHcxLedger() {
		return hcxLedger;
	}
	public void setHcxLedger(String hcxLedger) {
		this.hcxLedger = hcxLedger;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getRecvId() {
		return recvId;
	}
	public void setRecvId(String recvId) {
		this.recvId = recvId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	

}
