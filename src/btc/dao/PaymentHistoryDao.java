package btc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


import com.btc.adapter.dao.to.PaymentHistoryTo;

public class PaymentHistoryDao extends JdbcDaoSupport {

public synchronized int insertPaymentHistory(PaymentHistoryTo payment) {
		
//		Long tran_id = (Long)this.getJdbcTemplate().query("select coalesce(max(TransactionID),0)+1 from payment_history",new SingleRowExtractor(SingleRowExtractor.LONG));
	 //    Long tran_id = (Long)this.getJdbcTemplate().query("select PAYMENT_HISTORY_SEQ.NEXTVAL from dual",new SingleRowExtractor(SingleRowExtractor.LONG));
		final Timestamp timestamp = (Timestamp)this.getJdbcTemplate().query("select current_timestamp from dual",new SingleRowExtractor(SingleRowExtractor.TIMESTAMP));
//		payment.setTransactionId(tran_id.toString());
//		System.out.println("Transacion id: "+tran_id);
		System.out.println("timestamp"+timestamp);
		System.out.println("TransactionId value before  "+payment.getTransactionId());
		String sql="insert into payment_history (customer_ID, orderid,debit_fiat_amount, credit_fiat_amount, "
				+ "debit_btc_amount, credit_btc_amount,txnCharge, sgst, cgst, miningFees,fiat_txnID,btc_txnID, "
				+ "transaction_timestamp, description, action, bcc_txnID, eth_txnid, DEBIT_BCC_AMOUNT, "
				+ "CREDIT_BCC_AMOUNT,DEBIT_ETH_AMOUNT,CREDIT_ETH_AMOUNT, "
				+ "hcx_txnID,DEBIT_HCX_AMOUNT,CREDIT_HCX_AMOUNT,currency, BASECURRENCY,fiat_amount,status,networkFees,"
				+ "iec_txnID,DEBIT_IEC_AMOUNT,CREDIT_IEC_AMOUNT,ltc_txnID,DEBIT_LTC_AMOUNT,CREDIT_LTC_AMOUNT,"
				+ "DIAM_txnID,DEBIT_DIAM_AMOUNT,CREDIT_DIAM_AMOUNT, TRIGGERS_TXNID,DEBIT_TRIGGERS_AMOUNT,CREDIT_TRIGGERS_AMOUNT, TRIGX_TXNID,DEBIT_TRIGX_AMOUNT,CREDIT_TRIGX_AMOUNT,BSV_TXNID,DEBIT_BSV_AMOUNT,CREDIT_BSV_AMOUNT,etc_txnid,DEBIT_ETC_AMOUNT,CREDIT_ETC_AMOUNT,CORPORATE_REMIT_ID) "
				+ "values (?, ?,?, ?,?, ?,?, ?, ?, ?,?,?,?, ?, ?, ?, ?,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?)";
		  
	
		
		
		  System.out.println("insert after"+sql);
		int x=this.getJdbcTemplate().update(sql,
				   new PreparedStatementSetter() {					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						
						int i = 0;
					//	ps.setObject(++i,payment.getTransactionId()) ;
		  				ps.setString(++i, payment.getCustomerId());
		  				ps.setString(++i, payment.getOrderID()!=null?payment.getOrderID():"-");
		  				ps.setObject(++i, payment.getDebitFiatAmount()!=null?payment.getDebitFiatAmount():"0.0");
		  				ps.setObject(++i,payment.getCreditFiatAmount()!= null ? payment.getCreditFiatAmount() : "0.0");
		  			    ps.setObject(++i,payment.getDebitBtcAmount()!= null ? payment.getDebitBtcAmount() : "0.0" );
		  			    ps.setObject(++i, payment.getCreditBtcAmount()!= null ? payment.getCreditBtcAmount() : "0.0");
		  			    ps.setObject(++i, payment.getTxnCharge()!=null ? payment.getTxnCharge() :"0.0");
		  			    ps.setObject(++i, payment.getChargeSGST()!=null ? payment.getChargeSGST() :"0.0");
		  			    ps.setObject(++i, payment.getChargeCGST()!=null ? payment.getChargeCGST() :"0.0");
		  			    ps.setObject(++i, payment.getMining_fees()!=null ? payment.getMining_fees() :"0.0");
		  			    ps.setObject(++i, payment.getFiatTransactionId()!=null ? payment.getFiatTransactionId() :"-");
		  			    ps.setObject(++i, payment.getBtcTransactionId()!=null ? payment.getBtcTransactionId() :"-");
		  			    ps.setTimestamp(++i, timestamp);
		  			    ps.setString(++i, payment.getDescription()!=null? payment.getDescription():"oops");
		  			    ps.setString(++i, payment.getAction()!=null?payment.getAction():"pending");
		  			    ps.setString(++i, payment.getBccTransactionId()!=null?payment.getBccTransactionId():"-");
		  			    ps.setString(++i, payment.getEthTransactionId()!=null?payment.getEthTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitBccAmount()!=null?payment.getDebitBccAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditBccAmount()!=null?payment.getCreditBccAmount():"0.0");
		  			    ps.setString(++i, payment.getDebitEthAmount()!=null?payment.getDebitEthAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditEthAmount()!=null?payment.getCreditEthAmount():"0.0");
		  			    ps.setString(++i, payment.getHcxTransactionId()!=null?payment.getHcxTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitHcxAmount()!=null?payment.getDebitHcxAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditHcxAmount()!=null?payment.getCreditHcxAmount():"0.0");
		  			    ps.setString(++i, payment.getCurrency()!=null?payment.getCurrency():"-");
		  			    ps.setString(++i, payment.getBaseCurrency()!=null?payment.getBaseCurrency():"-");
		  			    ps.setString(++i, payment.getFiatAmount()!=null?payment.getFiatAmount():"0.0");
		  			    ps.setString(++i, payment.getStatus()!=null? payment.getStatus():"0");
		  			    ps.setString(++i, payment.getNetworkFees()!=null? payment.getNetworkFees():"0.0");
		  			    ps.setString(++i, payment.getIecTransactionId()!=null?payment.getIecTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitIecAmount()!=null?payment.getDebitIecAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditIecAmount()!=null?payment.getCreditIecAmount():"0.0");
		  			   
		  			    ps.setString(++i, payment.getLtcTransactionId()!=null?payment.getLtcTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitLtcAmount()!=null?payment.getDebitLtcAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditLtcAmount()!=null?payment.getCreditLtcAmount():"0.0");
		  			   
		  			    ps.setString(++i, payment.getDiamTransactionId()!=null?payment.getDiamTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitDiamAmount()!=null?payment.getDebitDiamAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditDiamAmount()!=null?payment.getCreditDiamAmount():"0.0");
		  			    
		  			    ps.setString(++i, payment.getTriggersTransactionId()!=null?payment.getTriggersTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitTriggersAmount()!=null?payment.getDebitTriggersAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditTriggersAmount()!=null?payment.getCreditTriggersAmount():"0.0");
		  			    
		  			    ps.setString(++i, payment.getTrigxTransactionId()!=null?payment.getTrigxTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitTrigxAmount()!=null?payment.getDebitTrigxAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditTrigxAmount()!=null?payment.getCreditTrigxAmount():"0.0");
		  			    
		  			    ps.setString(++i, payment.getBsvTransactionId()!=null?payment.getBsvTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitBsvAmount()!=null?payment.getDebitBsvAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditBsvAmount()!=null?payment.getCreditBsvAmount():"0.0");
		  			    
		  			    ps.setString(++i, payment.getEtcTransactionId()!=null?payment.getEtcTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitEtcAmount()!=null?payment.getDebitEtcAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditEtcAmount()!=null?payment.getCreditEtcAmount():"0.0");
		  			    
		  			    /*ps.setString(++i, payment.getZecTransactionId()!=null?payment.getZecTransactionId():"-");
		  			    ps.setString(++i, payment.getDebitZecAmount()!=null?payment.getDebitZecAmount():"0.0");
		  			    ps.setString(++i, payment.getCreditZecAmount()!=null?payment.getCreditZecAmount():"0.0");*/
		  			    
		  			  //ADDED corporate remit id
		  			    ps.setObject(++i, payment.getCorporate_remit_id());
		  		
					}
				});
		
	
		Long tran_id=0L;
		if(payment.getAction().equalsIgnoreCase("send") ||payment.getAction().equalsIgnoreCase("received")){
			 tran_id = (Long)this.getJdbcTemplate().query("select max(transactionid) from (select * from payment_history WHERE customer_id ='"+payment.getCustomerId()+"' and currency = '"+payment.getCurrency()+"' ORDER BY transactionid desc)",new SingleRowExtractor(SingleRowExtractor.LONG));
			System.out.println("tran_id if"+tran_id);
		} else {
		
		 tran_id = (Long)this.getJdbcTemplate().query("select max(transactionid) from (select * from payment_history WHERE customer_id ='"+payment.getCustomerId()+"' ORDER BY transactionid desc)",new SingleRowExtractor(SingleRowExtractor.LONG));
		 System.out.println("tran_id else"+tran_id);	
		
	}
		
