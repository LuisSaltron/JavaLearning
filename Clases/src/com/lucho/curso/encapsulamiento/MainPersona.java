package com.lucho.curso.encapsulamiento;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona= new Persona("Luis","Saltron",3000.20,true);
		System.out.println("Nombre de la persona: "+persona.getNombre());
		System.out.println("Apellido de la persona: "+persona.getApellido());
		System.out.println("¿Está eliminado?: "+ persona.isEliminado());
		System.out.println("To string; "+persona.toString());
	}
}
