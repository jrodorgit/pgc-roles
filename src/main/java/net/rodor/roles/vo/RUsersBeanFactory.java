package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RUsersBeanFactory {

	private  volatile static RUsersBeanFactory instance;
	
	private RUsersBeanFactory(){}
	
	public  static RUsersBeanFactory getInstance(){
		if(instance == null){
			synchronized (RUsersBeanFactory.class){
				if(instance == null){
					instance = new RUsersBeanFactory();
				}
			}
		}
		return instance;
	}
	
	public RUsersBean mapRow(ResultSet rs) throws SQLException {
		
		RUsersBean miEntity= new RUsersBean() ;
		miEntity.id = rs.getLong(RUsersBean.ID);
		
		miEntity.usercode = rs.getString(RUsersBean.USERCODE);
		miEntity.nombre = rs.getString(RUsersBean.NOMBRE);
		miEntity.startdate = rs.getTimestamp(RUsersBean.STARTDATE);
		miEntity.enddate = rs.getTimestamp(RUsersBean.ENDDATE);
		
		return miEntity;
	}
	
}
