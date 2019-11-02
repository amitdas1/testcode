package com.btc.client.api.controller;

import com.btc.client.api.walletapi.impl.AbstractRequestController;
import com.btc.client.api.walletapi.impl.WalletRequestController;

public class ControllerFactory {

	public static AbstractRequestController provideWalletController(){
		
		AbstractRequestController controller = new WalletRequestController();
		return controller;
	}
}
