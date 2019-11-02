package com.btc.client.api.walletapi.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;
import com.btc.client.common.util.CommonUtil;
import com.btc.client.jsonconverter.JsonMapper;
import com.btc.client.jsonconverter.JsonRpcRequest;
import com.btc.client.jsonconverter.WalletJsonResInner;
import com.btc.client.jsonconverter.WalletJsonResponseTO;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
//import java.util.Base64;


 public class WalletRequestController extends AbstractRequestController implements IWalletRequestController{
	@Override
	public WalletResponseTO getAccountAddress(WalletRequestTO walletRequestTO){
         String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "getaccountaddress";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAuditId());
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			
			// walletResponseTO.setAmountPresent(walletJsonResponseTO.getResult().toString());
			
			 String str=walletJsonResponseTO.getResposnse();
			 ObjectMapper mapper = new ObjectMapper();
				try {
				  WalletJsonResInner walletTxn=mapper.readValue(str,WalletJsonResInner.class);
				  walletResponseTO.setAddress(walletTxn.getResult());
				  walletResponseTO.setWalletjsonresInner(walletTxn);
				  
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//walletResponseTO.setListAddress(walletJsonResponseTO.getResult().toString().split(","));
			
		}
		return walletResponseTO;
		
	}

	@Override
	public WalletResponseTO getBalanceOverAll(WalletRequestTO walletRequestTO){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "getbalance";    
		List<Object> params = new ArrayList<Object>();
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request, walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			
			// walletResponseTO.setAmountPresent(walletJsonResponseTO.getResult().toString());
			
			 String str=walletJsonResponseTO.getResposnse();
			 ObjectMapper mapper = new ObjectMapper();
				try {
				  WalletJsonResInner walletTxn=mapper.readValue(str,WalletJsonResInner.class);
				  walletResponseTO.setAmountPresent(walletTxn.getResult());
				  walletResponseTO.setWalletjsonresInner(walletTxn);
				  
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		return walletResponseTO;
		
	}
	
	
	@Override
	public WalletResponseTO getNewAddress(WalletRequestTO walletRequestTO){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "getnewaddress";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAuditId());
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		 
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			walletResponseTO.setAddress((String)walletJsonResponseTO.getResult());
		}
		return walletResponseTO;
	}
	
	@Override
	public WalletResponseTO getPrivateKey(WalletRequestTO walletRequestTO){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "dumpprivkey";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAddress());
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		 
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			walletResponseTO.setAddress((String)walletJsonResponseTO.getResult());
		}
		return walletResponseTO;
	}
	
	
	@Override
	public WalletResponseTO sendToAddress(WalletRequestTO walletRequestTO){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "sendtoaddress";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAddress());
		params.add(walletRequestTO.getAmountToTransfer());
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			walletResponseTO.setTransactionId((String)walletJsonResponseTO.getResult());
		}
		return walletResponseTO;
	}
	
	
	@Override
	public WalletResponseTO getAmountReceivedByAddress(WalletRequestTO walletRequestTO){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "getreceivedbyaddress";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAddress());
		params.add(0);
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			walletResponseTO.setAmountPresent((String)walletJsonResponseTO.getResult().toString());
		}
		
		/*CommonUtil commonUtil = new CommonUtil();
		String path = commonUtil.getProperty("path");
		ApplicationContext appCtx=new FileSystemXmlApplicationContext(path);
		AuditService auditService=(AuditService)appCtx.getBean("auditService"); 
		
		auditService.recordServiceInsertInfo(walletRequestTO, walletResponseTO);*/
		
		return walletResponseTO;
		
	}
	
   
