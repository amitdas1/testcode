/**
 * 
 */
package btc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class SingleRowExtractor implements ResultSetExtractor{
	int type;
	public static final int STRING = 1;
	public static final int INTEGER = 2;
	public static final int LONG = 3;
	public static final int TIMESTAMP = 4;
	public static final int DATE = 5;
	/**
	 * @param type
	 */
	public SingleRowExtractor(int type) {
		this.type = type;
	}
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		if(rs.next()) {
			switch( type){
			case STRING :
				return rs.getString(1);
			case INTEGER : 
				return rs.getInt(1);
			case LONG :
				return rs.getLong(1);			
			case TIMESTAMP:
					return rs.getTimestamp(1);
			case DATE:
				return rs.getDate(1);
			default :
				return rs.getObject(1);
				
			}
		}
		return null;
	}
	
	
}