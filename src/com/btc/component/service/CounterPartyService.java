package com.btc.component.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import com.btc.client.api.to.CounterPartyRequestTo;
import com.btc.client.api.to.CounterPartyResponseTo;
import com.btc.client.api.to.CustomerBCTandTriggersKey;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import btc.service.CommonUtil;

public class CounterPartyService {

	
	public  CounterPartyResponseTo getSendTrigger(CounterPartyRequestTo request)  {
		
		  CounterPartyResponseTo respons = new CounterPartyResponseTo();
			ObjectMapper obj = new ObjectMapper();
			
			try {
				
				HttpClient client = new DefaultHttpClient();
				
				   HttpPost post = new HttpPost("https://api.indiesquare.me/v2/transactions/send");
				   
				 //  StringEntity input = "{\"address\":\"n2CoWkbj2N9UBGhZGFxy5fCk3GPoqCXdH9\",\"amount\":\"10\"}";
				   obj.configure(SerializationFeature.INDENT_OUTPUT, true);
				   obj.setSerializationInclusion(Include.NON_NULL);
				   String aa = obj.writeValueAsString(request);
				  System.out.println("request::"+aa);
				   StringEntity input = new StringEntity(aa);
				
				   input.setContentType("application/json");
				   post.setEntity(input);
				   
			
				   HttpResponse response = client.execute(post);

				   BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			
				   String line = "";
				   
			
				   
				   while ((line = rd.readLine()) != null) {
			              System.out.println(line);
					   respons = obj.readValue(line, CounterPartyResponseTo.class);
					   
				
				   }
			} catch (Exception e) {
				
			}

			return respons;
			
		}
//per public key address check
	
	public  int getSendTriggerBalance(String pubkey)  {
		
		//CustomerBCTandTriggersKey respons = new CustomerBCTandTriggersKey();
		ObjectMapper obj = new ObjectMapper();
		CommonUtil commonUtil = new CommonUtil();
		String path = commonUtil.getProperty("btc_url");
		int  balance1 =0;
			try {
				
				
				
				URL url = new URL("https://api.blockcypher.com/v1/btc/main/addrs"+'/'+pubkey);
				
				System.out.println("url========"+url);
				
				
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
	BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
	StringBuffer result = new StringBuffer();
				String line = "";
				while ((line = br.readLine()) != null) {
					//System.out.println("Inside loop"+result);
					result.append(line);
				}
				
				if(result==null )
				{
					System.out.println("Null");
				}
				else
				{
					System.out.println("Output from Server .... "+ result.length());
					System.out.println("Output from Server .... "+ result);
				}
			
				
				//JSONObject jsonObject=new JSONObject(result.toString());
				/*System.out.println("jsonObject"+jsonObject);
				int  balance=jsonObject.getInt("balance");*/
				
				JSONObject jsonObject1=new JSONObject(result.toString());
			    balance1=jsonObject1.getInt("final_balance");
				
				System.out.println("After Json "+balance1);

				
				   
				//System.out.println("respons" + respons);
			} catch (Exception e) {
				
			}

			return balance1;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
