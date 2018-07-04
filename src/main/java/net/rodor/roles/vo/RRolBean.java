package net.rodor.roles.vo;

/**
 * Rol Bean
 * @author www.rodor.net
 *
 */
public class RRolBean implements  java.io.Serializable  {
	
	
	private static final long serialVersionUID = 1831550483384223492L;
	
	public static final String ID = "id";
	public static final String APPCODE = "appcode";
	public static final String ROLCODE = "rolcode";
	public static final String ROLNAME = "rolname";
	public static final String ROLDESC = "roldesc";
	
	
	public  Long id;
	public  String appcode;
	public  String rolcode;
	public  String rolname;
	public  String roldesc;
	
	public  String  toJSONFormat (){ return "{\r\n \"id\" : \""+this.id
			+"\", \r\n \"appcode\" : \""+this.appcode
			+"\", \r\n \"rolcode\" : \""+this.rolcode
			+"\", \r\n \"rolname\" : \""+this.rolname
			+"\", \r\n \"roldesc\" : \""+this.roldesc+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<id>"+this.id+"</id>"
			+"\r\n<appcode>"+this.appcode+"</appcode>"
			+"\r\n<rolcode>"+this.rolcode+"</rolcode>"
			+"\r\n<rolname>"+this.rolname+"</rolname>"
			+"\r\n<roldesc>"+this.roldesc+"</roldesc>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}