package com.lucho.cursos.forEach;

public class TestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[] = { 3, 5, 6 };
		for (int edad : edades) {
			System.out.println("Edad:" + edad);
		}
		Persona personas[] = { new Persona("Juan"), new Persona("Carla"), new Persona("Angustin") };
		for (Persona persona : personas) {
			System.out.println("Nombre: " + persona.toString());
		}
	}
}
