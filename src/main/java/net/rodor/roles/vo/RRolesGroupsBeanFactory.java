package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RRolesGroupsBeanFactory {

	private  volatile static RRolesGroupsBeanFactory instance;
	
	private RRolesGroupsBeanFactory(){}
	
	public  static RRolesGroupsBeanFactory getInstance(){
		if(instance == null){
			synchronized (RRolesGroupsBeanFactory.class){
				if(instance == null){
					instance = new RRolesGroupsBeanFactory();
				}
			}
		}
		return instance;
	}
	
	public RUsersGroupsBean mapRow(ResultSet rs) throws SQLException {
		
		RUsersGroupsBean miEntity= new RUsersGroupsBean() ;
		miEntity.idgroup = rs.getLong(RUsersGroupsBean.IDGROUP);
		miEntity.idusr = rs.getLong(RUsersGroupsBean.IDUSR);
		miEntity.startdate = rs.getTimestamp(RUsersGroupsBean.STARTDATE);
		miEntity.enddate = rs.getTimestamp(RUsersGroupsBean.ENDDATE);
		
		return miEntity;
	}
	
}