/*	public WalletResponseTO getTransactionConfirmation(WalletRequestTO walletRequestTO){
	
	   WalletResponseTO walletResponseTO = new WalletResponseTO();
	   String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "getreceivedbyaddress";    
		List<Object> params = new ArrayList<Object>();
		params.add(walletRequestTO.getAddress());
		params.add(1);
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request);
		
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			walletResponseTO.setAmountPresent((String)walletJsonResponseTO.getResult().toString());
			
		}
	   return walletResponseTO;
	
   }  */
	
	
	public WalletResponseTO getTransaction(WalletRequestTO walletRequestTO, String strTxnID){
		
		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
		
		String method = "gettransaction";    
		List<Object> params = new ArrayList<Object>();
		params.add(strTxnID);
		//params.add(0);
		JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
		
		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse1(request);
		WalletResponseTO walletResponseTO = new WalletResponseTO();
		walletResponseTO.setAuditId(requestUuid);
		
		if(walletJsonResponseTO.getOtherErrorMessage() != null){
			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
		}else{
			String str=walletJsonResponseTO.getResposnse();
			System.out.println(str);
			str=str.substring(10,str.lastIndexOf('}')+1);
			System.out.println(str);
			//walletResponseTO.setAmountPresent(walletJsonResponseTO.getResult().toString());
			
			ObjectMapper mapper = new ObjectMapper();
				try {
					
				  WalletJsonResInner walletTxn=mapper.readValue(str,WalletJsonResInner.class);
				  walletResponseTO.setAmountPresent(walletTxn.getDetails().get(0).getAmount());
				  walletResponseTO.setConfirmation(walletTxn.getConfirmations());
				  walletResponseTO.setWalletjsonresInner(walletTxn);
				  
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//walletResponseTO.setListAddress(walletJsonResponseTO.getResult().toString().split(","));
			
		}
		return walletResponseTO;
		}

private WalletJsonResponseTO callAndPopulateResponse1(JsonRpcRequest<Object> request) {
		
		WalletJsonResponseTO walletJsonResponseTO = new WalletJsonResponseTO();
		String errorMessage = null;
		String requestJson = null;
		try {
			JsonMapper mapper = new JsonMapper();
			requestJson = mapper.mapToJson(request);
			System.out.println("-- execute(..): sending JSON-RPC request as (raw): '{}'" + requestJson.trim());
		}
		catch (JsonProcessingException e) {
			errorMessage = "Error in mapping input values";
//			e.printStackTrace();
		}
		
		CloseableHttpClient provider = HttpClientBuilder.create().build();
		CloseableHttpResponse response = null;
		try {
			response = provider.execute(getNewRequest1(requestJson.trim()), new BasicHttpContext());
		}
		catch (ClientProtocolException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (UnsupportedEncodingException e1) {
			errorMessage = "Error in encoding ";
//			e1.printStackTrace();
		}
		catch (IOException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (URISyntaxException e1) {
			errorMessage = "Error in url formation";
//			e1.printStackTrace();
		}
		
		if(errorMessage == null){
			try {
				response = checkResponse(response);
			}
			catch (Exception e1) {
				errorMessage = e1.getMessage();
				e1.printStackTrace();
			}
			
			HttpEntity respPayloadEntity = response.getEntity();
			String respPayload = "";
			
			if(respPayloadEntity != null) {
				try {
					respPayload = EntityUtils.toString(respPayloadEntity);
					EntityUtils.consume(respPayloadEntity);
					System.out.println("Response JSON :: " + respPayload);
					ObjectMapper mapper = new ObjectMapper();
					walletJsonResponseTO = mapper.readValue(respPayload, WalletJsonResponseTO.class);
					walletJsonResponseTO.setResposnse(respPayload);
					return walletJsonResponseTO;
				}
				catch (ParseException e) {
					errorMessage = "Error in parsing";
					e.printStackTrace();
				}
				catch (IOException e) {
					errorMessage = "Error in input output while formatting";
					e.printStackTrace();
				}
			}
		}
		walletJsonResponseTO.setOtherErrorMessage(errorMessage);
		return walletJsonResponseTO;
		
	}
  
  //btc address check
 	@Override
 	public WalletResponseTO validAddressCheck(WalletRequestTO walletRequestTO){
 		
 		String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
 		
 		String method = "validateaddress";    
 		List<Object> params = new ArrayList<Object>();
 		//params.add(walletRequestTO.getAuditId());
 		params.add(walletRequestTO.getAddress());
 		
 		JsonRpcRequest<Object> request = populateJsonRequestAddressCheck(method, params,requestUuid);
 		
 		WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponseAddressCheck(request,walletRequestTO.getCurrency());
 		WalletResponseTO walletResponseTO = new WalletResponseTO();
 		//walletResponseTO.setAuditId(requestUuid);
 		 
 		if(walletJsonResponseTO.getOtherErrorMessage() != null){
 			walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
 		}else{
 			walletResponseTO.setIsvalid((String)walletJsonResponseTO.getIsvalid());
 			
 		
 		}
 		System.out.println("walletResponseTO:::::"+walletResponseTO.getIsvalid());
 		return walletResponseTO;
 	}
  
 	//btc address check
	
 	private <T> JsonRpcRequest<T> populateJsonRequestAddressCheck(String method, List<T> params, String id) {
 			
 		JsonRpcRequest<T> rpcRequest = new JsonRpcRequest<T>();
 		rpcRequest.setJsonrpc("1.0");
 		rpcRequest.setMethod(method);
 		rpcRequest.setParams(params);
 		rpcRequest.setId(id);
 		return rpcRequest;
 		}
 	
 	
 	
  
	//btc check
private WalletJsonResponseTO callAndPopulateResponseAddressCheck(JsonRpcRequest<Object> request,String strCurrency) {
		
		WalletJsonResponseTO walletJsonResponseTO = new WalletJsonResponseTO();
		String errorMessage = null;
		String requestJson = null;
		try {
			JsonMapper mapper = new JsonMapper();
			requestJson = mapper.mapToJson(request);
			System.out.println("-- execute(..): sending JSON-RPC request as (raw): '{}'" + requestJson.trim());
		}
		catch (JsonProcessingException e) {
			errorMessage = "Error in mapping input values";
//			e.printStackTrace();
		}
		
		CloseableHttpClient provider = HttpClientBuilder.create().build();
		CloseableHttpResponse response = null;
		try {
			response = provider.execute(getNewRequest(requestJson.trim(),strCurrency), new BasicHttpContext());
		}
		catch (ClientProtocolException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (UnsupportedEncodingException e1) {
			errorMessage = "Error in encoding ";
//			e1.printStackTrace();
		}
		catch (IOException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (URISyntaxException e1) {
			errorMessage = "Error in url formation";
//			e1.printStackTrace();
		}
		
		if(errorMessage == null){
			try {
				response = checkResponse(response);
			}
			catch (Exception e1) {
				errorMessage = e1.getMessage();
				e1.printStackTrace();
			}
			
			HttpEntity respPayloadEntity = response.getEntity();
			System.out.println("respPayloadEntity : " + respPayloadEntity);
			
			String respPayload = "";
			
			if(respPayloadEntity != null) {                                                                                                             
				try {
					respPayload = EntityUtils.toString(respPayloadEntity);
					EntityUtils.consume(respPayloadEntity);
					System.out.println("Response JSON :: " + respPayload);
					JSONObject result = new JSONObject(respPayload); //Convert String to JSON Object
					System.out.println(".........." +result);
					System.out.println("result..." +result.getString("result"));
					JSONObject result1 = new JSONObject(result.getString("result"));
					System.out.println("isvalid..." +result1.getString("isvalid"));
					String isvalid=result1.getString("isvalid");
					System.out.println("==================="+isvalid);
					
					ObjectMapper mapper = new ObjectMapper();
					walletJsonResponseTO = mapper.readValue(respPayload, WalletJsonResponseTO.class);
					walletJsonResponseTO.setIsvalid(isvalid);
					walletJsonResponseTO.setResposnse(respPayload);
					
					return walletJsonResponseTO;
				}
				catch (ParseException e) {
					errorMessage = "Error in parsing";
					e.printStackTrace();
				}
				catch (IOException e) {
					errorMessage = "Error in input output while formatting";
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		walletJsonResponseTO.setOtherErrorMessage(errorMessage);
		return walletJsonResponseTO;
		
	}

//For Tigger
@Override
public WalletResponseTO sendRawTransaction(WalletRequestTO walletRequestTO){
	
	String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
	
	String method = "sendrawtransaction";    
	List<Object> params = new ArrayList<Object>();
	params.add(walletRequestTO.getHex());
	
	JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
	
	WalletJsonResponseTO walletJsonResponseTO = callAndPopulateResponse(request,walletRequestTO.getCurrency());
	WalletResponseTO walletResponseTO = new WalletResponseTO();
	walletResponseTO.setAuditId(requestUuid);
	
	if(walletJsonResponseTO.getOtherErrorMessage() != null){
		walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
	}else{
		//walletResponseTO.setHex((String)walletJsonResponseTO.getHex());
		//walletResponseTO.setComplete((String)walletJsonResponseTO.getComplete());
		walletResponseTO.setTransactionId((String)walletJsonResponseTO.getResult());
	}
	return walletResponseTO;
}




//For Trigger
@Override
public WalletResponseTO signRawTransaction(WalletRequestTO walletRequestTO){
	
	String requestUuid = walletRequestTO.getAuditId() != null ? walletRequestTO.getAuditId() : getNewUuid();
	System.out.println("requestUuid"+requestUuid);
	
	String method = "signrawtransaction";    
	List<Object> params = new ArrayList<Object>();
	params.add(walletRequestTO.getUnsigned_tx());
	
	JsonRpcRequest<Object> request = populateJsonRequest(method, params, requestUuid);
	
	WalletJsonResponseTO walletJsonResponseTO = callAndPopulateSendRawTxnResponse(request,walletRequestTO.getCurrency());
	WalletResponseTO walletResponseTO = new WalletResponseTO();
	walletResponseTO.setAuditId(requestUuid);
	
	if(walletJsonResponseTO.getOtherErrorMessage() != null){
		walletResponseTO.setErrorMessage(walletJsonResponseTO.getOtherErrorMessage());
	}else{
		walletResponseTO.setHex((String)walletJsonResponseTO.getHex());
		walletResponseTO.setComplete((String)walletJsonResponseTO.getComplete());
	}
	return walletResponseTO;
}

private WalletJsonResponseTO callAndPopulateSendRawTxnResponse(JsonRpcRequest<Object> request,String strCurrency) {
	
	WalletJsonResponseTO walletJsonResponseTO = new WalletJsonResponseTO();
	String errorMessage = null;
	String requestJson = null;
	try {
		JsonMapper mapper = new JsonMapper();
		requestJson = mapper.mapToJson(request);
		System.out.println("-- execute(..): sending JSON-RPC request as (raw): '{}'" + requestJson.trim());
	}
	catch (JsonProcessingException e) {
		errorMessage = "Error in mapping input values";
//		e.printStackTrace();
	}
	
	CloseableHttpClient provider = HttpClientBuilder.create().build();
	CloseableHttpResponse response = null;
	try {
		response = provider.execute(getNewRequest(requestJson.trim(),strCurrency), new BasicHttpContext());
	}
	catch (ClientProtocolException e1) {
		errorMessage = "Error in network connection";
//		e1.printStackTrace();
	}
	catch (UnsupportedEncodingException e1) {
		errorMessage = "Error in encoding ";
//		e1.printStackTrace();
	}
	catch (IOException e1) {
		errorMessage = "Error in network connection";
//		e1.printStackTrace();
	}
	catch (URISyntaxException e1) {
		errorMessage = "Error in url formation";
//		e1.printStackTrace();
	}
	
	if(errorMessage == null){
		try {
			response = checkResponse(response);
		}
		catch (Exception e1) {
			errorMessage = e1.getMessage();
			e1.printStackTrace();
		}
		
		HttpEntity respPayloadEntity = response.getEntity();
		String respPayload = "";
		
		if(respPayloadEntity != null) {                                                                                                             
			try {
				respPayload = EntityUtils.toString(respPayloadEntity);
				EntityUtils.consume(respPayloadEntity);
				System.out.println("Response JSON :: " + respPayload);
				
			   try {
					
					
			 JSONObject myResponse = new JSONObject(respPayload);
			 
			//System.out.println("json parsing::"+myResponse);
				   
			 //String myResponse1 = myResponse.getString("result");
			 
			String aa =  myResponse.get("result").toString();
			JSONObject myResponse2 = new JSONObject(aa);
			 
			String res =  myResponse2.get("hex").toString();
			String res2 =  myResponse2.get("complete").toString(); 
			System.out.println("json parsing::"+res);
			System.out.println("json parsing22::"+res2);
			
				 
				ObjectMapper mapper = new ObjectMapper();
				walletJsonResponseTO = mapper.readValue(respPayload, WalletJsonResponseTO.class);
				
				walletJsonResponseTO.setResposnse(respPayload);
				walletJsonResponseTO.setHex(res);
				walletJsonResponseTO.setComplete(res2);
				
				return walletJsonResponseTO;
				
				} catch (JSONException e) {
					
					e.printStackTrace();
				}
			}
			catch (ParseException e) {
				errorMessage = "Error in parsing";
				e.printStackTrace();
			}
			catch (IOException e) {
				errorMessage = "Error in input output while formatting";
				e.printStackTrace();
			}
		}
	}
	walletJsonResponseTO.setOtherErrorMessage(errorMessage);
	return walletJsonResponseTO;
	
}


	
	private WalletJsonResponseTO callAndPopulateResponse(JsonRpcRequest<Object> request,String strCurrency) {
		
		WalletJsonResponseTO walletJsonResponseTO = new WalletJsonResponseTO();
		String errorMessage = null;
		String requestJson = null;
		try {
			JsonMapper mapper = new JsonMapper();
			requestJson = mapper.mapToJson(request);
			System.out.println("-- execute(..): sending JSON-RPC request as (raw): '{}'" + requestJson.trim());
		}
		catch (JsonProcessingException e) {
			errorMessage = "Error in mapping input values";
//			e.printStackTrace();
		}
		
		CloseableHttpClient provider = HttpClientBuilder.create().build();
		CloseableHttpResponse response = null;
		try {
			response = provider.execute(getNewRequest(requestJson.trim(),strCurrency), new BasicHttpContext());
		}
		catch (ClientProtocolException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (UnsupportedEncodingException e1) {
			errorMessage = "Error in encoding ";
//			e1.printStackTrace();
		}
		catch (IOException e1) {
			errorMessage = "Error in network connection";
//			e1.printStackTrace();
		}
		catch (URISyntaxException e1) {
			errorMessage = "Error in url formation";
//			e1.printStackTrace();
		}
		
		if(errorMessage == null){
			try {
				response = checkResponse(response);
			}
			catch (Exception e1) {
				errorMessage = e1.getMessage();
				e1.printStackTrace();
			}
			
			HttpEntity respPayloadEntity = response.getEntity();
			String respPayload = "";
			
			if(respPayloadEntity != null) {                                                                                                             
				try {
					respPayload = EntityUtils.toString(respPayloadEntity);
					EntityUtils.consume(respPayloadEntity);
					System.out.println("Response JSON :: " + respPayload);
					ObjectMapper mapper = new ObjectMapper();
					walletJsonResponseTO = mapper.readValue(respPayload, WalletJsonResponseTO.class);
					walletJsonResponseTO.setResposnse(respPayload);
					return walletJsonResponseTO;
				}
				catch (ParseException e) {
					errorMessage = "Error in parsing";
					e.printStackTrace();
				}
				catch (IOException e) {
					errorMessage = "Error in input output while formatting";
					e.printStackTrace();
				}
			}
		}
		walletJsonResponseTO.setOtherErrorMessage(errorMessage);
		return walletJsonResponseTO;
		
	}
	
	private CloseableHttpResponse checkResponse(CloseableHttpResponse response) throws Exception{
		
		StatusLine statusLine = response.getStatusLine();
		if((statusLine.getStatusCode() >= 400) && (statusLine.getStatusCode() <= 499)) {
			throw new Exception("The server responded with a non-OK (4xx) HTTP status code.");
		}
		if((statusLine.getStatusCode() >= 500) && (statusLine.getStatusCode() <= 599)) {
			throw new Exception("The server responded with a non-OK (5xx) HTTP status code. ");
		}	
		return response;
	}

	private <T> JsonRpcRequest<T> populateJsonRequest(String method, List<T> params, String id) {
		
		JsonRpcRequest<T> rpcRequest = new JsonRpcRequest<T>();
		rpcRequest.setJsonrpc("1.0");
		rpcRequest.setMethod(method);
		rpcRequest.setParams(params);
		rpcRequest.setId(id);
		return rpcRequest;
	}
	
	
private HttpRequestBase getNewRequest1(String reqPayload) throws URISyntaxException, UnsupportedEncodingException {
		
		HttpRequestBase request;
		HttpPost postRequest = new HttpPost();
		String comando = reqPayload;
		StringEntity params =new StringEntity(comando,"UTF-8");
		params.setContentType("application/json");
		postRequest.setEntity(params);
		request = postRequest;
		CommonUtil commonUtil = new CommonUtil();
		String URI = commonUtil.getProperty("URL");
		request.setURI(new URI(URI));

		String userId = commonUtil.getProperty("USER");
		String password = commonUtil.getProperty("PASSWORD");
		request.addHeader(new BasicHeader("Authorization", "Basic" 
				+ " " + Base64.encodeBase64String((userId	+ ":" + password).getBytes())));
		
		return request;
	}
	
	
	
	
	
	private HttpRequestBase getNewRequest(String reqPayload, String strCurrency) throws URISyntaxException, UnsupportedEncodingException {
		
		HttpRequestBase request;
		HttpPost postRequest = new HttpPost();
		String comando = reqPayload;
		StringEntity params =new StringEntity(comando,"UTF-8");
		params.setContentType("application/json");
		postRequest.setEntity(params);
		request = postRequest;
		CommonUtil commonUtil = new CommonUtil();
		String URI = null;
		if(strCurrency.equals("btc"))
		URI=commonUtil.getProperty("btc");
		else if(strCurrency.equals("bch")) 
			URI=commonUtil.getProperty("bch");
		else if(strCurrency.equals("ltc")) 
			URI=commonUtil.getProperty("ltc");
		request.setURI(new URI(URI));
		String userId = commonUtil.getProperty("USER");				
		String password = commonUtil.getProperty("PASSWORD");
	    request.addHeader(new BasicHeader("Authorization", "Basic" 
		 		+ " " + Base64.encodeBase64String((userId	+ ":" + password).getBytes())));
	    return request;
	    
	    
	}
	
	private String getNewUuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	

}
