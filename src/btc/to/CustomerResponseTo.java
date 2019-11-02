package btc.to;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResponseTo {
	 
	private String Customer_Id;
	private String privateKey;
	private String btc_balance;
	private String fiat_balance;
	private String buyBtc;
	private String sellBtc;
	private String message;
	private String bcc_balance;
	private String eth_balance;
	private String buyBcc;
	private String sellBcc;
	private String buyEth;
	private String sellEth;
	private String hcx_balance;
	private String buyhcx;
	private String sellhcx;
	private String orderID;
	
	/***  Litecoin member **/
	private String ltc_balance;
	private String buyLtc;
	private String sellLtc;
	
	
	/***  IEC member **/
	private String iec_balance;
	private String buyIec;
	private String sellIec;
	private String iec_privKey;
	private String iec_pubKey;
	
	/***  Diam member **/
	private String diam_balance;
	private String buyDiam;
	private String sellDiam;
	private String diam_privKey;
	private String diam_pubKey;
	
	
	/***  TRIG member **/
	private String triggers_balance;
	private String buyTriggers;;
	private String sellTriggers;;
	private String triggers_privKey;
	private String triggers_pubKey;
	
	
	/***  TRIGX member **/
	private String trigx_balance;
	private String buytrigx;
	private String selltrigx;
	private String trigx_privKey;
	private String trigx_pubKey;
	
	/***  Bsv member **/
	private String bsv_balance;
	private String buyBsv;
	private String sellBsv;
	private String bsv_privKey;
	private String bsv_pubKey;
	
	
	private String etc_balance;
	private String buyEtc;
	private String sellEtc;
	
	/***  ZEC member **/
	private String zec_balance;
	private String buyZec;
	private String sellZec;
	private String zec_privKey;
	private String zec_pubKey;
	
	
	
	//corporate remit id,
		private int corporate_remit_id;
		private double insured_amount;
	
	public int getCorporate_remit_id() {
			return corporate_remit_id;
		}
		public void setCorporate_remit_id(int corporate_remit_id) {
			this.corporate_remit_id = corporate_remit_id;
		}
		public double getInsured_amount() {
			return insured_amount;
		}
		public void setInsured_amount(double insured_amount) {
			this.insured_amount = insured_amount;
		}
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getBtc_balance() {
		return btc_balance;
	}
	public void setBtc_balance(String btc_balance) {
		this.btc_balance = btc_balance;
	}
	public String getFiat_balance() {
		return fiat_balance;
	}
	public void setFiat_balance(String fiat_balance) {
		this.fiat_balance = fiat_balance;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getBcc_balance() {
		return bcc_balance;
	}
	public void setBcc_balance(String bcc_balance) {
		this.bcc_balance = bcc_balance;
	}
	public String getEth_balance() {
		return eth_balance;
	}
	public void setEth_balance(String eth_balance) {
		this.eth_balance = eth_balance;
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
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
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
	public String getBsv_balance() {
		return bsv_balance;
	}
	public void setBsv_balance(String bsv_balance) {
		this.bsv_balance = bsv_balance;
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
	public String getBsv_privKey() {
		return bsv_privKey;
	}
	public void setBsv_privKey(String bsv_privKey) {
		this.bsv_privKey = bsv_privKey;
	}
	public String getBsv_pubKey() {
		return bsv_pubKey;
	}
	public void setBsv_pubKey(String bsv_pubKey) {
		this.bsv_pubKey = bsv_pubKey;
	}
	public String getEtc_balance() {
		return etc_balance;
	}
	public void setEtc_balance(String etc_balance) {
		this.etc_balance = etc_balance;
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
	public String getZec_balance() {
		return zec_balance;
	}
	public void setZec_balance(String zec_balance) {
		this.zec_balance = zec_balance;
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
	public String getZec_privKey() {
		return zec_privKey;
	}
	public void setZec_privKey(String zec_privKey) {
		this.zec_privKey = zec_privKey;
	}
	public String getZec_pubKey() {
		return zec_pubKey;
	}
	public void setZec_pubKey(String zec_pubKey) {
		this.zec_pubKey = zec_pubKey;
	}
	
	
	
	
}
