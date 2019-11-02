package com.btc.client.jsonconverter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ExchangeJResponse {

	
	private  Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
