package net.rodor.roles.vo;

import java.sql.Timestamp;

/**
 * Dominios Bean
 * @author www.rodor.net
 *
 */
public class RolBean implements  java.io.Serializable  {
	
	private static final long serialVersionUID = 7217343967417257610L;
	public static final String APP_NAME = "app";
	public static final String PARENTCODE = "parentcode";
	public static final String CODE = "code";
	public static final String DESCRIPTION = "description";
	public static final String DESCRIPTION_XL = "descriptionxl";
	public static final String DESCRIPTION_XS = "descriptionxs";
	public static final String START_DATE = "startdate";
	public static final String END_DATE = "enddate";
	
	public  String app;
	public  String parentcode;
	public  String code;
	public  String description;
	public  String descriptionxl;
	public  String descriptionxs;
	public  Timestamp startdate;
	public  Timestamp enddate;
	public static final String ALL = "ALL";
	
	public  String  toJSONFormat (){ return "{\r\n \"app\" : \""+this.app
			+"\", \r\n \"parentcode\" : \""+this.parentcode
			+"\", \r\n \"code\" : \""+this.code
			+"\", \r\n \"description\" : \""+this.description
			+"\", \r\n \"descriptionxl\" : \""+this.descriptionxl
			+"\", \r\n \"descriptionxs\" : \""+this.descriptionxs
			+"\", \r\n \"startdate\" : \""+this.startdate
			+"\", \r\n \"enddate\" : \""+this.enddate+"\" \r\n\r\n}";
	}
	public  String  toXMLFormat (){ return "\r\n<app>"+this.app+"</app>"
			+"\r\n<parentcode>"+this.parentcode+"</parentcode>"
			+"\r\n<code>"+this.code+"</code>"
			+"\r\n<description>"+this.description+"</description>"
			+"\r\n<descriptionxl>"+this.descriptionxl+"</descriptionxl>"
			+"\r\n<descriptionxs>"+this.descriptionxs+"</descriptionxs>"
			+"\r\n<startdate>"+this.startdate+"</startdate>"
			+"\r\n<enddate>"+this.enddate+"</enddate>";
	}
	public  String  toString(){ return  toJSONFormat ();}
}