package com.lucho.curso.clases;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona=new Persona("Juan","Castro","Alba�il");
		System.out.println("Nombre:"+persona.getNombre());
		System.out.println("Apellido:"+persona.getApellido());
		System.out.println("Ocupaci�n"+persona.getOcupacion());
	}

}
