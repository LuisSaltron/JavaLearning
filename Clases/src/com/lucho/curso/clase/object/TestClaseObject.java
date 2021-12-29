package com.lucho.curso.clase.object;

public class TestClaseObject {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 5000);
		Empleado empleado2 = new Empleado("Juan", 5000);
		// Validar si tienen la misma referencia
		if (empleado1 == empleado2) {
			System.out.println("Tienen la misma referencia");
		} else {
			System.out.println("No tienen la misma referencia en memoria");
		}
		if (empleado1.equals(empleado2)) {
			System.out.println("El contenido es igual de los dos objetos");
		}
		else {
			System.out.println("Los objetos son diferentes en contenido");
		}
		if (empleado1.hashCode()==empleado2.hashCode()) {
			System.out.println("El hashcode es igual de los dos objetos");
		}
		else {
			System.out.println("Los objetos son diferentes en hashcode");

		}
	}
}
