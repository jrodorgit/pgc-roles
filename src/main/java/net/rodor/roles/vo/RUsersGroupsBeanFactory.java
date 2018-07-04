package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RUsersGroupsBeanFactory {

	private  volatile static RUsersGroupsBeanFactory instance;
	
	private RUsersGroupsBeanFactory(){}
	
	public  static RUsersGroupsBeanFactory getInstance(){
		if(instance == null){
			synchronized (RUsersGroupsBeanFactory.class){
				if(instance == null){
					instance = new RUsersGroupsBeanFactory();
				}
			}
		}
		return instance;
	}
	
	public RRolesGroupsBean mapRow(ResultSet rs) throws SQLException {
		
		RRolesGroupsBean miEntity= new RRolesGroupsBean() ;
		miEntity.idgroup = rs.getLong(RRolesGroupsBean.IDGROUP);
		miEntity.idrol = rs.getLong(RRolesGroupsBean.IDROL);
		miEntity.startdate = rs.getTimestamp(RRolesGroupsBean.STARTDATE);
		miEntity.enddate = rs.getTimestamp(RRolesGroupsBean.ENDDATE);
		
		return miEntity;
	}
	
}
