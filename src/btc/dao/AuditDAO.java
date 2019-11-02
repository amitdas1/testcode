package btc.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.btc.adapter.dao.to.CustomerKeysTo;

import btc.to.AuditTo;




@Repository

public class AuditDAO  extends JdbcDaoSupport {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	private static final Log logger = LogFactory.getLog(AuditDAO.class);
	

	public int insertIntoAuditTable( AuditTo auditTo){
		
		final Long DataId = (Long)this.getJdbcTemplate().query("select coalesce(max(ID),0)+1 from CUSTOMER_TRIGGERS",
				new SingleRowExtractor(SingleRowExtractor.LONG));
		//final Timestamp timestampNow = (Timestamp)this.getJdbcTemplate().query("select now()",
				//new SingleRowExtractor(SingleRowExtractor.TIMESTAMP));
		System.out.println(DataId);
		//System.out.println(timestampNow);
		
		
		String strSql="INSERT INTO CUSTOMER_TRIGGERS(ID, CUSTOMERID, PUBKEY,"
				+ " PRIVATEKEY,TRIGGERAMOUNT,TXNID,STATUS,ACTION,CONFIRM,currency) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		
	    System.out.println(strSql);
	
		int x=this.getJdbcTemplate().update(strSql,
				   new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						int i = 0;
						ps.setObject(++i, DataId);
						ps.setObject(++i, auditTo.getCUSTOMERID());
					    ps.setObject(++i, auditTo.getPUBKEY()!=null?auditTo.getPUBKEY():null);
						ps.setObject(++i, auditTo.getPRIVATEKEY()!=null?auditTo.getPRIVATEKEY():null);
						ps.setObject(++i, auditTo.getBTCAMOUNT()!=null?auditTo.getBTCAMOUNT():"0.0");
						ps.setObject(++i, auditTo.getTXNID()!=null?auditTo.getTXNID():null);
					    ps.setObject(++i, auditTo.getSTATUS()!=null?auditTo.getSTATUS():"pending");
						ps.setObject(++i, auditTo.getACTION()!=null?auditTo.getACTION():"0");
						ps.setObject(++i, auditTo.getCONFIRM()!=null?auditTo.getCONFIRM():null);
						ps.setObject(++i,"triggers");
						
						//ps.setObject(++i, timestampNow);
					}
				});
	
		return x;
	}

	//Trigger Sending postion code
	
	
public int insertIntoSendingAuditTable( AuditTo auditTo){
		
		final Long DataId = (Long)this.getJdbcTemplate().query("select coalesce(max(ID),0)+1 from CUSTOMER_TRIGGERS",
				new SingleRowExtractor(SingleRowExtractor.LONG));
		//final Timestamp timestampNow = (Timestamp)this.getJdbcTemplate().query("select now()",
				//new SingleRowExtractor(SingleRowExtractor.TIMESTAMP));
		System.out.println(DataId);
		//System.out.println(timestampNow);
		
		
		String strSql="INSERT INTO CUSTOMER_TRIGGERS(ID, CUSTOMERID, PUBKEY,"
				+ " PRIVATEKEY,TRIGGERAMOUNT,TXNID,STATUS,ACTION,CONFIRM,currency) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		
	    System.out.println(strSql);
	
		int x=this.getJdbcTemplate().update(strSql,
				   new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						int i = 0;
						ps.setObject(++i, DataId);
						ps.setObject(++i, auditTo.getCUSTOMERID());
					    ps.setObject(++i, auditTo.getPUBKEY()!=null?auditTo.getPUBKEY():null);
						ps.setObject(++i, auditTo.getPRIVATEKEY()!=null?auditTo.getPRIVATEKEY():null);
						ps.setObject(++i, 0.0);
						ps.setObject(++i, auditTo.getTXNID()!=null?auditTo.getTXNID():null);
					    ps.setObject(++i, auditTo.getSTATUS()!=null?auditTo.getSTATUS():"pending");
						ps.setObject(++i, auditTo.getACTION()!=null?auditTo.getACTION():"0");
						ps.setObject(++i, auditTo.getCONFIRM()!=null?auditTo.getCONFIRM():null);
						ps.setObject(++i,"triggers");
						
						//ps.setObject(++i, timestampNow);
					}
				});
	
		return x;
	}

	
	
	
	
	
	public int insertTRIGGERCustomerKeyDao( AuditTo auditTo) {
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
								ps.setObject(++i, auditTo.getCUSTOMERID()!=null?auditTo.getCUSTOMERID():null);
								ps.setObject(++i, auditTo.getPUBKEY()!=null?auditTo.getPUBKEY():null);
								ps.setObject(++i,"null");
								ps.setObject(++i, auditTo.getBTCAMOUNT()!=null?auditTo.getBTCAMOUNT():"0.0");
								ps.setObject(++i, auditTo.getTXNID()!=null? auditTo.getTXNID(): null);
								ps.setObject(++i, "pending");
								ps.setObject(++i,"receive");
								ps.setObject(++i, "triggers");
								
							}
						});
				
				return x;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<AuditTo> listAuditData(AuditTo auditTo) {
		
		String strSql = "select  PUBKEY from customer_triggers where customerid = '"+auditTo.getCUSTOMERID()+"' ";
		
		System.out.println(strSql);
		
		final List<AuditTo> auditDataList =  (List<AuditTo>)this.getJdbcTemplate().query(
				
				strSql,				
				   new RowMapper<AuditTo>(){
					@Override
					public AuditTo mapRow(ResultSet rs, int index) throws SQLException {
						
						AuditTo auditTo = new AuditTo();
						
						auditTo.setPUBKEY(rs.getString("PUBKEY"));
						
						
						return auditTo;
					}
				});		
		return auditDataList;
	
	}
	
	
	//check for customerTriggerKeys for publickey
public List<AuditTo> listcustomertriggersData(AuditTo auditTo) {
		
		String strSql = "select  fromadd from customerTriggerkeys where customerid = '"+auditTo.getCUSTOMERID()+"' ";
		
		System.out.println("listcustomertriggersDatastrSql"+strSql);
		
		final List<AuditTo> auditDataList =  (List<AuditTo>)this.getJdbcTemplate().query(
				
				strSql,				
				   new RowMapper<AuditTo>(){
					@Override
					public AuditTo mapRow(ResultSet rs, int index) throws SQLException {
						
						AuditTo auditTo = new AuditTo();
						
						auditTo.setPUBKEY(rs.getString("fromadd"));
						
						
						return auditTo;
					}
				});		
		return auditDataList;
	
	}
	



//*****************************************************************************

public String getreceiveKeyFromCustomerTriggers(String customerKeysTo) {
	

	String sql= "select fromAdd  from customerTriggerkeys where CUSTOMERID = '"+customerKeysTo+"'";

		
		String Status = (String)this.getJdbcTemplate().query(sql,new SingleRowExtractor(SingleRowExtractor.STRING));
		System.out.println(Status+"::::statusss");
		return Status;
	
	
}


}