		System.out.println("Insert into payment_history......");
		
		System.out.println("Procedure txd id"+tran_id);
		System.out.println("tran_id"+tran_id);
		payment.setTransactionId(tran_id.toString());
		System.out.println("procedure call ");
	    Map<String,Object> ResultSet = callingProcedure(payment,tran_id);

	    System.out.println("Message ....: " + ResultSet.values());

	//start
	    List values = ResultSet.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
	    System.out.println("values : " + values + " :" + "Values [0]: " + values.get(0) + " :" + "Values [1]: " + values.get(1));
	    String id= "";
	    String msg="";
	  id = values.get(1).toString();
	  // id = "3";
	    switch(id) {

	    case "1"   : msg=values.get(0).toString();
	                System.out.println("*********Success fully call Procedure. Call case 1 *********" + msg);
	                statusInsertWithOne(payment.getCustomerId());
	                
	                
	                break;
	    case "2"   : msg=values.get(0).toString();
	                System.out.println("********* Success fully call Procedure. Call case 2 *********" + msg);
	                statusInsertWithOne(payment.getCustomerId());
	                break;
	                
	    case "null" :msg=values.get(0).toString();
	                System.out.println("********* Fail. Call case null *********" + msg);
	                
	                statusInsertWithZero(payment.getCustomerId());
	                
	                 break;
	                 
	    default : msg=values.get(0).toString();
	                System.out.println("******************************* Roll back call due to call procedure failed************************************ " + msg);
	                String sqlQuery="delete from payment_history "+
	                        "where TRANSACTIONID='"+tran_id+"'";
	                    //System.out.println(sqlQuery);
	                System.out.println("id==="+id);
	                    x = this.getJdbcTemplate().update(sqlQuery);
	                    System.out.println(sqlQuery + " **** " + " No ofRows deleted " + x);
	                    if(x==1)
	                    {
	                    	String querySQL="insert into CHECKROLLBACK (status,customer_id) values(?,?)";
	                    	System.out.println(querySQL);
	                    	int x1=this.getJdbcTemplate().update(querySQL,
	                    			   new PreparedStatementSetter(){

	                    				@Override
	                    				public void setValues(PreparedStatement ps) throws SQLException {
	                    					// TODO Auto-generated method stub
	                    					int i = 0;
	                    					ps.setObject(++i,0);
	                    					ps.setString(++i,payment.getCustomerId());

	                    			}
	                    				
	                    		
	                    	});
	                    	return x1;
	                    	}
	                    
	    }
	    
