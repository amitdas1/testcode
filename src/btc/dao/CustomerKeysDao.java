package btc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.btc.adapter.dao.to.CustomerKeysTo;
import com.btc.adapter.dao.to.CustomerLedgerTo;



public class CustomerKeysDao  extends JdbcDaoSupport{

	
	public String getLastTxnID() {
		// TODO Auto-generated method stub
		String sql="select btcTxnID from codomotive.BtcTxnPool where txnID in (select max(txnID) from codomotive.BtcTxnPool)";
		String tran_id = (String)this.getJdbcTemplate().query(sql,new SingleRowExtractor(SingleRowExtractor.STRING));
		return tran_id;
	}
	
public synchronized int insertCustomerKeyDao(final CustomerKeysTo customerKeysTo){
		
		// id, customerid, fromadd, toadd, btcAmount, txnId, status, action         CUSTOMERHCXKEYS
		//String query=null;
		// Long tran_id =(long)0;
		Long tran_id = (Long)this.getJdbcTemplate().query("select coalesce(max(ID),0)+1 from customerkeys",new SingleRowExtractor(SingleRowExtractor.LONG));	 
		String query="insert into customerkeys (id,customerid, fromadd,toadd,btcAmount,txnId,status,action,currency) values(?,?,?,?,?,?,?,?,?)";
		 
		 System.out.println(query);
		 int x=this.getJdbcTemplate().update(query,
				   new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						int i = 0;
						ps.setObject(++i, tran_id);
						ps.setObject(++i, customerKeysTo.getCustomerid()!=null?customerKeysTo.getCustomerid():null);
						ps.setObject(++i, customerKeysTo.getFromadd()!=null?customerKeysTo.getFromadd():null);
						ps.setObject(++i, customerKeysTo.getToadd()!=null?customerKeysTo.getToadd():null);
						ps.setObject(++i, customerKeysTo.getBtcAmount()!=null?customerKeysTo.getBtcAmount():"0.0");
						ps.setObject(++i, customerKeysTo.getTxnId()!=null? customerKeysTo.getTxnId(): null);
						ps.setObject(++i, customerKeysTo.getStatus()!=null?customerKeysTo.getStatus():null);
						ps.setObject(++i, customerKeysTo.getAction()!=null?customerKeysTo.getAction():null);
						ps.setObject(++i, customerKeysTo.getCurrency()!=null?customerKeysTo.getCurrency():null);
						
						
					}
				});
		 if(customerKeysTo.getAction().equals("send")){
			 
			 Long id = (Long)this.getJdbcTemplate().query("select coalesce(max(txnID),0)+1 from codomotive.BtcTxnPool",new SingleRowExtractor(SingleRowExtractor.LONG));	
			 String queryTxnPoll="insert into codomotive.BtcTxnPool(txnID, toAdd,btcAmount,btcTxnID,  action, country) values(?,?,?,?,?,?)";
			 System.out.println(queryTxnPoll);
			 int y=this.getJdbcTemplate().update(queryTxnPoll,
					   new PreparedStatementSetter() {
						
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							int i = 0;
							ps.setObject(++i, id);
						//ps.setObject(++i, customerKeysTo.getCustomerid()!=null?customerKeysTo.getCustomerid():null);
						//ps.setObject(++i, customerKeysTo.getFromadd()!=null?customerKeysTo.getFromadd():null);
						ps.setObject(++i, customerKeysTo.getToadd()!=null?customerKeysTo.getToadd():null);
						ps.setObject(++i, customerKeysTo.getBtcAmount()!=null?customerKeysTo.getBtcAmount():"0.0");
						ps.setObject(++i, customerKeysTo.getTxnId()!=null? customerKeysTo.getTxnId(): null);
						//ps.setObject(++i, customerKeysTo.getStatus()!=null?customerKeysTo.getStatus():null);
						ps.setObject(++i, customerKeysTo.getAction()!=null?customerKeysTo.getAction():null);
						ps.setObject(++i, "us");
						
						
					}
				});
		 }
		return x;
		
		}


public int insertTRIGGERCustomerKeyDao(CustomerKeysTo customerKeysTo) {
	// TODO Auto-generated method stub
	// id, customerid, fromadd, toadd, btcAmount, txnId, status, action         CUSTOMERHCXKEYS
			//String query=null;
			// Long tran_id =(long)0;
			Long tran_id = (Long)this.getJdbcTemplate().query("select coalesce(max(ID),0)+1 from customertriggerkeys",new SingleRowExtractor(SingleRowExtractor.LONG));	 
			String query="insert into customerTriggerkeys (id,customerid,fromadd,toadd,triggeramount,txnId,status,action,currency) values(?,?,?,?,?,?,?,?,?)";
			 
			 System.out.println(query);
			 int x=this.getJdbcTemplate().update(query,
					   new PreparedStatementSetter() {
						
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							int i = 0;
							ps.setObject(++i, tran_id);
							ps.setObject(++i, customerKeysTo.getCustomerid()!=null?customerKeysTo.getCustomerid():null);
							ps.setObject(++i, customerKeysTo.getFromadd()!=null?customerKeysTo.getFromadd():null);
							ps.setObject(++i, customerKeysTo.getToadd()!=null?customerKeysTo.getToadd():null);
							ps.setObject(++i, customerKeysTo.getBtcAmount()!=null?customerKeysTo.getBtcAmount():"0.0");
							ps.setObject(++i, customerKeysTo.getTxnId()!=null? customerKeysTo.getTxnId(): null);
							ps.setObject(++i, customerKeysTo.getStatus()!=null?customerKeysTo.getStatus():null);
							ps.setObject(++i, customerKeysTo.getAction()!=null?customerKeysTo.getAction():null);
							ps.setObject(++i, customerKeysTo.getCurrency()!=null?customerKeysTo.getCurrency():null);
							
						}
					});
			
			return x;
			
}



