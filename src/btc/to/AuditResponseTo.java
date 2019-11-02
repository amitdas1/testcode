package btc.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AuditResponseTo {

	private String invoiceNo;
	private String paidAmount;
	private String confirmation;
	private String bill_Amt;
	private String errormsg;
	
	
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	public String getBill_Amt() {
		return bill_Amt;
	}
	public void setBill_Amt(String bill_Amt) {
		this.bill_Amt = bill_Amt;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	
	
	
}
