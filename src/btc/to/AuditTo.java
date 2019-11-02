package btc.to;

import java.io.Serializable;


public class AuditTo implements Serializable {
	
	/*Name       Null?    Type          
	---------- -------- ------------- 
	ID         NOT NULL NUMBER(35)    
	CUSTOMERID          VARCHAR2(50)  
	PUBKEY              VARCHAR2(100) 
	PRIVATEKEY          VARCHAR2(100) 
	BTCAMOUNT           NUMBER(30,10) 
	TXNID               VARCHAR2(100) 
	STATUS              VARCHAR2(100) 
	ACTION              VARCHAR2(50)  
	CONFIRM             NUMBER(3)
	*/
	
	  private String ID;      
	  private String CUSTOMERID;   
	  private String PUBKEY;  
	  private String PRIVATEKEY; 
	  
	  private String BTCAMOUNT;
	  private String TXNID;
	  private String STATUS;
	  private String ACTION;
	  private String CONFIRM;
	  
	 
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCUSTOMERID() {
		return CUSTOMERID;
	}
	public void setCUSTOMERID(String cUSTOMERID) {
		CUSTOMERID = cUSTOMERID;
	}
	public String getPUBKEY() {
		return PUBKEY;
	}
	public void setPUBKEY(String pUBKEY) {
		PUBKEY = pUBKEY;
	}
	public String getPRIVATEKEY() {
		return PRIVATEKEY;
	}
	public void setPRIVATEKEY(String pRIVATEKEY) {
		PRIVATEKEY = pRIVATEKEY;
	}
	public String getBTCAMOUNT() {
		return BTCAMOUNT;
	}
	public void setBTCAMOUNT(String bTCAMOUNT) {
		BTCAMOUNT = bTCAMOUNT;
	}
	public String getTXNID() {
		return TXNID;
	}
	public void setTXNID(String tXNID) {
		TXNID = tXNID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
	public String getCONFIRM() {
		return CONFIRM;
	}
	public void setCONFIRM(String cONFIRM) {
		CONFIRM = cONFIRM;
	}
	 

	  
}
