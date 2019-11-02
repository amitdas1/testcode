package btc.to;

public class PaymentProcessingRequestTo {
	
	
	private String customer_Id;
	private String toCustomer;
	
	private String orderID;
	
	private String fiat_amount;	
	private String btc_amount;
	private String description;
	private String descriptionReceived;
	
	private String invoice_no;
	private String order_no;
	private String reference_no;
	private String status;
	private String action;
	private String message;
	private String fromadd;
	private String toadd;
	private String txnId;
	
	private String fromDate;
	private String toDate;
	private String pageNo;
	private String noTxn;
	
	
	private String askprice;
	private String qty;
	private String askTimeStamp;
	private String sucess;
	private String deletion_flag;
	private String deletion_timestamp;
	private String bidprice;
	private String bidTimeStamp;
	
	
	private String benificiaryName;
	private String bankName;
	private String ifscCode;
	
	private String txnCharge;
	private String chargeSGST;
	private String chargeCGST;
	private String mining_fees;
	private String currency;
	private String transactionType;
	private String baseCurrency;
	private String creditAmount;
	private String debitAmount;
	private String offerPrice;
	
	//new
	private String requestAmount;
	private String requestPrice;
	private String TradeId;
	private String Offer_Id;
	
	private String offer_Amount;
	private String offer_Price;
	//corporate remit id,
	private int corporate_remit_id;
	private double insured_amount;
	
	
	//--------------------------------------------coding for 
	
	
	
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
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getToCustomer() {
		return toCustomer;
	}
	public void setToCustomer(String toCustomer) {
		this.toCustomer = toCustomer;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getFiat_amount() {
		return fiat_amount;
	}
	public void setFiat_amount(String fiat_amount) {
		this.fiat_amount = fiat_amount;
	}
	public String getBtc_amount() {
		return btc_amount;
	}
	public void setBtc_amount(String btc_amount) {
		this.btc_amount = btc_amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescriptionReceived() {
		return descriptionReceived;
	}
	public void setDescriptionReceived(String descriptionReceived) {
		this.descriptionReceived = descriptionReceived;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
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
	public String getNoTxn() {
		return noTxn;
	}
	public void setNoTxn(String noTxn) {
		this.noTxn = noTxn;
	}
	public String getAskprice() {
		return askprice;
	}
	public void setAskprice(String askprice) {
		this.askprice = askprice;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getAskTimeStamp() {
		return askTimeStamp;
	}
	public void setAskTimeStamp(String askTimeStamp) {
		this.askTimeStamp = askTimeStamp;
	}
	public String getSucess() {
		return sucess;
	}
	public void setSucess(String sucess) {
		this.sucess = sucess;
	}
	public String getDeletion_flag() {
		return deletion_flag;
	}
	public void setDeletion_flag(String deletion_flag) {
		this.deletion_flag = deletion_flag;
	}
	public String getDeletion_timestamp() {
		return deletion_timestamp;
	}
	public void setDeletion_timestamp(String deletion_timestamp) {
		this.deletion_timestamp = deletion_timestamp;
	}
	public String getBidprice() {
		return bidprice;
	}
	public void setBidprice(String bidprice) {
		this.bidprice = bidprice;
	}
	public String getBidTimeStamp() {
		return bidTimeStamp;
	}
	public void setBidTimeStamp(String bidTimeStamp) {
		this.bidTimeStamp = bidTimeStamp;
	}
	public String getBenificiaryName() {
		return benificiaryName;
	}
	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
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
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}
	public String getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
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
	
	
}