//customer Trigger Code

	/*public CustomerKeysTo getreceiveKeyFromCustomerTriggers(String customerKeysTo) {

		String sql = "select nvl(PUBKEY, '0') as PUBKEY,nvl(PRIVATEKEY , '0') as PRIVATEKEY  from customer_triggers where CUSTOMERID = '"
				+ customerKeysTo + "'";	
		
		
		
		List<CustomerKeysTo> customerr = (List<CustomerKeysTo>) this.getJdbcTemplate().query(sql,
				new RowMapper<CustomerKeysTo>() {
					@Override
					public CustomerKeysTo mapRow(ResultSet rs, int rno) throws SQLException {
						CustomerKeysTo customer = new CustomerKeysTo();

						
						customer.setSenderPublicKey(rs.getString("PUBKEY"));
						customer.setSenderPrivateKey(rs.getString("PRIVATEKEY"));
						
						//customer.setReceiverPublicKey(rs.getString("PUBKEY"));
					//	customer.setReceiverPrivateKey(rs.getString("PRIVATEKEY"));

						return customer;
					}
				});
		return customerr.get(0);

	}
	*/
	
	
	
	
	
	
	
	


public String getreceiveKeyFromCustomerTriggers(String customer_Id) {
	

	String sql= "select PUBKEY  from customer_triggers where CUSTOMERID = '"+customer_Id+"'";

		
		String Status = (String)this.getJdbcTemplate().query(sql,new SingleRowExtractor(SingleRowExtractor.STRING));
		System.out.println(Status+"::::statusss");
		return Status;
	
	
}
	
	
	/*public CustomerKeysTo getreceivePaybitoOtherEtc(String customerKeysTo) {
 		String sql= "select nvl(etc_key, '0') as etc_key from customer_ledger where CUSTOMER_ID = '"+customerKeysTo+"'";

 	   System.out.println(sql);
 	// customerid, fromadd, toadd, btcAmount, txnId, status, action
 	
 	    List<CustomerKeysTo> customerr =  (List<CustomerKeysTo>)this.getJdbcTemplate().query(
 				sql,				
 				   new RowMapper<CustomerKeysTo>(){
 					@Override
 					public CustomerKeysTo mapRow(ResultSet rs,int rno)throws SQLException{
 						CustomerKeysTo customer=new CustomerKeysTo();
 				
 						customer.setReceiverPublicKey(rs.getString("etc_key"));
 						
 						
 						return customer;
 					}
 				});		
 		return customerr.get(0);

 	}  
   */
	
	
	
	
	
	
	
	
	
	





