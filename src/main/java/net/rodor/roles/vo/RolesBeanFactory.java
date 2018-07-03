package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RolesBeanFactory {

	private  volatile static RolesBeanFactory instance;
	private RolesBeanFactory(){}
	public  static RolesBeanFactory getInstance(){
		if(instance == null){
			synchronized (RolesBeanFactory.class){
				if(instance == null){
					instance = new RolesBeanFactory();
				}
			}
		}
		return instance;
	}
	public RolBean mapRow(ResultSet rs) throws SQLException {
		
		RolBean miEntity= new RolBean() ;
		miEntity.app = rs.getString(RolBean.APP_NAME);
		miEntity.parentcode = rs.getString(RolBean.PARENTCODE);
		miEntity.code = rs.getString(RolBean.CODE);
		miEntity.description = rs.getString(RolBean.DESCRIPTION);
		miEntity.descriptionxl = rs.getString(RolBean.DESCRIPTION_XL);
		miEntity.descriptionxs = rs.getString(RolBean.DESCRIPTION_XS);
		miEntity.startdate = rs.getTimestamp(RolBean.START_DATE);
		miEntity.enddate = rs.getTimestamp(RolBean.END_DATE);
		
		return miEntity;
	}
	
}
