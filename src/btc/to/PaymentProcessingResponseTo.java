package btc.to;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentProcessingResponseTo {
	
	
	private String Customer_Id;
	private String transaction_Id;
	private String orderId;
	private String debit_fiat_amount;
	private String credit_fiat_amount;
	private String debit_btc_amount;
	private String credit_btc_amount;
	private String fiat_txnID;
	private String btc_txnID;
	private String bcc_txnID;
	private String eth_txnID;
	private String hcx_txnID;
	//private String iec_txnID;
	public String closing_btc_bal;
	public String closing_fiat_bal;
	public String description;
	public String action;
	private String Transaction_timestamp;
	private String error;
	private String publicKey;
	private String txnCount;
	
	private String txnCharge;
	private String chargeSGST;
	private String chargeCGST;
	private String mining_fees;
	private String currency;
	private String BaseCurrency;

	private String debitBccAmount;
	private String creditBccAmount;
	private String debitEthAmount;
	private String creditEthAmount;
	private String debitHCXAmount;
	private String creditHCXAmount;
	private String closingBccBalance;
	private String closingEthBalance;
	private String closingHCXBalance;
	
      /** Litecoin Member  *///
	private String ltc_txnID;
	private String debitLtcAmount;
	private String creditLtcAmount;
	private String closingLtcBalance;
	/** IEC Member  *///
	private String iec_txnID;
	private String debitIECAmount;
	private String creditIECAmount;
	private String closingIECBalance;
	
	/** Diam Member  *///
	private String diam_txnID;
	private String debitDiamAmount;
	private String creditDiamAmount;
	private String closingDiamBalance;

	/** Triggers Member  *///
	private String triggers_txnID;
	private String debitTriggersAmount;
	private String creditTriggersAmount;
	private String closingTriggersBalance;

	/** Trigx Member  *///
	private String trigx_txnID;
	private String debitTrigxAmount;
	private String creditTrigxAmount;
	private String closingTrigxBalance;
	
	private String requestAmount;
	private String requestPrice;
	private String TradeId;
	private String Offer_Id;
	private String status;
	private String price;

	//two variable adding
	private String offer_Amount;
	private String offer_Price;

	
	/** BSV Member  *///
	private String bsv_txnID;
	private String debitBsvAmount;
	private String creditBsvAmount;
	private String closingBsvBalance;
	
	/** ETC Member  *///
	private String etc_txnID;
	private String debitEtcAmount;
	private String creditEtcAmount;
	private String closingEtcBalance;
	
	/**ZEC Member  *///
	private String zec_txnID;
	private String debitZecAmount;
	private String creditZecAmount;
	private String closingZecBalance;
 
	private String message;
	
	//corporate remit id,
		/*private int corporate_remit_id;
		private double insured_amount;*/
	
	/*public int getCorporate_remit_id() {
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
*/

	public String getCustomer_Id() {
		return Customer_Id;
	}


	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}


	public String getTransaction_Id() {
		return transaction_Id;
	}


	public void setTransaction_Id(String transaction_Id) {
		this.transaction_Id = transaction_Id;
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


	public String getHcx_txnID() {
		return hcx_txnID;
	}


	public void setHcx_txnID(String hcx_txnID) {
		this.hcx_txnID = hcx_txnID;
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


	public String getTransaction_timestamp() {
		return Transaction_timestamp;
	}


	public void setTransaction_timestamp(String transaction_timestamp) {
		Transaction_timestamp = transaction_timestamp;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getPublicKey() {
		return publicKey;
	}


	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}


	public String getTxnCount() {
		return txnCount;
	}


	public void setTxnCount(String txnCount) {
		this.txnCount = txnCount;
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


	public String getDebitBccAmount() {
		return debitBccAmount;
	}


	public void setDebitBccAmount(String debitBccAmount) {
		this.debitBccAmount = debitBccAmount;
	}


	public String getCreditBccAmount() {
		return creditBccAmount;
	}


	public void setCreditBccAmount(String creditBccAmount) {
		this.creditBccAmount = creditBccAmount;
	}


	public String getDebitEthAmount() {
		return debitEthAmount;
	}


	public void setDebitEthAmount(String debitEthAmount) {
		this.debitEthAmount = debitEthAmount;
	}


	public String getCreditEthAmount() {
		return creditEthAmount;
	}


	public void setCreditEthAmount(String creditEthAmount) {
		this.creditEthAmount = creditEthAmount;
	}


	public String getDebitHCXAmount() {
		return debitHCXAmount;
	}


	public void setDebitHCXAmount(String debitHCXAmount) {
		this.debitHCXAmount = debitHCXAmount;
	}


	public String getCreditHCXAmount() {
		return creditHCXAmount;
	}


	public void setCreditHCXAmount(String creditHCXAmount) {
		this.creditHCXAmount = creditHCXAmount;
	}


	public String getClosingBccBalance() {
		return closingBccBalance;
	}


	public void setClosingBccBalance(String closingBccBalance) {
		this.closingBccBalance = closingBccBalance;
	}


	public String getClosingEthBalance() {
		return closingEthBalance;
	}


	public void setClosingEthBalance(String closingEthBalance) {
		this.closingEthBalance = closingEthBalance;
	}


	public String getClosingHCXBalance() {
		return closingHCXBalance;
	}


	public void setClosingHCXBalance(String closingHCXBalance) {
		this.closingHCXBalance = closingHCXBalance;
	}


	public String getLtc_txnID() {
		return ltc_txnID;
	}


	public void setLtc_txnID(String ltc_txnID) {
		this.ltc_txnID = ltc_txnID;
	}


	public String getDebitLtcAmount() {
		return debitLtcAmount;
	}


	public void setDebitLtcAmount(String debitLtcAmount) {
		this.debitLtcAmount = debitLtcAmount;
	}


	public String getCreditLtcAmount() {
		return creditLtcAmount;
	}


	public void setCreditLtcAmount(String creditLtcAmount) {
		this.creditLtcAmount = creditLtcAmount;
	}


	public String getClosingLtcBalance() {
		return closingLtcBalance;
	}


	public void setClosingLtcBalance(String closingLtcBalance) {
		this.closingLtcBalance = closingLtcBalance;
	}


	public String getIec_txnID() {
		return iec_txnID;
	}


	public void setIec_txnID(String iec_txnID) {
		this.iec_txnID = iec_txnID;
	}


	public String getDebitIECAmount() {
		return debitIECAmount;
	}


	public void setDebitIECAmount(String debitIECAmount) {
		this.debitIECAmount = debitIECAmount;
	}


	public String getCreditIECAmount() {
		return creditIECAmount;
	}


	public void setCreditIECAmount(String creditIECAmount) {
		this.creditIECAmount = creditIECAmount;
	}


	public String getClosingIECBalance() {
		return closingIECBalance;
	}


	public void setClosingIECBalance(String closingIECBalance) {
		this.closingIECBalance = closingIECBalance;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDiam_txnID() {
		return diam_txnID;
	}


	public void setDiam_txnID(String diam_txnID) {
		this.diam_txnID = diam_txnID;
	}


	public String getDebitDiamAmount() {
		return debitDiamAmount;
	}


	public void setDebitDiamAmount(String debitDiamAmount) {
		this.debitDiamAmount = debitDiamAmount;
	}


	public String getCreditDiamAmount() {
		return creditDiamAmount;
	}


	public void setCreditDiamAmount(String creditDiamAmount) {
		this.creditDiamAmount = creditDiamAmount;
	}


	public String getClosingDiamBalance() {
		return closingDiamBalance;
	}


	public void setClosingDiamBalance(String closingDiamBalance) {
		this.closingDiamBalance = closingDiamBalance;
	}


	public String getBaseCurrency() {
		return BaseCurrency;
	}


	public void setBaseCurrency(String baseCurrency) {
		BaseCurrency = baseCurrency;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getTriggers_txnID() {
		return triggers_txnID;
	}


	public void setTriggers_txnID(String triggers_txnID) {
		this.triggers_txnID = triggers_txnID;
	}


	public String getDebitTriggersAmount() {
		return debitTriggersAmount;
	}


	public void setDebitTriggersAmount(String debitTriggersAmount) {
		this.debitTriggersAmount = debitTriggersAmount;
	}


	public String getCreditTriggersAmount() {
		return creditTriggersAmount;
	}


	public void setCreditTriggersAmount(String creditTriggersAmount) {
		this.creditTriggersAmount = creditTriggersAmount;
	}


	public String getClosingTriggersBalance() {
		return closingTriggersBalance;
	}


	public void setClosingTriggersBalance(String closingTriggersBalance) {
		this.closingTriggersBalance = closingTriggersBalance;
	}


	public String getRequestAmount() {
		return requestAmount;
	}


	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}


	public String getRequestPrice() {
		return requestPrice;
	}


	public void setRequestPrice(String requestPrice) {
		this.requestPrice = requestPrice;
	}


	public String getTradeId() {
		return TradeId;
	}


	public void setTradeId(String tradeId) {
		TradeId = tradeId;
	}


	public String getOffer_Id() {
		return Offer_Id;
	}


	public void setOffer_Id(String offer_Id) {
		Offer_Id = offer_Id;
	}


	public String getOffer_Amount() {
		return offer_Amount;
	}


	public void setOffer_Amount(String offer_Amount) {
		this.offer_Amount = offer_Amount;
	}


	public String getOffer_Price() {
		return offer_Price;
	}


	public void setOffer_Price(String offer_Price) {
		this.offer_Price = offer_Price;
	}


	public String getTrigx_txnID() {
		return trigx_txnID;
	}


	public void setTrigx_txnID(String trigx_txnID) {
		this.trigx_txnID = trigx_txnID;
	}


	public String getDebitTrigxAmount() {
		return debitTrigxAmount;
	}


	public void setDebitTrigxAmount(String debitTrigxAmount) {
		this.debitTrigxAmount = debitTrigxAmount;
	}


	public String getCreditTrigxAmount() {
		return creditTrigxAmount;
	}


	public void setCreditTrigxAmount(String creditTrigxAmount) {
		this.creditTrigxAmount = creditTrigxAmount;
	}


	public String getClosingTrigxBalance() {
		return closingTrigxBalance;
	}


	public void setClosingTrigxBalance(String closingTrigxBalance) {
		this.closingTrigxBalance = closingTrigxBalance;
	}


	public String getBsv_txnID() {
		return bsv_txnID;
	}


	public void setBsv_txnID(String bsv_txnID) {
		this.bsv_txnID = bsv_txnID;
	}


	public String getDebitBsvAmount() {
		return debitBsvAmount;
	}


	public void setDebitBsvAmount(String debitBsvAmount) {
		this.debitBsvAmount = debitBsvAmount;
	}


	public String getCreditBsvAmount() {
		return creditBsvAmount;
	}


	public void setCreditBsvAmount(String creditBsvAmount) {
		this.creditBsvAmount = creditBsvAmount;
	}


	public String getClosingBsvBalance() {
		return closingBsvBalance;
	}


	public void setClosingBsvBalance(String closingBsvBalance) {
		this.closingBsvBalance = closingBsvBalance;
	}


	public String getEtc_txnID() {
		return etc_txnID;
	}


	public void setEtc_txnID(String etc_txnID) {
		this.etc_txnID = etc_txnID;
	}


	public String getDebitEtcAmount() {
		return debitEtcAmount;
	}


	public void setDebitEtcAmount(String debitEtcAmount) {
		this.debitEtcAmount = debitEtcAmount;
	}


	public String getCreditEtcAmount() {
		return creditEtcAmount;
	}


	public void setCreditEtcAmount(String creditEtcAmount) {
		this.creditEtcAmount = creditEtcAmount;
	}


	public String getClosingEtcBalance() {
		return closingEtcBalance;
	}


	public void setClosingEtcBalance(String closingEtcBalance) {
		this.closingEtcBalance = closingEtcBalance;
	}


	public String getZec_txnID() {
		return zec_txnID;
	}


	public void setZec_txnID(String zec_txnID) {
		this.zec_txnID = zec_txnID;
	}


	public String getDebitZecAmount() {
		return debitZecAmount;
	}


	public void setDebitZecAmount(String debitZecAmount) {
		this.debitZecAmount = debitZecAmount;
	}


	public String getCreditZecAmount() {
		return creditZecAmount;
	}


	public void setCreditZecAmount(String creditZecAmount) {
		this.creditZecAmount = creditZecAmount;
	}


	public String getClosingZecBalance() {
		return closingZecBalance;
	}


	public void setClosingZecBalance(String closingZecBalance) {
		this.closingZecBalance = closingZecBalance;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
