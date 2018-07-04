package net.rodor.roles.vo;

/**
 * RFunctionRol Bean
 * @author www.rodor.net
 *
 */
public class RFunctionsRolesBean implements  java.io.Serializable  {
	
	private static final long serialVersionUID = 7508222941185120038L;
	
	public static final String ID = "id";
	public static final String IDFUNC = "idfunc";
	public static final String IDROL = "idrol";
	
	public  Long id;
	public  Long idfunc;
	public  Long idrol;
	
	public  String  toJSONFormat (){ return "{\r\n \"id\" : \""+this.id
			+"\", \r\n \"idfunc\" : \""+this.idfunc
			+"\", \r\n \"idrol\" : \""+this.idrol+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<id>"+this.id+"</id>"
			+"\r\n<idfunc>"+this.idfunc+"</idfunc>"
			+"\r\n<idrol>"+this.idrol+"</funcdesc>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}