	    //end
		
	//this.callingProcedure(payment, tran_id);
	    System.out.println("payment.getOrderID()xxxxx "+payment.getOrderID());
		return x;
		
	}

//----------------------new 

public synchronized int insertPaymentHistoryTriggerBtcDetails(PaymentHistoryTo payment) {
	
//	Long tran_id = (Long)this.getJdbcTemplate().query("select coalesce(max(TransactionID),0)+1 from payment_history",new SingleRowExtractor(SingleRowExtractor.LONG));
 //    Long tran_id = (Long)this.getJdbcTemplate().query("select PAYMENT_HISTORY_SEQ.NEXTVAL from dual",new SingleRowExtractor(SingleRowExtractor.LONG));
	final Timestamp timestamp = (Timestamp)this.getJdbcTemplate().query("select current_timestamp from dual",new SingleRowExtractor(SingleRowExtractor.TIMESTAMP));
//	payment.setTransactionId(tran_id.toString());
//	System.out.println("Transacion id: "+tran_id);
	System.out.println("timestamp"+timestamp);
	System.out.println("TransactionId value before  "+payment.getTransactionId());
	String sql="insert into triggers_btc_transaction_dtl (customer_ID, orderid,debit_fiat_amount, credit_fiat_amount, "
			+ "debit_btc_amount, credit_btc_amount,txnCharge, sgst, cgst, miningFees,fiat_txnID,btc_txnID, "
			+ "transaction_timestamp, description, action, bcc_txnID, eth_txnid, DEBIT_BCC_AMOUNT, "
			+ "CREDIT_BCC_AMOUNT,DEBIT_ETH_AMOUNT,CREDIT_ETH_AMOUNT, "
			+ "hcx_txnID,DEBIT_HCX_AMOUNT,CREDIT_HCX_AMOUNT,currency, BASECURRENCY,fiat_amount,status,networkFees,"
			+ "iec_txnID,DEBIT_IEC_AMOUNT,CREDIT_IEC_AMOUNT,ltc_txnID,DEBIT_LTC_AMOUNT,CREDIT_LTC_AMOUNT,"
			+ "DIAM_txnID,DEBIT_DIAM_AMOUNT,CREDIT_DIAM_AMOUNT, TRIGGERS_TXNID,DEBIT_TRIGGERS_AMOUNT,CREDIT_TRIGGERS_AMOUNT, TRIGX_TXNID,DEBIT_TRIGX_AMOUNT,CREDIT_TRIGX_AMOUNT,BSV_TXNID,DEBIT_BSV_AMOUNT,CREDIT_BSV_AMOUNT,etc_txnid,DEBIT_ETC_AMOUNT,CREDIT_ETC_AMOUNT,CORPORATE_REMIT_ID) "
			+ "values (?, ?,?, ?,?, ?,?, ?, ?, ?,?,?,?, ?, ?, ?, ?,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?)";
	  

	
	
	  System.out.println("insert after"+sql);
	int x=this.getJdbcTemplate().update(sql,
			   new PreparedStatementSetter() {					
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					
					int i = 0;
				//	ps.setObject(++i,payment.getTransactionId()) ;
	  				ps.setString(++i, payment.getCustomerId());
	  				ps.setString(++i, payment.getOrderID()!=null?payment.getOrderID():"-");
	  				ps.setObject(++i, payment.getDebitFiatAmount()!=null?payment.getDebitFiatAmount():"0.0");
	  				ps.setObject(++i,payment.getCreditFiatAmount()!= null ? payment.getCreditFiatAmount() : "0.0");
	  			    ps.setObject(++i,payment.getDebitBtcAmount()!= null ? payment.getDebitBtcAmount() : "0.0" );
	  			    ps.setObject(++i, payment.getCreditBtcAmount()!= null ? payment.getCreditBtcAmount() : "0.0");
	  			    ps.setObject(++i, payment.getTxnCharge()!=null ? payment.getTxnCharge() :"0.0");
	  			    ps.setObject(++i, payment.getChargeSGST()!=null ? payment.getChargeSGST() :"0.0");
	  			    ps.setObject(++i, payment.getChargeCGST()!=null ? payment.getChargeCGST() :"0.0");
	  			    ps.setObject(++i, payment.getMining_fees()!=null ? payment.getMining_fees() :"0.0");
	  			    ps.setObject(++i, payment.getFiatTransactionId()!=null ? payment.getFiatTransactionId() :"-");
	  			    ps.setObject(++i, payment.getBtcTransactionId()!=null ? payment.getBtcTransactionId() :"-");
	  			    ps.setTimestamp(++i, timestamp);
	  			    ps.setString(++i, payment.getDescription()!=null? payment.getDescription():"oops");
	  			    ps.setString(++i, payment.getAction()!=null?payment.getAction():"pending");
	  			    ps.setString(++i, payment.getBccTransactionId()!=null?payment.getBccTransactionId():"-");
	  			    ps.setString(++i, payment.getEthTransactionId()!=null?payment.getEthTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitBccAmount()!=null?payment.getDebitBccAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditBccAmount()!=null?payment.getCreditBccAmount():"0.0");
	  			    ps.setString(++i, payment.getDebitEthAmount()!=null?payment.getDebitEthAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditEthAmount()!=null?payment.getCreditEthAmount():"0.0");
	  			    ps.setString(++i, payment.getHcxTransactionId()!=null?payment.getHcxTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitHcxAmount()!=null?payment.getDebitHcxAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditHcxAmount()!=null?payment.getCreditHcxAmount():"0.0");
	  			    ps.setString(++i, payment.getCurrency()!=null?payment.getCurrency():"-");
	  			    ps.setString(++i, payment.getBaseCurrency()!=null?payment.getBaseCurrency():"-");
	  			    ps.setString(++i, payment.getFiatAmount()!=null?payment.getFiatAmount():"0.0");
	  			    ps.setString(++i, payment.getStatus()!=null? payment.getStatus():"0");
	  			    ps.setString(++i, payment.getNetworkFees()!=null? payment.getNetworkFees():"0.0");
	  			    ps.setString(++i, payment.getIecTransactionId()!=null?payment.getIecTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitIecAmount()!=null?payment.getDebitIecAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditIecAmount()!=null?payment.getCreditIecAmount():"0.0");
	  			   
	  			    ps.setString(++i, payment.getLtcTransactionId()!=null?payment.getLtcTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitLtcAmount()!=null?payment.getDebitLtcAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditLtcAmount()!=null?payment.getCreditLtcAmount():"0.0");
	  			   
	  			    ps.setString(++i, payment.getDiamTransactionId()!=null?payment.getDiamTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitDiamAmount()!=null?payment.getDebitDiamAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditDiamAmount()!=null?payment.getCreditDiamAmount():"0.0");
	  			    
	  			    ps.setString(++i, payment.getTriggersTransactionId()!=null?payment.getTriggersTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitTriggersAmount()!=null?payment.getDebitTriggersAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditTriggersAmount()!=null?payment.getCreditTriggersAmount():"0.0");
	  			    
	  			    ps.setString(++i, payment.getTrigxTransactionId()!=null?payment.getTrigxTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitTrigxAmount()!=null?payment.getDebitTrigxAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditTrigxAmount()!=null?payment.getCreditTrigxAmount():"0.0");
	  			    
	  			    ps.setString(++i, payment.getBsvTransactionId()!=null?payment.getBsvTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitBsvAmount()!=null?payment.getDebitBsvAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditBsvAmount()!=null?payment.getCreditBsvAmount():"0.0");
	  			    
	  			    ps.setString(++i, payment.getEtcTransactionId()!=null?payment.getEtcTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitEtcAmount()!=null?payment.getDebitEtcAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditEtcAmount()!=null?payment.getCreditEtcAmount():"0.0");
	  			    
	  			    /*ps.setString(++i, payment.getZecTransactionId()!=null?payment.getZecTransactionId():"-");
	  			    ps.setString(++i, payment.getDebitZecAmount()!=null?payment.getDebitZecAmount():"0.0");
	  			    ps.setString(++i, payment.getCreditZecAmount()!=null?payment.getCreditZecAmount():"0.0");*/
	  			    
	  			  //ADDED corporate remit id
	  			    ps.setObject(++i, payment.getCorporate_remit_id());
	  		
				}
			});

	return x;
	
}






