package net.rodor.roles.dao;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.roles.vo.RolBean;

public interface RolesBeanDAOInt {

	public static final String SCOPES_SELECT_ALL_BY_PARENT = "SCOPES_SELECT_ALL_BY_PARENT";
	
	
	/**
	 * Devuelve la relacion de ambitos a partir del padre.
	 * @param app aplicacion
	 * @param parentcode codigo padre 
	 * @param fecha
	 * @return
	 */
	public Collection<RolBean> getAllByParent(String app, String parentcode,java.sql.Timestamp fecha) throws SQLException;
	
	
	
}
