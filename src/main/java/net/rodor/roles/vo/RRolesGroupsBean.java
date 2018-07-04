package net.rodor.roles.vo;

import java.sql.Timestamp;

/**
 *  RRolesGroups Bean
 * @author www.rodor.net
 *
 */
public class RRolesGroupsBean implements  java.io.Serializable  {
	
	private static final long serialVersionUID = -4844543571412442765L;
	
	public static final String IDGROUP = "idgroup";
	public static final String IDROL = "idrol";
	public static final String STARTDATE = "startdate";
	public static final String ENDDATE = "enddate";
	
	public  Long idgroup;
	public  Long idrol;
	public  Timestamp startdate;
	public  Timestamp enddate;
	
	public  String  toJSONFormat (){ return "{\r\n \"idgroup\" : \""+this.idgroup
			+"\", \r\n \"idrol\" : \""+this.idrol
			+"\", \r\n \"startdate\" : \""+this.startdate
			+"\", \r\n \"enddate\" : \""+this.enddate+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<idgroup>"+this.idgroup+"</idgroup>"
			+"\r\n<idrol>"+this.idrol+"</idrol>"
			+"\r\n<startdate>"+this.startdate+"</startdate>"
			+"\r\n<enddate>"+this.enddate+"</enddate>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}