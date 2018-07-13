package net.rodor.roles;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.roles.dao.RolesDAOImpl;
import net.rodor.roles.dao.RolesDAOInt;
import net.rodor.roles.vo.RFunctionBean;

public class RolesLoader implements RolesLoaderInt{
	

	private  static RolesLoader instance = new RolesLoader();
	
	private RolesLoader(){}
	public  static RolesLoader getInstance(){
		return instance;
	}

	public Collection<RFunctionBean> getFuncsByUserApp(String app, String usr, java.sql.Timestamp fecha) throws SQLException, RolesException{
		
		if( app == null || "".equalsIgnoreCase(app)){
			throw new RolesException(RolesException.NULL_APP);
		}
		if( usr == null || "".equalsIgnoreCase(usr)){
			throw new RolesException(RolesException.NULL_USR);
		}
		
		Collection<RFunctionBean> functions = null;
		try{
			RolesDAOInt dao = new RolesDAOImpl();
			functions = dao.getFuncsByUserApp(app, usr, fecha);
			
		} finally{
			
		}
			
		

		return functions;
		
	}
}
