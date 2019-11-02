package btc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.btc.client.api.controller.ControllerFactory;
import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;

import btc.dao.AuditDAO;
import btc.dao.CustomerKeysDao;
import btc.to.AdapterResponse;
import btc.to.AuditTo;
import btc.to.ErrorResponse;
import btc.to.Result;

public class CounterPartyService {
	
	@Autowired
	AdapterResponse adapterResponse;
	
	@Autowired
	ErrorResponse errResponse;
	
	@Autowired
	Result result;
	
	
	
	public AuditTo auditTo;
	public AuditDAO auditDAO;
	
	
	
	public AuditTo getAuditTo() {
		return auditTo;
	}




	public void setAuditTo(AuditTo auditTo) {
		this.auditTo = auditTo;
	}




	public AuditDAO getAuditDAO() {
		return auditDAO;
	}




	public void setAuditDAO(AuditDAO auditDAO) {
		this.auditDAO = auditDAO;
	}




	public AdapterResponse generateNewAddress(String customerId){
		
		if(customerId==null || customerId.length()==0){
			
			errResponse.setError_data(0);
			errResponse.setError_msg("Invalid Response");
			result.setAddress("Failed");
			result.setMessage("Address Generated Failed");
			adapterResponse.setError(errResponse);
			adapterResponse.setResult(result);
			
		} else {
		 
		auditTo.setCUSTOMERID(customerId);
		List<AuditTo> list= auditDAO.listAuditData(auditTo);
		
		if(list.size()>0 ){
			
		//	System.out.println("Public Key::"+list.get(0).getPUBKEY());
			
			errResponse.setError_data(2);
			errResponse.setError_msg("No Error");
			result.setAddress(list.get(0).getPUBKEY());
			result.setMessage(" Generated Public Address Successfully");
			adapterResponse.setError(errResponse);
			adapterResponse.setResult(result);
			
			
			
		}  else {
			
			IWalletRequestController walletRequestController = (IWalletRequestController) ControllerFactory
					.provideWalletController();
			
			WalletRequestTO walletrequest = new WalletRequestTO();
			walletrequest.setAuditId(customerId);
			walletrequest.setCurrency("btc");
			
		WalletResponseTO walletresponse = walletRequestController.getNewAddress(walletrequest);
		String strAddr=walletresponse.getAddress();
		
		//System.out.println("public address :"+strAddr);
		
		
		walletrequest.setAddress(strAddr);
		walletrequest.setCurrency("btc");
		
		WalletResponseTO  walletresponsee = walletRequestController.getPrivateKey(walletrequest);
		String strPrivateAddress = walletresponsee.getAddress();
		
		System.out.println("private address :"+strPrivateAddress);
		AuditTo auditTo = new AuditTo();
		auditTo.setCUSTOMERID(customerId);
		auditTo.setPUBKEY(strAddr);
		auditTo.setPRIVATEKEY(strPrivateAddress);
		
		int xx = auditDAO.insertIntoAuditTable(auditTo);
	
		String fromadd= auditDAO.getreceiveKeyFromCustomerTriggers(auditTo.getCUSTOMERID());
		System.out.println("fromadd"+fromadd);
		if(fromadd==null){
		
		//insert customerTriggerkeys table
		int xx1 = auditDAO.insertTRIGGERCustomerKeyDao(auditTo);
		System.out.println("xx1"+xx1);
		}
		System.out.println("Inserted:"+xx);
		errResponse.setError_data(1);
		errResponse.setError_msg("No Error");
		result.setAddress(strAddr);
		result.setMessage("Address Generated Successfully");
		adapterResponse.setError(errResponse);
		adapterResponse.setResult(result);
		}
	
		} 
			
		return adapterResponse;
	}
}
