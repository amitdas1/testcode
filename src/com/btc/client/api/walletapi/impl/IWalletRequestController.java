package com.btc.client.api.walletapi.impl;

import com.btc.client.api.to.WalletRequestTO;
import com.btc.client.api.to.WalletResponseTO;

public interface IWalletRequestController {
	
	public WalletResponseTO getAccountAddress(WalletRequestTO walletRequestTO);

	public WalletResponseTO getBalanceOverAll(WalletRequestTO walletRequestTO);
	
	public WalletResponseTO getNewAddress(WalletRequestTO walletRequestTO);

	public WalletResponseTO sendToAddress(WalletRequestTO walletRequestTO);

	public WalletResponseTO getAmountReceivedByAddress(WalletRequestTO walletRequestTO);
	public WalletResponseTO getPrivateKey(WalletRequestTO walletRequestTO);
	
	// get wallet info
//	public WalletResponseTO getWalletInfo(WalletRequestTO walletRequestTO);
	
	// get paid list 
	
//	public WalletResponseTO getPaidList(WalletRequestTO walletRequestTO);
	
	// get transaction confirm
//	 public WalletResponseTO getTransactionConfirmation(WalletRequestTO walletRequestTO);
	
	// get list Received by Address
//	 public WalletResponseTO getListReceivedByAddress(WalletRequestTO walletRequestTO);
	 
	// get Transaction
 	public WalletResponseTO getTransaction(WalletRequestTO walletRequestTO,String strTxnID);
	 
 	//adding btc address 
 	 	public WalletResponseTO validAddressCheck(WalletRequestTO walletRequestTO);
 	 	
 	 	
 	 //Adding for Triggers
 	 	public WalletResponseTO signRawTransaction(WalletRequestTO walletRequestTO);
 	 	
 	 	public WalletResponseTO sendRawTransaction(WalletRequestTO walletRequestTO);
 	 	
	
}
