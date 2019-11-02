package com.btc.client.jsonconverter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WalletJsonResponseTO {

	private Object result;
	
	private String error;
	private String otherErrorMessage;
	private String id;
    private String resposnse;
  //----adding btc address 
    private String isvalid;
    
    
    //Trigger for variable
    
    private String hex;
    
    private String complete;
    
    
    
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getOtherErrorMessage() {
		return otherErrorMessage;
	}

	public void setOtherErrorMessage(String otherErrorMessage) {
		this.otherErrorMessage = otherErrorMessage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResposnse() {
		return resposnse;
	}

	public void setResposnse(String resposnse) {
		this.resposnse = resposnse;
	}

	public String getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	public String getHex() {
		return hex;
	}

	public void setHex(String hex) {
		this.hex = hex;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}
	
	
	
}
