package com.btc.client.jsonconverter;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WalletJsonResInner {
	
	// listtransactions
	   private String result; 
	   private String account;
	   private String address;
	   private String category;
	   private String amount;
	   private String vout;
	   private String confirmations;
	   private String generated;
	   private String blockhash;
	   private String blockindex;
	   private String blocktime;
	   private String fee;
	   private String txid;
	   private List txids;
	   private String trusted;
	//   private List<String> walletconflicts;
	   private String time;
	   private String timereceived;
	   //private String bip125-replaceable;	   
	   public List<Details> details;
	   private String abandoned;
	   ////// walletinfo
	   private String walletversion;
	   private String balance;
	   private String unconfirmed_balance;   
	   private String immature_balance;   
	   private String paytxfee;  
	   private String hdmasterkeyid;
	   private String txcount;
	   private String keypoololdest;
	   private String keypoolsize;
	   private String unlocked_until;
	  
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getVout() {
		return vout;
	}
	public void setVout(String vout) {
		this.vout = vout;
	}
	public String getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}
	public String getGenerated() {
		return generated;
	}
	public void setGenerated(String generated) {
		this.generated = generated;
	}
	public String getBlockhash() {
		return blockhash;
	}
	public void setBlockhash(String blockhash) {
		this.blockhash = blockhash;
	}
	public String getBlockindex() {
		return blockindex;
	}
	public void setBlockindex(String blockindex) {
		this.blockindex = blockindex;
	}
	public String getBlocktime() {
		return blocktime;
	}
	public void setBlocktime(String blocktime) {
		this.blocktime = blocktime;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	
	
	public List getTxids() {
		return txids;
	}
	public void setTxids(List txids) {
		this.txids = txids;
	}
	public String getTrusted() {
		return trusted;
	}
	public void setTrusted(String trusted) {
		this.trusted = trusted;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTimereceived() {
		return timereceived;
	}
	public void setTimereceived(String timereceived) {
		this.timereceived = timereceived;
	}
	public String getWalletversion() {
		return walletversion;
	}
	public void setWalletversion(String walletversion) {
		this.walletversion = walletversion;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getUnconfirmed_balance() {
		return unconfirmed_balance;
	}
	public void setUnconfirmed_balance(String unconfirmed_balance) {
		this.unconfirmed_balance = unconfirmed_balance;
	}
	
	public String getImmature_balance() {
		return immature_balance;
	}
	public void setImmature_balance(String immature_balance) {
		this.immature_balance = immature_balance;
	}
	public String getPaytxfee() {
		return paytxfee;
	}
	public void setPaytxfee(String paytxfee) {
		this.paytxfee = paytxfee;
	}
	public String getHdmasterkeyid() {
		return hdmasterkeyid;
	}
	public void setHdmasterkeyid(String hdmasterkeyid) {
		this.hdmasterkeyid = hdmasterkeyid;
	}
	public String getTxcount() {
		return txcount;
	}
	public void setTxcount(String txcount) {
		this.txcount = txcount;
	}
	public String getKeypoololdest() {
		return keypoololdest;
	}
	public void setKeypoololdest(String keypoololdest) {
		this.keypoololdest = keypoololdest;
	}
	public String getKeypoolsize() {
		return keypoolsize;
	}
	public void setKeypoolsize(String keypoolsize) {
		this.keypoolsize = keypoolsize;
	}
	public String getUnlocked_until() {
		return unlocked_until;
	}
	public void setUnlocked_until(String unlocked_until) {
		this.unlocked_until = unlocked_until;
	}
	   
	
	   
	 public String getAbandoned() {
		return abandoned;
	}
	public void setAbandoned(String abandoned) {
		this.abandoned = abandoned;
	}
	
	
	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
   

	
	/*
	 * public List<String> getWalletconflicts() {
	 
			return walletconflicts;
		}
		public void setWalletconflicts(List<String> walletconflicts) {
			this.walletconflicts = walletconflicts;
		}
		*/
	
	/*	
		public String getBip125_replaceable() {
			return bip125_replaceable;
		}
		public void setBip125_replaceable(String bip125_replaceable) {
			this.bip125_replaceable = bip125_replaceable;
		}
   */
	
}
