package net.rodor.roles.test;

import java.sql.SQLException;
import java.util.Collection;

import junit.framework.TestCase;
import net.rodor.roles.RolesException;
import net.rodor.roles.RolesLoader;
import net.rodor.roles.RolesLoaderInt;
import net.rodor.roles.vo.RFunctionBean;
import net.rodor.roles.vo.RUsersBean;


public class PGCRolesLoaderTest extends TestCase{

	
	public void testGetFunctionsByUserApp(){
		
		RolesLoaderInt rolesLoader = RolesLoader.getInstance();
		Collection<RFunctionBean> functions=null;
		try {
			functions = rolesLoader.getFuncsByUserApp("APP_4", "USER_41", null);
			System.out.println("Funcionalidades del usuario:"+functions.toString());
		} catch (SQLException | RolesException e) {
			e.printStackTrace();
		}
		assertEquals(1, functions.size());
		
		
	}
	
	public void testGetUsersByFunctionApp(){
		
		RolesLoaderInt rolesLoader = RolesLoader.getInstance();
		Collection<RUsersBean> users=null;
		try {
			users = rolesLoader.getUsersByFuncApp("APP_4", "ACCESO SERV 411", null);
			System.out.println("Usuarios que tiene funcionalidad en app:"+users.toString());
		} catch (SQLException | RolesException e) {
			e.printStackTrace();
		}
		assertEquals(1, users.size());
		
		
	}
	

}
