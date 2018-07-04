package net.rodor.roles.vo;

/**
 * RFunction Bean
 * @author www.rodor.net
 *
 */
public class RFunctionBean implements  java.io.Serializable  {

	private static final long serialVersionUID = 9116439584193285725L;
	
	public static final String ID = "id";
	public static final String APPCODE = "appcode";
	public static final String MODCODE = "modcode";
	public static final String SERCODE = "sercode";
	public static final String ACCCODE = "acccode";
	public static final String FUNCNAME = "funcname";
	public static final String FUNCDESC = "funcdesc";
	
	
	public  Long id;
	public  String appcode;
	public  String modcode;
	public  String sercode;
	public  String acccode;
	public  String funcname;
	public  String funcdesc;
	
	
	public  String  toJSONFormat (){ return "{\r\n \"id\" : \""+this.id
			+"\", \r\n \"appcode\" : \""+this.appcode
			+"\", \r\n \"modcode\" : \""+this.modcode
			+"\", \r\n \"sercode\" : \""+this.sercode
			+"\", \r\n \"acccode\" : \""+this.acccode
			+"\", \r\n \"funcname\" : \""+this.funcname
			+"\", \r\n \"funcdesc\" : \""+this.funcdesc+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<id>"+this.id+"</id>"
			+"\r\n<appcode>"+this.appcode+"</appcode>"
			+"\r\n<modcode>"+this.modcode+"</modcode>"
			+"\r\n<sercode>"+this.sercode+"</sercode>"
			+"\r\n<acccode>"+this.acccode+"</acccode>"
			+"\r\n<funcname>"+this.funcname+"</funcname>"
			+"\r\n<funcdesc>"+this.funcdesc+"</funcdesc>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}