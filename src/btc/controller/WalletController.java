package btc.controller;

import java.util.List;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import btc.dao.AuditDAO;
import btc.to.AuditTo;

@Controller
public class WalletController
{
	@Autowired
	AuditDAO auditDao;
	//WalletNotifyTransaction walletnNotifyT;
	@RequestMapping("/wallet/notify/{txnID}")
	public ModelAndView walletNotify(@PathVariable("txnID") String txnID)
	{
		System.out.println("TxnID: "+txnID);
		ModelAndView model = new ModelAndView("page");
		
		int x=0;
		String paidAmt=null;
		/*
		WalletResponseTO wres=new WalletNotifyTransaction().getTransactionInform(txnID);
		if(wres.getWalletjsonresInner().getDetails().get(1).getCategory().equals("receive")){
			paidAmt=wres.getWalletjsonresInner().getDetails().get(1).getAmount();
		}
		List<AuditTo> list=auditDao.listAuditData(wres.getWalletjsonresInner().getDetails().get(1).getAddress());
		Iterator<AuditTo> it=list.iterator();
		AuditTo auditTo=it.next();
		System.out.println("List Size :"+list.size());
		System.out.println("txnID :"+wres.getWalletjsonresInner().getTxid());
		auditTo.setTxnID(wres.getWalletjsonresInner().getTxid());
		if(list.size()==1){
          if(auditTo.getPaid_Amt().equals("0.0000000000")){
			   System.out.println("update");
			   auditTo.setPaid_Amt(paidAmt);
		       x=auditDao.updateAuditTable(auditTo);
		    }else{
		    	System.out.println("insert-if");
		    	auditTo.setPaid_Amt(paidAmt);
		    	x=auditDao.insertIntoAuditTable(auditTo);
		    }
		}else {
			System.out.println("insert-else");
			auditTo.setPaid_Amt(paidAmt);
			x=auditDao.insertIntoAuditTable(auditTo);
		}
		*/
		return model;

	}
}