package net.rodor.roles.vo;

import java.sql.Timestamp;

/**
 * RUsers Bean
 * @author www.rodor.net
 *
 */
public class RUsersBean implements  java.io.Serializable  {
	
	
	private static final long serialVersionUID = -8810475526449941586L;
	
	public static final String ID = "id";
	public static final String APPCODE = "appcode";
	public static final String USERCODE = "usercode";
	public static final String NOMBRE = "nombre";
	public static final String STARTDATE = "startdate";
	public static final String ENDDATE = "enddate";
	
	public  Long id;
	public  String appcode;
	public  String usercode;
	public  String nombre;
	public  Timestamp startdate;
	public  Timestamp enddate;
	
	public  String  toJSONFormat (){ return "{\r\n \"id\" : \""+this.id
			+"\", \r\n \"appcode\" : \""+this.appcode
			+"\", \r\n \"usercode\" : \""+this.usercode
			+"\", \r\n \"nombre\" : \""+this.nombre
			+"\", \r\n \"startdate\" : \""+this.startdate
			+"\", \r\n \"enddate\" : \""+this.enddate+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<id>"+this.id+"</id>"
			+"\r\n<appcode>"+this.appcode+"</appcode>"
			+"\r\n<usercode>"+this.usercode+"</usercode>"
			+"\r\n<nombre>"+this.nombre+"</nombre>"
			+"\r\n<startdate>"+this.startdate+"</startdate>"
			+"\r\n<enddate>"+this.enddate+"</enddate>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}