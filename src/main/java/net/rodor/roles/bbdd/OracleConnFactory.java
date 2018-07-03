package net.rodor.roles.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnFactory {
	
	private  static OracleConnFactory instance;
	private OracleConnFactory(){}
	public  static OracleConnFactory getInstance(){
		if(instance == null){
			instance = new OracleConnFactory();
		}
		return instance;
	}

	public Connection getDBConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", "DES_SINFRADEF");
	    connectionProps.put("password", "JPASDYQ2");

	    conn = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=racwinscan.mdef.es)(PORT=1521)) (CONNECT_DATA=(SERVICE_NAME=BDPRE01)))",
                		connectionProps);
	    
	    return conn;
	}
}
