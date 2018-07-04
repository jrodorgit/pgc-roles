package net.rodor.roles.vo;

/**
 * RGroups Bean
 * @author www.rodor.net
 *
 */
public class RGroupsBean implements  java.io.Serializable  {
	
	
	private static final long serialVersionUID = -3927257355066900149L;
	
	public static final String ID = "id";
	public static final String APPCODE = "appcode";
	public static final String GROUPCODE = "groupcode";
	public static final String GROUPNAME = "groupname";
	public static final String GROUPDESC = "groupdesc";
	
	
	public  Long id;
	public  String appcode;
	public  String groupcode;
	public  String groupname;
	public  String groupdesc;
	
	public  String  toJSONFormat (){ return "{\r\n \"id\" : \""+this.id
			+"\", \r\n \"appcode\" : \""+this.appcode
			+"\", \r\n \"groupcode\" : \""+this.groupcode
			+"\", \r\n \"groupname\" : \""+this.groupname
			+"\", \r\n \"groupdesc\" : \""+this.groupdesc+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<id>"+this.id+"</id>"
			+"\r\n<appcode>"+this.appcode+"</appcode>"
			+"\r\n<groupcode>"+this.groupcode+"</groupcode>"
			+"\r\n<groupname>"+this.groupname+"</groupname>"
			+"\r\n<groupdesc>"+this.groupdesc+"</groupdesc>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}