private Map<String,Object> callingProcedure(PaymentHistoryTo payment, long txnID) {

    // TODO Auto-generated method stub

    System.out.println("procedure in..:");
    SimpleJdbcCall  createUserProc = new SimpleJdbcCall(this.getJdbcTemplate()).withProcedureName("customer_balance");
    SqlParameterSource inParams =null;
    int counter=0;

     inParams = new MapSqlParameterSource().addValue("customer_id",    payment.getCustomerId())
             .addValue("transactionID",    txnID);

     Map<String, Object>  result = createUserProc.execute(inParams);
     System.out.println("In procedure customer_id :" +  payment.getCustomerId() + "transactionID : " + txnID);
     System.out.println(" Procudure executed *..." + result.values());


    return result;


}









public String getTxnMiningfees(String btc_amount) {
	// TODO Auto-generated method stub
	String strSql="select max(feerate) as feerate  from BTC_FEES where FROMFEE <="+btc_amount;
	String feeMining = (String)this.getJdbcTemplate().query(strSql,new SingleRowExtractor(SingleRowExtractor.STRING));
	return feeMining;
}
@SuppressWarnings("unused")
public String statuscall(String customerId) {
	
	//String strSql="select status  from rollback where customer_id >='"+customerId+"' order by ID desc";
	String strSql = "select status from (select * from CHECKROLLBACK WHERE customer_id ='"+customerId+"' ORDER BY ID desc) WHERE ROWNUM =1";

	System.out.println("roll back "+strSql);
	String Status = (String)this.getJdbcTemplate().query(strSql,new SingleRowExtractor(SingleRowExtractor.STRING));
	if (Status == null || Status.equals("null") || Status.equals(null)) {
		Status ="0";
		
	}
	return Status;
}


