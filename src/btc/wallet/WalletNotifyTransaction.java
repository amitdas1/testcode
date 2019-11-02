package btc.wallet;

import com.btc.client.api.controller.ControllerFactory;
import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;
import com.btc.client.api.walletapi.impl.IWalletRequestController;

public class WalletNotifyTransaction {
	
	public WalletResponseTO getTransactionInform(String TxnID ){
	IWalletRequestController walletRequestController = (IWalletRequestController)ControllerFactory.provideWalletController();
       WalletRequestTO wreq=new WalletRequestTO();
	   wreq.setAuditId("111aass11");
	   System.out.println("WalletNotifyTransaction....");
	   WalletResponseTO walletResponseTo=walletRequestController.getTransaction(wreq,TxnID);
	   
	 return  walletResponseTo;
	
	 }
 
}
