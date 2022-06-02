package com.lanbide.alumnos.ana.examen1.entidades;

//9 añadir el extends run time, marca error y automatico el serial version

public class EntidadesException extends RuntimeException {
	private static final long serialVersionUID = 264235301256886364L;

	//10. añadir source superclass   despues de borrar coments y todooos regresa a tu entidad y sigue con getters y setters
	public EntidadesException() {
		super();
	}
		
	public EntidadesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public EntidadesException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EntidadesException(String message) {
		super(message);
	
	}


	public EntidadesException(Throwable cause) {
		super(cause);
	
	}
	
	
	
	
}