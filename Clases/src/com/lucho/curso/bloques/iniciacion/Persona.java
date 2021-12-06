package com.lucho.curso.bloques.iniciacion;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	//bloque estático
	static {
		System.out.println("Se ejecuta bloque estático");
		++Persona.contadorPersonas;
	}
	//bloque no estático
	{
		System.out.println("Se ejecuta bloque no estático");
		this.idPersona=Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecución del constructor");
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}
	
	
}
