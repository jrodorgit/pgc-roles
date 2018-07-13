package net.rodor.roles;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.roles.vo.RFunctionBean;

public interface RolesLoaderInt {

	public Collection<RFunctionBean> getFuncsByUserApp(String app, String usr, java.sql.Timestamp fecha) throws SQLException, RolesException;
	
}
