package com.btc.adapter.dao.to;

import java.io.Serializable;

public class WalletHistoryTo implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private String TxnID;
	 private String customer_ID;
	 private String customer_name;
	 private String orderId;
	 private String debit_fiat_amount;
	 private String credit_fiat_amount;
	 private String debit_btc_amount;
	 private String credit_btc_amount;
	 private String fiat_txnID;
	 private String  btc_txnID;
	 private String closing_btc_bal;
	 private String closing_fiat_bal;
	 private String transaction_timestamp;
	 private String description;
	 private String action;
	 
	 private String txnCharge;
	 private String chargeSGST;
	 private String chargeCGST;
	 private String mining_fees;
	 private String currency;
	 
	 private String bcc_txnID;
	 private String eth_txnID;
	 private String hcx_txnID;

	 private String debit_bcc_amount;
	 private String credit_bcc_amount;
	 private String debit_eth_amount;
	 private String credit_eth_amount;
	 private String closing_bcc_Bal;
	 private String closing_eth_Bal;
	 
	 private String debit_hcx_amount;
	 private String credit_hcx_amount;
	 private String closing_hcx_Bal;
	 
	 private String fiatAmount;
	 
	 private String fromDate;
	 private String toDate;
	 private String pageNo;
	 private String txnCount;
	 private String noTxn;
	 
	 private String debit_etc_amount;
	 private String credit_etc_amount;
	 private String closing_etc_Bal;
	 private String etc_txnID;
	 
	 private String debit_bsv_amount;
	 private String credit_bsv_amount;
	 private String closing_bsv_Bal;
	 private String bsv_txnID;
	 
	public String getTxnID() {
		return TxnID;
	}
	public void setTxnID(String txnID) {
		TxnID = txnID;
	}
	public String getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDebit_fiat_amount() {
		return debit_fiat_amount;
	}
	public void setDebit_fiat_amount(String debit_fiat_amount) {
		this.debit_fiat_amount = debit_fiat_amount;
	}
	public String getCredit_fiat_amount() {
		return credit_fiat_amount;
	}
	public void setCredit_fiat_amount(String credit_fiat_amount) {
		this.credit_fiat_amount = credit_fiat_amount;
	}
	public String getDebit_btc_amount() {
		return debit_btc_amount;
	}
	public void setDebit_btc_amount(String debit_btc_amount) {
		this.debit_btc_amount = debit_btc_amount;
	}
	public String getCredit_btc_amount() {
		return credit_btc_amount;
	}
	public void setCredit_btc_amount(String credit_btc_amount) {
		this.credit_btc_amount = credit_btc_amount;
	}
	public String getFiat_txnID() {
		return fiat_txnID;
	}
	public void setFiat_txnID(String fiat_txnID) {
		this.fiat_txnID = fiat_txnID;
	}
	public String getBtc_txnID() {
		return btc_txnID;
	}
	public void setBtc_txnID(String btc_txnID) {
		this.btc_txnID = btc_txnID;
	}
	public String getClosing_btc_bal() {
		return closing_btc_bal;
	}
	public void setClosing_btc_bal(String closing_btc_bal) {
		this.closing_btc_bal = closing_btc_bal;
	}
	public String getClosing_fiat_bal() {
		return closing_fiat_bal;
	}
	public void setClosing_fiat_bal(String closing_fiat_bal) {
		this.closing_fiat_bal = closing_fiat_bal;
	}
	public String getTransaction_timestamp() {
		return transaction_timestamp;
	}
	public void setTransaction_timestamp(String transaction_timestamp) {
		this.transaction_timestamp = transaction_timestamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTxnCharge() {
		return txnCharge;
	}
	public void setTxnCharge(String txnCharge) {
		this.txnCharge = txnCharge;
	}
	public String getChargeSGST() {
		return chargeSGST;
	}
	public void setChargeSGST(String chargeSGST) {
		this.chargeSGST = chargeSGST;
	}
	public String getChargeCGST() {
		return chargeCGST;
	}
	public void setChargeCGST(String chargeCGST) {
		this.chargeCGST = chargeCGST;
	}
	public String getMining_fees() {
		return mining_fees;
	}
	public void setMining_fees(String mining_fees) {
		this.mining_fees = mining_fees;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBcc_txnID() {
		return bcc_txnID;
	}
	public void setBcc_txnID(String bcc_txnID) {
		this.bcc_txnID = bcc_txnID;
	}
	public String getEth_txnID() {
		return eth_txnID;
	}
	public void setEth_txnID(String eth_txnID) {
		this.eth_txnID = eth_txnID;
	}
	public String getDebit_bcc_amount() {
		return debit_bcc_amount;
	}
	public void setDebit_bcc_amount(String debit_bcc_amount) {
		this.debit_bcc_amount = debit_bcc_amount;
	}
	public String getCredit_bcc_amount() {
		return credit_bcc_amount;
	}
	public void setCredit_bcc_amount(String credit_bcc_amount) {
		this.credit_bcc_amount = credit_bcc_amount;
	}
	public String getDebit_eth_amount() {
		return debit_eth_amount;
	}
	public void setDebit_eth_amount(String debit_eth_amount) {
		this.debit_eth_amount = debit_eth_amount;
	}
	public String getCredit_eth_amount() {
		return credit_eth_amount;
	}
	public void setCredit_eth_amount(String credit_eth_amount) {
		this.credit_eth_amount = credit_eth_amount;
	}
	public String getClosing_bcc_Bal() {
		return closing_bcc_Bal;
	}
	public void setClosing_bcc_Bal(String closing_bcc_Bal) {
		this.closing_bcc_Bal = closing_bcc_Bal;
	}
	public String getClosing_eth_Bal() {
		return closing_eth_Bal;
	}
	public void setClosing_eth_Bal(String closing_eth_Bal) {
		this.closing_eth_Bal = closing_eth_Bal;
	}
	
	public String getHcx_txnID() {
		return hcx_txnID;
	}
	public void setHcx_txnID(String hcx_txnID) {
		this.hcx_txnID = hcx_txnID;
	}
	public String getDebit_hcx_amount() {
		return debit_hcx_amount;
	}
	public void setDebit_hcx_amount(String debit_hcx_amount) {
		this.debit_hcx_amount = debit_hcx_amount;
	}
	
	public String getCredit_hcx_amount() {
		return credit_hcx_amount;
	}
	
	public void setCredit_hcx_amount(String credit_hcx_amount) {
		this.credit_hcx_amount = credit_hcx_amount;
	}
	
	public String getClosing_hcx_Bal() {
		return closing_hcx_Bal;
	}
	public void setClosing_hcx_Bal(String closing_hcx_Bal) {
		this.closing_hcx_Bal = closing_hcx_Bal;
	}
	
	public String getFiatAmount() {
		return fiatAmount;
	}
	public void setFiatAmount(String fiatAmount) {
		this.fiatAmount = fiatAmount;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getTxnCount() {
		return txnCount;
	}
	public void setTxnCount(String txnCount) {
		this.txnCount = txnCount;
	}
	public String getNoTxn() {
		return noTxn;
	}
	public void setNoTxn(String noTxn) {
		this.noTxn = noTxn;
	}
	public String getDebit_etc_amount() {
		return debit_etc_amount;
	}
	public void setDebit_etc_amount(String debit_etc_amount) {
		this.debit_etc_amount = debit_etc_amount;
	}
	public String getCredit_etc_amount() {
		return credit_etc_amount;
	}
	public void setCredit_etc_amount(String credit_etc_amount) {
		this.credit_etc_amount = credit_etc_amount;
	}
	public String getClosing_etc_Bal() {
		return closing_etc_Bal;
	}
	public void setClosing_etc_Bal(String closing_etc_Bal) {
		this.closing_etc_Bal = closing_etc_Bal;
	}
	public String getEtc_txnID() {
		return etc_txnID;
	}
	public void setEtc_txnID(String etc_txnID) {
		this.etc_txnID = etc_txnID;
	}
	public String getDebit_bsv_amount() {
		return debit_bsv_amount;
	}
	public void setDebit_bsv_amount(String debit_bsv_amount) {
		this.debit_bsv_amount = debit_bsv_amount;
	}
	public String getCredit_bsv_amount() {
		return credit_bsv_amount;
	}
	public void setCredit_bsv_amount(String credit_bsv_amount) {
		this.credit_bsv_amount = credit_bsv_amount;
	}
	public String getClosing_bsv_Bal() {
		return closing_bsv_Bal;
	}
	public void setClosing_bsv_Bal(String closing_bsv_Bal) {
		this.closing_bsv_Bal = closing_bsv_Bal;
	}
	public String getBsv_txnID() {
		return bsv_txnID;
	}
	public void setBsv_txnID(String bsv_txnID) {
		this.bsv_txnID = bsv_txnID;
	}
	
	
	
	
	
}
