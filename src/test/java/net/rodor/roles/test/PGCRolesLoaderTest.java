package net.rodor.roles.test;

import java.sql.SQLException;
import java.util.Collection;

import junit.framework.TestCase;
import net.rodor.roles.RolesException;
import net.rodor.roles.RolesLoader;
import net.rodor.roles.RolesLoaderInt;
import net.rodor.roles.vo.RFunctionBean;


public class PGCRolesLoaderTest extends TestCase{

	
	public void testLoadActiveDomain(){
		
		RolesLoaderInt scopeLoader = RolesLoader.getInstance();
		Collection<RFunctionBean> functions=null;
		try {
			functions = scopeLoader.getFuncsByUserApp("APP_4", "USER_41", null);
			System.out.println("Funcionalidades del usuario:"+functions.toString());
		} catch (SQLException | RolesException e) {
			e.printStackTrace();
		}
		assertEquals(1, functions.size());
		
		
	}
	

}
