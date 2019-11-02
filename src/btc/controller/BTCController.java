package btc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.btc.adapter.service.PayBitoWalletService;
import com.btc.client.api.controller.ControllerFactory;
import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;


import btc.service.CounterPartyService;
import btc.to.AdapterResponse;
import btc.to.ErrorResponse;
import btc.to.PaymentProcessingRequestTo;
import btc.to.PaymentProcessingResponseTo;
import btc.to.Result;

@RestController
@RequestMapping("/btc")
public class BTCController {	
		
	@Autowired
	CounterPartyService	counterPartyService;
	@Autowired
	PayBitoWalletService paybitoService;
	
	
	@RequestMapping(value="/getNewAddress", method=RequestMethod.GET)
	public AdapterResponse  getBtcNewAddress(@RequestParam("customerid") String customerid) {
		
		System.out.println("customerid :"+customerid);
		
	AdapterResponse response =	counterPartyService.generateNewAddress(customerid);
	
	//System.out.println("public address::::"+response.getResult().getAddress());
	
		return response;
		
	}

	@RequestMapping(value = "/sendTriggersToOther", method = RequestMethod.POST , headers="Accept=application/json")
	//public @ResponseBody Task createCustomer(@RequestBody Task task) {
	public ResponseEntity getSendToOther(@RequestBody PaymentProcessingRequestTo request) {

		System.out.println("Send Btc To Other");
		PaymentProcessingResponseTo response =	paybitoService.sendtoPaybitoToOther(request);
		
		return new ResponseEntity(response, HttpStatus.OK);
		//return task;
	}

	/*@RequestMapping(value = "/sendBtcToOther", method = RequestMethod.POST , headers="Accept=application/json")
	//public @ResponseBody Task createCustomer(@RequestBody Task task) {
	public PaymentProcessingResponseTo getSendToOther(@RequestBody PaymentProcessingRequestTo request) {

		System.out.println("Send Btc To Other");
		PaymentProcessingResponseTo response =	paybitoService.sendtoPaybitoToOther(request);
		
		if(response!=null){
			response.setError("Successfully data");
		}else {
			response.setError("No data found");
		}
		
		return response;
	}*/









}



