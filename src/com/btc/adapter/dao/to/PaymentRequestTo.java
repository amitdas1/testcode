package com.btc.adapter.dao.to;

import java.io.Serializable;

public class PaymentRequestTo implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String invoice_no;
private String customer_id;
private String order_no;
private String reference_no;
private String amount;
private String status;
private String timestamp;
private String message;
private String currency;


public String getInvoice_no() {
	return invoice_no;
}
public void setInvoice_no(String invoice_no) {
	this.invoice_no = invoice_no;
}
public String getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(String customer_id) {
	this.customer_id = customer_id;
}
public String getOrder_no() {
	return order_no;
}
public void setOrder_no(String order_no) {
	this.order_no = order_no;
}
public String getReference_no() {
	return reference_no;
}
public void setReference_no(String reference_no) {
	this.reference_no = reference_no;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTimestamp() {
	return timestamp;
}
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}




}
