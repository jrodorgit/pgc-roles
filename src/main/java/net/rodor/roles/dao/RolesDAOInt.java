package net.rodor.roles.dao;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.roles.vo.RFunctionBean;
import net.rodor.roles.vo.RUsersBean;

public interface RolesDAOInt {

	public static final String ROLES_BY_USER_APP = "ROLES_BY_USER_APP";
	public static final String USERS_BY_FUNC_APP = "USERS_BY_FUNC_APP";
	public static final String HAS_USER_FUNC = "HAS_USER_FUNC";
	
	/**
	 * Devuelve la relacion de funcionalidades asociadas a un usuario en una aplicacion en una fecha concreta.
	 * @param app
	 * @param usr
	 * @param fecha Opcional. Si null se consulta a fecha de sistema
	 * @return
	 * @throws SQLException
	 */
	public Collection<RFunctionBean> getFuncsByUserApp(String app, String usr,java.sql.Timestamp fecha) throws SQLException;
	
	/**
	 * Devulve la relacion de usuarios que para una aplicacion tiene asociada una funcionaliad en una fecha dada.
	 * @param app
	 * @param funcname
	 * @param fecha Opcional. Si null se consulta a fecha de sistema
	 * @return
	 * @throws SQLException
	 */
	public Collection<RUsersBean> getUsersByFuncApp(String app, String funcname,java.sql.Timestamp fecha) throws SQLException;
	
	/**
	 * Devuelve la relacion de funcionalidades definidas para una aplicacion en una fecha dada.
	 * @param app
	 * @param fecha Opcional. Si null se consulta a fecha de sistema
	 * @return
	 * @throws SQLException
	 
	public Collection<RFunctionBean> getFuncsByApp(String app,java.sql.Timestamp fecha) throws SQLException;
	*/
	
	/**
	 * Devuelve true si un usuario tiene asociada una funcionalidad en una aplicacion en una fecha.
	 * @param app
	 * @param usr
	 * @param funcname
	 * @param fecha Opcional. Si null se consulta a fecha de sistema
	 * @return
	 * @throws SQLException
	 */
	public boolean hasUserFuncApp(String app, String usr,String funcname,java.sql.Timestamp fecha) throws SQLException;
	
}
