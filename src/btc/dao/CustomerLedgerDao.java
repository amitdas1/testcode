package btc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.btc.adapter.dao.to.CustomerLedgerTo;

public class CustomerLedgerDao extends JdbcDaoSupport {


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
				
					arg0.setString(1, customer.getCustomerId());
				
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

				
				
				
				lclt.add(clt);
				
			}
			return lclt;
		}}).get(0);
	}
}
