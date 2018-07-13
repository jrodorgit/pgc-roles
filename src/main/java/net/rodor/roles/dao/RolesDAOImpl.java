package net.rodor.roles.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import net.rodor.roles.bbdd.DataBaseConnFactory;
import net.rodor.roles.bbdd.PreparedStatementFactory;
import net.rodor.roles.vo.RFunctionBean;
import net.rodor.roles.vo.RFunctionsBeanFactory;
import net.rodor.roles.vo.RUsersBean;
import net.rodor.roles.vo.RUsersBeanFactory;

public class RolesDAOImpl implements RolesDAOInt {

	public RolesDAOImpl() {
		super();
	
	}
	
	public Collection<RFunctionBean> getFuncsByUserApp(String app, String usr,java.sql.Timestamp fecha) throws SQLException{
		
		
		Collection<RFunctionBean> beans = new ArrayList<RFunctionBean>();
		
		if(app == null){
			return beans;
		}

		if(usr == null){
			return beans;
		}
		java.sql.Date fechaActivo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		if(fecha != null){
			fechaActivo = new java.sql.Date(fecha.getTime());
		}
		Connection conn = DataBaseConnFactory.getInstance().getConnection();
		PreparedStatementFactory psf = PreparedStatementFactory.getInstance();
		String sql = psf.getSQL(RolesDAOInt.ROLES_BY_USER_APP);

		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, usr);	
			ps.setDate(2, fechaActivo);
			ps.setDate(3, fechaActivo);
			ps.setDate(4, fechaActivo);
			ps.setDate(5, fechaActivo);
			ps.setDate(6, fechaActivo);
			ps.setDate(7, fechaActivo);
			ps.setString(8, app);
			
			ResultSet rs = ps.executeQuery();
			RFunctionsBeanFactory fac = RFunctionsBeanFactory.getInstance();
			while(rs.next()){
				beans.add(fac.mapRow(rs));
			}
			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		return beans;
	}
	
	public Collection<RUsersBean> getUsersByFuncApp(String app, String funcname,java.sql.Timestamp fecha) throws SQLException{
		
		Collection<RUsersBean> beans = new ArrayList<RUsersBean>();
		
		if(app == null){
			return beans;
		}

		if(funcname == null){
			return beans;
		}
		java.sql.Date fechaActivo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		if(fecha != null){
			fechaActivo = new java.sql.Date(fecha.getTime());
		}
		Connection conn = DataBaseConnFactory.getInstance().getConnection();
		PreparedStatementFactory psf = PreparedStatementFactory.getInstance();
		String sql = psf.getSQL(RolesDAOInt.USERS_BY_FUNC_APP);

		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, funcname);
			ps.setString(2, app);
			ps.setDate(3, fechaActivo);
			ps.setDate(4, fechaActivo);
			ps.setDate(5, fechaActivo);
			ps.setDate(6, fechaActivo);
			ps.setDate(7, fechaActivo);
			ps.setDate(8, fechaActivo);
			
			ResultSet rs = ps.executeQuery();
			RUsersBeanFactory fac = RUsersBeanFactory.getInstance();
			while(rs.next()){
				beans.add(fac.mapRow(rs));
			}
			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		return beans;
	}
	
	
	public boolean hasUserFuncApp(String app, String usr,String funcname,java.sql.Timestamp fecha) throws SQLException{
		
		boolean tieneFuncionalidad = false;
		if(app == null){
			return tieneFuncionalidad;
		}
		if(usr == null){
			return tieneFuncionalidad;
		}

		if(funcname == null){
			return tieneFuncionalidad;
		}
		java.sql.Date fechaActivo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		if(fecha != null){
			fechaActivo = new java.sql.Date(fecha.getTime());
		}
		Connection conn = DataBaseConnFactory.getInstance().getConnection();
		PreparedStatementFactory psf = PreparedStatementFactory.getInstance();
		String sql = psf.getSQL(RolesDAOInt.HAS_USER_FUNC);

		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, usr);
			ps.setString(2, app);
			ps.setDate(3, fechaActivo);
			ps.setDate(4, fechaActivo);
			ps.setDate(5, fechaActivo);
			ps.setDate(6, fechaActivo);
			ps.setDate(7, fechaActivo);
			ps.setDate(8, fechaActivo);
			ps.setString(9, funcname);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				if(rs.getInt("tieneFunc") > 0 ) {
					tieneFuncionalidad = true;
					break;
				}
			}
			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		return tieneFuncionalidad;
	}
}
