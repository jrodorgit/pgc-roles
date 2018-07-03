package net.rodor.roles.bbdd;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MariaDBDSConnFactory {

	private  static MariaDBDSConnFactory instance;
	private MariaDBDSConnFactory(){}
	public  static MariaDBDSConnFactory getInstance(){
		if(instance == null){
			instance = new MariaDBDSConnFactory();
		}
		return instance;
	}

	public Connection getDBConnection() throws SQLException {
		String DATASOURCE_CONTEXT = "java:/MariaDBPGC";
	    
	    Connection conn = null;
	    try {
	      Context initialContext = new InitialContext();
	      DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
	      if (datasource != null) {
	        conn = datasource.getConnection();
	      }
	      else {
	    	  System.out.println("Failed to lookup datasource.");
	      }
	    }
	    catch ( NamingException ex ) {
	    	System.out.println("Cannot get connection: " + ex);
	    }
	    catch(SQLException ex){
	    	System.out.println("Cannot get connection: " + ex);
	    }
	    System.out.println("------------ Conn from DS-------------- ");
	    return conn;   
	}
}
