package btc.service;

import java.io.InputStream;
import java.util.Properties;

//import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Base64;

public class CommonUtil {

	private static final Log logger = LogFactory.getLog(CommonUtil.class);
	
	public String getProperty(String name) {
	   	     String propertyVal="";
			 Properties prop = new Properties();
			 
			try {
				InputStream propertiesFile = this.getClass().getClassLoader().getResourceAsStream("data.properties");
		
				prop.load(propertiesFile);
				propertyVal = prop.getProperty(name);
//				if(logger.isInfoEnabled()) logger.info(" IN  :: getProperty name : "+name+" Val : "+  propertyVal);
				if(name.equalsIgnoreCase("USER")||name.equalsIgnoreCase("PASSWORD")){
				byte[] base64decodedBytes = Base64.getDecoder().decode(propertyVal);
				String strVal=new String(base64decodedBytes, "utf-8");
				//System.out.println("value :"+strVal);
				return strVal;
				}else{
					return propertyVal;
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return propertyVal;
		}
}
