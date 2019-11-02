package btc.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerRequestTo {
	
	
	private String Customer_Id;
	private String Customer_Name;
	private String privatekey;
	private String currency;
	
	private String hcx_privKey;
	private String hcx_pubKey;
	private String hcx_balance;
	
	
	public String getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public String getHcx_balance() {
		return hcx_balance;
	}
	public void setHcx_balance(String hcx_balance) {
		this.hcx_balance = hcx_balance;
	}
	
   

}
