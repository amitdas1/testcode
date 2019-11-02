package btc.to;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonInclude(Include.NON_NULL)
public class Result {
	
	private String address;
	private String txnHash;
	private String balance;
	private String message;
	private String invoiceNo;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTxnHash() {
		return txnHash;
	}
	public void setTxnHash(String txnHash) {
		this.txnHash = txnHash;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	
	

}
