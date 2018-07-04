package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RRolesBeanFactory {

	private  volatile static RRolesBeanFactory instance;
	
	private RRolesBeanFactory(){}
	public  static RRolesBeanFactory getInstance(){
		if(instance == null){
			synchronized (RRolesBeanFactory.class){
				if(instance == null){
					instance = new RRolesBeanFactory();
				}
			}
		}
		return instance;
	}
	public RRolBean mapRow(ResultSet rs) throws SQLException {
		
		RRolBean miEntity= new RRolBean() ;
		miEntity.id = rs.getLong(RRolBean.ID);
		miEntity.appcode = rs.getString(RRolBean.APPCODE);
		miEntity.rolcode = rs.getString(RRolBean.ROLCODE);
		miEntity.rolname = rs.getString(RRolBean.ROLNAME);
		miEntity.roldesc = rs.getString(RRolBean.ROLDESC);
		
		return miEntity;
	}
	
}
