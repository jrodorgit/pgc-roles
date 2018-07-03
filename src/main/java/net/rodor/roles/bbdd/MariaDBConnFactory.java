package net.rodor.roles.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MariaDBConnFactory {

	private  static MariaDBConnFactory instance;
	private MariaDBConnFactory(){}
	public  static MariaDBConnFactory getInstance(){
		if(instance == null){
			instance = new MariaDBConnFactory();
		}
		return instance;
	}

	public Connection getDBConnection() throws SQLException {

	    Connection conn = null;
	   
	    conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pgc?user=jrodor&password=slug101");
	    return conn;
	}
}
