package com.lucho.curso.clases;

public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1=new Persona("Luis","Saltron","33");
		System.out.println(persona1.toString());
		persona1=cambioValor(persona1);
		System.out.println(persona1.toString());
	}
	public static Persona cambioValor(Persona persona) {
		persona.setApellido("cambio");
		return persona;
	}

}