//---------------------------------------------------------------------------------------Update bct Txid
public int updatePaymentHistoyBtcNodeTxid(PaymentHistoryTo payment){
		
	  String strSql="update payment_history set BTC_TXNID=?  where customer_ID = '"+payment.getCustomerId()+"' and TRANSACTIONID ='"+payment.getTransactionId()+"'";
		
	//  String strSql="update payment_history set BTC_TXNID=?  where customer_ID = '"+cusid+"' and TRANSACTIONID ='"+txno+"'";
	  System.out.println(strSql);
		System.out.println(strSql);
		int count=this.getJdbcTemplate().update(strSql,
			 	new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						int i = 0;
						ps.setObject(++i,payment.getBtcTransactionId());
					//	ps.setObject(++i,strTxnID);
					}
				});
		return count;
		
	}




public synchronized PaymentHistoryTo getPayment(PaymentHistoryTo payment){
	PaymentHistoryTo ph=new PaymentHistoryTo();
	final Timestamp d = (Timestamp)this.getJdbcTemplate().query("select max(transaction_timestamp) from payment_history where customer_id = '"+payment.getCustomerId()+"'",new SingleRowExtractor(SingleRowExtractor.TIMESTAMP));
	String sql="select * from payment_history WHERE customer_ID='"+payment.getCustomerId()+"' and TransactionID "
			+ "in (select max(TransactionID) from payment_history where customer_id = '"+payment.getCustomerId()+"')";
    System.out.println(sql);		
	
    final PaymentHistoryTo payments = (PaymentHistoryTo)this.getJdbcTemplate().query(sql,				
			     new ResultSetExtractor<PaymentHistoryTo>(){
		      public PaymentHistoryTo extractData(ResultSet rs) throws SQLException, DataAccessException {
					
		    	    //Payment_History ph=new Payment_History();
					if(rs.next()){							
						ph.setTransactionId(rs.getString("TransactionID"));
						ph.setCustomerId(rs.getString("customer_ID"));
						ph.setOrderID(rs.getString("ORDERID"));
						ph.setDebitFiatAmount(""+rs.getObject("debit_fiat_amount"));
						ph.setCreditFiatAmount(""+rs.getObject("credit_fiat_amount"));
						ph.setDebitBtcAmount(""+rs.getObject("debit_btc_amount"));
						ph.setCreditBtcAmount(""+rs.getObject("credit_btc_amount"));
						ph.setFiatTransactionId(rs.getString("fiat_txnID"));
						ph.setBtcTransactionId(rs.getString("btc_txnID"));
						ph.setClosingBtcBalance(""+rs.getObject("closing_btc_bal"));
						ph.setClosingFiatBalance(""+rs.getObject("closing_fiat_bal"));
						ph.setTransactionTimestamp(rs.getString("transaction_timestamp"));
						ph.setDescription(rs.getString("description"));
						ph.setAction(rs.getString("action"));
						ph.setDebitBccAmount(""+rs.getObject("debit_bcc_amount"));
						ph.setCreditBccAmount(""+rs.getObject("credit_bcc_amount"));
						ph.setClosingBccBalance(""+rs.getObject("closing_bcc_bal"));
						ph.setDebitEthAmount(""+rs.getObject("debit_eth_amount"));
						ph.setCreditEthAmount(""+rs.getObject("credit_eth_amount"));
						ph.setClosingEthBalance(""+rs.getObject("closing_eth_bal"));
						ph.setDebitHcxAmount(""+rs.getObject("debit_hcx_amount"));
						ph.setCreditHcxAmount(""+rs.getObject("credit_hcx_amount"));
						ph.setClosingHcxBalance(""+rs.getObject("closing_hcx_bal"));
						ph.setFiatTransactionId(rs.getString("bcc_txnID"));
						ph.setBtcTransactionId(rs.getString("eth_txnID"));
						ph.setBtcTransactionId(rs.getString("hcx_txnID"));
						
						ph.setDebitIecAmount(""+rs.getObject("debit_Iec_amount"));
						ph.setCreditIecAmount(""+rs.getObject("credit_Iec_amount"));
						ph.setClosingIecBalance(""+rs.getObject("closing_Iec_bal"));
						ph.setIecTransactionId(rs.getString("Iec_txnID"));
					
						ph.setDebitLtcAmount(""+rs.getObject("debit_ltc_amount"));
						ph.setCreditLtcAmount(""+rs.getObject("credit_ltc_amount"));
						ph.setClosingLtcBalance(""+rs.getObject("closing_ltc_bal"));
						ph.setLtcTransactionId(rs.getString("ltc_txnID"));
						//diam
						ph.setDebitDiamAmount(""+rs.getObject("debit_diam_amount"));
						ph.setCreditDiamAmount(""+rs.getObject("credit_diam_amount"));
						ph.setClosingDiamBalance(""+rs.getObject("closing_diam_bal"));
						ph.setDiamTransactionId(rs.getString("diam_txnID"));
						
						ph.setDebitTriggersAmount(""+rs.getObject("debit_triggers_amount"));
						ph.setCreditTriggersAmount(""+rs.getObject("credit_triggers_amount"));
						ph.setClosingTriggersBalance(""+rs.getObject("closing_triggers_bal"));
						ph.setTriggersTransactionId(rs.getString("triggers_txnID"));
						
						ph.setDebitTrigxAmount(""+rs.getObject("debit_trigx_amount"));
						ph.setCreditTrigxAmount(""+rs.getObject("credit_trigx_amount"));
						ph.setClosingTrigxBalance(""+rs.getObject("closing_trigx_bal"));
						ph.setTrigxTransactionId(rs.getString("trigx_txnID"));
						
						//bsv
						ph.setDebitBsvAmount(""+rs.getObject("debit_bsv_amount"));
						ph.setCreditBsvAmount(""+rs.getObject("credit_bsv_amount"));
						ph.setClosingBsvBalance(""+rs.getObject("closing_bsv_bal"));
						ph.setBsvTransactionId(rs.getString("bsv_txnID"));
						//Etc
						ph.setDebitEtcAmount(""+rs.getObject("debit_etc_amount"));
						ph.setCreditEtcAmount(""+rs.getObject("credit_etc_amount"));
						ph.setClosingEtcBalance(""+rs.getObject("closing_etc_bal"));
						//Zec
						/*ph.setDebitZecAmount(""+rs.getObject("debit_zec_amount"));
						ph.setCreditZecAmount(""+rs.getObject("credit_zec_amount"));
						ph.setClosingZecBalance(""+rs.getObject("closing_zec_bal"));*/
						
					}
					return ph;
					
				}
			});	
	
	
	return payments;
}


private void statusInsertWithOne(String CustomerId) {
	String query1="insert into CHECKROLLBACK (status,customer_id) values(?,?)";
	System.out.println("Meyhod .... statusInsertWithOne() : " + query1);
	int x11=this.getJdbcTemplate().update(query1,
			   new PreparedStatementSetter(){

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					int i = 0;
					ps.setObject(++i,1);
					ps.setString(++i, CustomerId);

			}
		
	});
	
}

private void statusInsertWithZero(String CustomerId) {
	String querySQL="insert into CHECKROLLBACK (status,customer_id) values(?,?)";
	System.out.println(querySQL);
	int x1=this.getJdbcTemplate().update(querySQL,
			   new PreparedStatementSetter(){

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					int i = 0;
					ps.setObject(++i,0);
					ps.setString(++i,CustomerId);

			}
		
	});
}


}