public synchronized CustomerLedgerTo getCustomerLedger(CustomerLedgerTo customer){

		
		final String query = "select TransactionID, customer_ID, customer_name, btc_balance,"
				+ " fiat_balance, Buy_btc, sell_btc, BCC_BALANCE, BUY_BCC, SELL_BCC, ETH_BALANCE, BUY_ETH, SELL_ETH, private_key, "
				+ "HCX_PRIVKEY,HCX_PUBKEY,HCX_BALANCE,BUY_HCX,SELL_HCX, "
				+ "IEC_PRIVKEY,IEC_PUBKEY,IEC_BALANCE,BUY_IEC,SELL_IEC,ltc_BALANCE,BUY_ltc,SELL_ltc,DIAM_PRIVKEY,DIAM_PUBKEY,DIAM_BALANCE,BUY_DIAM,SELL_DIAM,TRIGGERS_PRIVKEY,TRIGGERS_PUBKEY,Triggers_BALANCE,BUY_Triggers,SELL_Triggers, "
				+ "TRIGX_BALANCE, TRIGX_PRIVKEY,TRIGX_PUBKEY, BUY_TRIGX,SELL_TRIGX,ETC_BALANCE, BUY_ETC, SELL_ETC,BSV_BALANCE, BUY_BSV, SELL_BSV "
				+ "from customer_ledger WHERE customer_ID = ?";

		 System.out.println("customer_ledger table=="+query);
	     return getJdbcTemplate().query(query , new PreparedStatementSetter() {				
			@Override
			public void setValues(PreparedStatement arg0) throws SQLException {
				// TODO Auto-generated method stub
				arg0.setString(1, customer.getCustomerId());
				//arg0.setString(2, customerId);
			}
	    }
	, new ResultSetExtractor<List<CustomerLedgerTo>>() {
		@Override
		public List<CustomerLedgerTo> extractData(ResultSet rs) throws SQLException {
		List<CustomerLedgerTo> lclt = new ArrayList<CustomerLedgerTo>();
		if(rs.next()){
			CustomerLedgerTo clt = new CustomerLedgerTo();
			clt.setTransactionId(rs.getString("TransactionID"));
			clt.setCustomerId(rs.getString("customer_ID"));
			clt.setCustomerName(rs.getString("customer_name"));
			clt.setBtcBalance(""+rs.getObject("btc_balance"));
			clt.setFiatBalance(""+rs.getObject("fiat_balance"));
			clt.setBuyBtc(""+rs.getObject("Buy_btc"));
			clt.setSellBtc(""+rs.getObject("sell_btc"));
			clt.setPrivateKey(rs.getString("private_key"));
			clt.setBccBalance(""+rs.getObject("BCC_BALANCE"));
			clt.setEthBalance(""+rs.getObject("ETH_BALANCE"));			
			clt.setBuyBcc(""+rs.getObject("BUY_BCC"));
			clt.setSellBcc(""+rs.getObject("SELL_BCC"));
			clt.setBuyEth(""+rs.getObject("BUY_ETH"));
			clt.setSellEth(""+rs.getObject("SELL_ETH"));
			clt.setHcx_privKey(rs.getString("HCX_PRIVKEY"));
			clt.setHcx_pubKey(rs.getString("HCX_PUBKEY"));
			clt.setHcx_balance(""+rs.getObject("HCX_BALANCE"));
			clt.setBuyhcx(rs.getString("BUY_HCX"));
			clt.setSellhcx(rs.getString("SELL_HCX"));
			
			clt.setIec_privKey(rs.getString("IEC_PRIVKEY"));
			clt.setIec_pubKey(rs.getString("IEC_PUBKEY"));
			clt.setIec_balance(""+rs.getObject("IEC_BALANCE"));
			clt.setBuyIec(rs.getString("BUY_IEC"));
			clt.setSellIec(rs.getString("SELL_IEC"));
			clt.setLtc_balance(""+rs.getObject("LTC_BALANCE"));
			clt.setBuyLtc(rs.getString("BUY_LTC"));
			clt.setSellLtc(rs.getString("SELL_LTC"));
			//diam
			clt.setDiam_privKey(rs.getString("DIAM_PRIVKEY"));
			clt.setDiam_pubKey(rs.getString("DIAM_PUBKEY"));
			clt.setDiam_balance(""+rs.getObject("DIAM_BALANCE"));
			clt.setBuyDiam(rs.getString("BUY_DIAM"));
			clt.setSellDiam(rs.getString("SELL_DIAM"));
			//TRIG
			clt.setTriggers_privKey(rs.getString("Triggers_PRIVKEY"));
			clt.setTriggers_pubKey(rs.getString("Triggers_PUBKEY"));
			clt.setTriggers_balance(""+rs.getObject("Triggers_BALANCE"));
			clt.setBuyTriggers(rs.getString("BUY_TRIGGERS"));
			clt.setSellTriggers(rs.getString("SELL_TRIGGERS"));
			
			
			//TRIGX
		//	TRIGX_BALANCE, TRIGX_PRIVKEY,TRIGX_PUBKEY, BUY_TRIGX,SELL_TRIGX 
			clt.setTrigx_privKey(rs.getString("TRIGX_PRIVKEY"));
			clt.setTriggers_pubKey(rs.getString("TRIGX_PUBKEY"));
			clt.setTrigx_balance(rs.getString("TRIGX_BALANCE"));
			clt.setBuytrigx(rs.getString("BUY_TRIGX"));
			clt.setSelltrigx(rs.getString("SELL_TRIGX"));
			//ETC
			clt.setEtcBalance(""+rs.getObject("ETC_BALANCE"));	
			clt.setBuyEtc(""+rs.getObject("BUY_ETC"));
			clt.setSellEtc(""+rs.getObject("SELL_ETC"));
			
			//BSV
			clt.setBsvBalance(""+rs.getObject("BSV_BALANCE"));	
			clt.setBuyBsv(""+rs.getObject("BUY_BSV"));
			clt.setSellBsv(""+rs.getObject("SELL_BSV"));

			//ZEC
			/*clt.setZecBalance(""+rs.getObject("ZEC_BALANCE"));	
			clt.setBuyZec(""+rs.getObject("BUY_ZEC"));
			clt.setSellZec(""+rs.getObject("SELL_ZEC"));*/
			
			
			lclt.add(clt);
			
		}
		return lclt;
	}}).get(0);
}

}
