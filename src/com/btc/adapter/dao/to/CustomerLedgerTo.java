package com.btc.adapter.dao.to;

import java.io.Serializable;

public class CustomerLedgerTo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String transactionId;
	private String customerId;
	private String customerName;
	private String btcBalance;
	private String fiatBalance;
	private String buyBtc;
	private String sellBtc;
	private String privateKey;
	private String bccBalance;
	private String ethBalance;
	private String buyBcc;
	private String sellBcc;
	private String buyEth;
	private String sellEth;
	private String currency;
	private String hcx_balance;
	private String buyhcx;
	private String sellhcx;
	private String hcx_privKey;
	private String hcx_pubKey;
	
	/***  IEC member **/
	private String iec_balance;
	private String buyIec;
	private String sellIec;
	private String iec_privKey;
	private String iec_pubKey;
	
	/***  Litecoin member **/
	private String ltc_balance;
	private String buyLtc;
	private String sellLtc;
	
	
	/***  Diam member **/
	private String diam_balance;
	private String buyDiam;
	private String sellDiam;
	private String diam_privKey;
	private String diam_pubKey;
	
	
	/***  TRIG member **/
	private String triggers_balance;
	private String buyTriggers;
	private String sellTriggers;
	private String triggers_privKey;
	private String triggers_pubKey;
	
	/***  TRIGX member **/
	private String trigx_balance;
	private String buytrigx;
	private String selltrigx;
	private String trigx_privKey;
	private String trigx_pubKey;
	
	/***  etc member **/
	
	private String etcBalance;
	private String buyEtc;
	private String sellEtc;
	/***  bsv member **/
	private String bsvBalance;
	private String buyBsv;
	private String sellBsv;
	
	/***  ZEC member **/
	private String zecBalance;
	private String buyZec;
	private String sellZec;
	
	
	public CustomerLedgerTo(){}
	public void setTransactionId(String tid){
		this.transactionId = tid;
	}
	public void setCustomerId(String cid){
		this.customerId = cid;
	}
	public void setCustomerName(String cname){
		this.customerName = cname;
	}
	public void setBtcBalance(String bbal){
		this.btcBalance = bbal;
	}
	public void setFiatBalance(String fbal){
		this.fiatBalance = fbal;
	}
	public void setPrivateKey(String pkey){
		this.privateKey = pkey;
	}
	public String getTransactionId(){
		return this.transactionId;
	}
	public String getCustomerId(){
		return this.customerId;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	public String getBtcBalance(){
		return this.btcBalance;
	}
	public String getFiatBalance(){
		return this.fiatBalance;
	}
	
	public String getBuyBtc() {
		return buyBtc;
	}
	public void setBuyBtc(String buyBtc) {
		this.buyBtc = buyBtc;
	}
	public String getSellBtc() {
		return sellBtc;
	}
	public void setSellBtc(String sellBtc) {
		this.sellBtc = sellBtc;
	}
	public String getPrivateKey(){
		return this.privateKey;
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("");
		sb.append(this.transactionId);
		sb.append("$");
		sb.append(this.customerId);
		sb.append("$");
		sb.append(this.customerName);
		sb.append("$");
		//sb.append(this.privateKey);
		//sb.append("$");
		sb.append(this.fiatBalance);
		sb.append("$");
		sb.append(this.btcBalance);
		return sb.toString();
	}
	public String getBccBalance() {
		return bccBalance;
	}
	public void setBccBalance(String bbcBalance) {
		this.bccBalance = bbcBalance;
	}
	public String getEthBalance() {
		return ethBalance;
	}
	public void setEthBalance(String ethBalance) {
		this.ethBalance = ethBalance;
	}
	public String getBuyBcc() {
		return buyBcc;
	}
	public void setBuyBcc(String buyBcc) {
		this.buyBcc = buyBcc;
	}
	public String getSellBcc() {
		return sellBcc;
	}
	public void setSellBcc(String sellBcc) {
		this.sellBcc = sellBcc;
	}
	public String getBuyEth() {
		return buyEth;
	}
	public void setBuyEth(String buyEth) {
		this.buyEth = buyEth;
	}
	public String getSellEth() {
		return sellEth;
	}
	public void setSellEth(String sellEth) {
		this.sellEth = sellEth;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getHcx_balance() {
		return hcx_balance;
	}
	public void setHcx_balance(String hcx_balance) {
		this.hcx_balance = hcx_balance;
	}
	public String getBuyhcx() {
		return buyhcx;
	}
	public void setBuyhcx(String buyhcx) {
		this.buyhcx = buyhcx;
	}
	public String getSellhcx() {
		return sellhcx;
	}
	public void setSellhcx(String sellhcx) {
		this.sellhcx = sellhcx;
	}
	public String getHcx_privKey() {
		return hcx_privKey;
	}
	public void setHcx_privKey(String hcx_privKey) {
		this.hcx_privKey = hcx_privKey;
	}
	public String getHcx_pubKey() {
		return hcx_pubKey;
	}
	public void setHcx_pubKey(String hcx_pubKey) {
		this.hcx_pubKey = hcx_pubKey;
	}
	public String getIec_balance() {
		return iec_balance;
	}
	public void setIec_balance(String iec_balance) {
		this.iec_balance = iec_balance;
	}
	public String getBuyIec() {
		return buyIec;
	}
	public void setBuyIec(String buyIec) {
		this.buyIec = buyIec;
	}
	public String getSellIec() {
		return sellIec;
	}
	public void setSellIec(String sellIec) {
		this.sellIec = sellIec;
	}
	public String getIec_privKey() {
		return iec_privKey;
	}
	public void setIec_privKey(String iec_privKey) {
		this.iec_privKey = iec_privKey;
	}
	public String getIec_pubKey() {
		return iec_pubKey;
	}
	public void setIec_pubKey(String iec_pubKey) {
		this.iec_pubKey = iec_pubKey;
	}
	public String getLtc_balance() {
		return ltc_balance;
	}
	public void setLtc_balance(String ltc_balance) {
		this.ltc_balance = ltc_balance;
	}
	public String getBuyLtc() {
		return buyLtc;
	}
	public void setBuyLtc(String buyLtc) {
		this.buyLtc = buyLtc;
	}
	public String getSellLtc() {
		return sellLtc;
	}
	public void setSellLtc(String sellLtc) {
		this.sellLtc = sellLtc;
	}
	public String getDiam_balance() {
		return diam_balance;
	}
	public void setDiam_balance(String diam_balance) {
		this.diam_balance = diam_balance;
	}
	public String getBuyDiam() {
		return buyDiam;
	}
	public void setBuyDiam(String buyDiam) {
		this.buyDiam = buyDiam;
	}
	public String getSellDiam() {
		return sellDiam;
	}
	public void setSellDiam(String sellDiam) {
		this.sellDiam = sellDiam;
	}
	public String getDiam_privKey() {
		return diam_privKey;
	}
	public void setDiam_privKey(String diam_privKey) {
		this.diam_privKey = diam_privKey;
	}
	public String getDiam_pubKey() {
		return diam_pubKey;
	}
	public void setDiam_pubKey(String diam_pubKey) {
		this.diam_pubKey = diam_pubKey;
	}
	public String getTriggers_balance() {
		return triggers_balance;
	}
	public void setTriggers_balance(String triggers_balance) {
		this.triggers_balance = triggers_balance;
	}
	public String getBuyTriggers() {
		return buyTriggers;
	}
	public void setBuyTriggers(String buyTriggers) {
		this.buyTriggers = buyTriggers;
	}
	public String getSellTriggers() {
		return sellTriggers;
	}
	public void setSellTriggers(String sellTriggers) {
		this.sellTriggers = sellTriggers;
	}
	public String getTriggers_privKey() {
		return triggers_privKey;
	}
	public void setTriggers_privKey(String triggers_privKey) {
		this.triggers_privKey = triggers_privKey;
	}
	public String getTriggers_pubKey() {
		return triggers_pubKey;
	}
	public void setTriggers_pubKey(String triggers_pubKey) {
		this.triggers_pubKey = triggers_pubKey;
	}
	public String getTrigx_balance() {
		return trigx_balance;
	}
	public void setTrigx_balance(String trigx_balance) {
		this.trigx_balance = trigx_balance;
	}
	public String getBuytrigx() {
		return buytrigx;
	}
	public void setBuytrigx(String buytrigx) {
		this.buytrigx = buytrigx;
	}
	public String getSelltrigx() {
		return selltrigx;
	}
	public void setSelltrigx(String selltrigx) {
		this.selltrigx = selltrigx;
	}
	public String getTrigx_privKey() {
		return trigx_privKey;
	}
	public void setTrigx_privKey(String trigx_privKey) {
		this.trigx_privKey = trigx_privKey;
	}
	public String getTrigx_pubKey() {
		return trigx_pubKey;
	}
	public void setTrigx_pubKey(String trigx_pubKey) {
		this.trigx_pubKey = trigx_pubKey;
	}
	public String getEtcBalance() {
		return etcBalance;
	}
	public void setEtcBalance(String etcBalance) {
		this.etcBalance = etcBalance;
	}
	public String getBuyEtc() {
		return buyEtc;
	}
	public void setBuyEtc(String buyEtc) {
		this.buyEtc = buyEtc;
	}
	public String getSellEtc() {
		return sellEtc;
	}
	public void setSellEtc(String sellEtc) {
		this.sellEtc = sellEtc;
	}
	public String getBsvBalance() {
		return bsvBalance;
	}
	public void setBsvBalance(String bsvBalance) {
		this.bsvBalance = bsvBalance;
	}
	public String getBuyBsv() {
		return buyBsv;
	}
	public void setBuyBsv(String buyBsv) {
		this.buyBsv = buyBsv;
	}
	public String getSellBsv() {
		return sellBsv;
	}
	public void setSellBsv(String sellBsv) {
		this.sellBsv = sellBsv;
	}
	public String getZecBalance() {
		return zecBalance;
	}
	public void setZecBalance(String zecBalance) {
		this.zecBalance = zecBalance;
	}
	public String getBuyZec() {
		return buyZec;
	}
	public void setBuyZec(String buyZec) {
		this.buyZec = buyZec;
	}
	public String getSellZec() {
		return sellZec;
	}
	public void setSellZec(String sellZec) {
		this.sellZec = sellZec;
	}
	
	
	
}


