package com.btc.client.jsonconverter;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class JsonRpcMessage {
	
	private String jsonrpc;
	private String id;
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}