package net.rodor.roles.vo;

import java.sql.Timestamp;

/**
 *  RUsersGroups Bean
 * @author www.rodor.net
 *
 */
public class RUsersGroupsBean implements  java.io.Serializable  {
	
	private static final long serialVersionUID = 6484410592435935796L;
	
	public static final String IDGROUP = "idgroup";
	public static final String IDUSR = "idusr";
	public static final String STARTDATE = "startdate";
	public static final String ENDDATE = "enddate";
	
	public  Long idgroup;
	public  Long idusr;
	public  Timestamp startdate;
	public  Timestamp enddate;
	
	public  String  toJSONFormat (){ return "{\r\n \"idgroup\" : \""+this.idgroup
			+"\", \r\n \"idusr\" : \""+this.idusr
			+"\", \r\n \"startdate\" : \""+this.startdate
			+"\", \r\n \"enddate\" : \""+this.enddate+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<idgroup>"+this.idgroup+"</idgroup>"
			+"\r\n<idusr>"+this.idusr+"</idusr>"
			+"\r\n<startdate>"+this.startdate+"</startdate>"
			+"\r\n<enddate>"+this.enddate+"</enddate>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}