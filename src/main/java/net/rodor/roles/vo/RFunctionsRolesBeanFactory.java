package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RFunctionsRolesBeanFactory {

	private  volatile static RFunctionsRolesBeanFactory instance;
	
	private RFunctionsRolesBeanFactory(){}
	
	public  static RFunctionsRolesBeanFactory getInstance(){
		if(instance == null){
			synchronized (RFunctionsRolesBeanFactory.class){
				if(instance == null){
					instance = new RFunctionsRolesBeanFactory();
				}
			}
		}
		return instance;
	}
	
	public RFunctionsRolesBean mapRow(ResultSet rs) throws SQLException {
		
		RFunctionsRolesBean miEntity= new RFunctionsRolesBean() ;
		miEntity.id = rs.getLong(RFunctionsRolesBean.ID);
		miEntity.idfunc = rs.getLong(RFunctionsRolesBean.IDFUNC);
		miEntity.idrol = rs.getLong(RFunctionsRolesBean.IDROL);
		
		return miEntity;
	}
	
}
