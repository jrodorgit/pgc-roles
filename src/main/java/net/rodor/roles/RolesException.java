package net.rodor.roles;

public class RolesException extends Exception{

	
	private static final long serialVersionUID = -2782703174668106355L;
	
	public static final String NULL_USR = "El codigo del usuario no puede ser nulo o cadena vacia";
	public static final String NULL_FUNC = "El nombre de la funcion puede ser nulo o cadena vacia";
	public static final String NULL_APP = "La aplicacion no puede ser nulo o cadena vacia";
	
	public RolesException(String message) {
		super(message);
	}

	
}
