package com.btc.client.api.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CounterPartyResponseTo {

	private String unsigned_tx;
	private String fee;
	
	
	public String getUnsigned_tx() {
		return unsigned_tx;
	}
	public void setUnsigned_tx(String unsigned_tx) {
		this.unsigned_tx = unsigned_tx;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
}
