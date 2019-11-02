package btc.controller;

import java.math.BigDecimal;

public class BigDecimalProgram {

	public static void main(String args[]){
		
		BigDecimal sendTriggerBtcBalance=new BigDecimal(0.0002).setScale(8,BigDecimal.ROUND_DOWN);
		System.out.println("sendTriggerBtcBalance"+sendTriggerBtcBalance);
		
		//double btcBalancePerAddress=counterPartyService.getSendTriggerBalance(pubkey);
		
		double btcBalancePerAddress=100000;
		
		BigDecimal sendTriggerBtcBalance1=new BigDecimal(btcBalancePerAddress);
		BigDecimal divide=new BigDecimal(100000000);
		System.out.println("divide"+divide);
		BigDecimal sendTriggerBtcBalance2=sendTriggerBtcBalance1.divide(divide);
		System.out.println("sendTriggerBtcBalance2=="+sendTriggerBtcBalance2);
		
		//BigDecimal sendTriggerBtcBalance2 = new BigDecimal(sendTriggerBtcBalance21).setScale(8,BigDecimal.ROUND_DOWN);
		
		//BigDecimal btcBalancePerAddressDivided= new BigDecimal();
		//System.out.println("btcBalancePerAddressDivided==="+btcBalancePerAddressDivided);
		if(sendTriggerBtcBalance.compareTo(sendTriggerBtcBalance2)==0 ||sendTriggerBtcBalance.compareTo(sendTriggerBtcBalance2)==-1){
		
		
		System.out.println("sucess");
	}
		
		else {
			System.out.println("failure");
		}
	
	}
}
