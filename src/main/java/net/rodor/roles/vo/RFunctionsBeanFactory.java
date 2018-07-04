package net.rodor.roles.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RFunctionsBeanFactory {

	private  volatile static RFunctionsBeanFactory instance;
	
	private RFunctionsBeanFactory(){}
	public  static RFunctionsBeanFactory getInstance(){
		if(instance == null){
			synchronized (RFunctionsBeanFactory.class){
				if(instance == null){
					instance = new RFunctionsBeanFactory();
				}
			}
		}
		return instance;
	}
	public RFunctionBean mapRow(ResultSet rs) throws SQLException {
		
		RFunctionBean miEntity= new RFunctionBean() ;
		miEntity.id = rs.getLong(RRolBean.ID);
		miEntity.appcode = rs.getString(RFunctionBean.APPCODE);
		miEntity.modcode = rs.getString(RFunctionBean.MODCODE);
		miEntity.sercode = rs.getString(RFunctionBean.SERCODE);
		miEntity.acccode = rs.getString(RFunctionBean.ACCCODE);
		miEntity.funcname = rs.getString(RFunctionBean.FUNCNAME);
		miEntity.funcdesc = rs.getString(RFunctionBean.FUNCDESC);
		return miEntity;
	}
	
}
