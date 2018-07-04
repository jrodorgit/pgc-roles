package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RGroupsBeanFactory {

	private  volatile static RGroupsBeanFactory instance;
	
	private RGroupsBeanFactory(){}
	public  static RGroupsBeanFactory getInstance(){
		if(instance == null){
			synchronized (RGroupsBeanFactory.class){
				if(instance == null){
					instance = new RGroupsBeanFactory();
				}
			}
		}
		return instance;
	}
	public RGroupsBean mapRow(ResultSet rs) throws SQLException {
		
		RGroupsBean miEntity= new RGroupsBean() ;
		miEntity.id = rs.getLong(RGroupsBean.ID);
		miEntity.appcode = rs.getString(RGroupsBean.APPCODE);
		miEntity.groupcode = rs.getString(RGroupsBean.GROUPCODE);
		miEntity.groupname = rs.getString(RGroupsBean.GROUPNAME);
		miEntity.groupdesc = rs.getString(RGroupsBean.GROUPDESC);
		
		return miEntity;
	}
	
}
