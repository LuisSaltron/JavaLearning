package com.lucho.curso.javaBeans;

public class TestJavaBeans {

	public static void main(String[] args) {
		Persona persona= new Persona();
		persona.setNombre("Luis");
		persona.setApellido("Saltron");
		System.out.println(persona.toString());
	}
}
