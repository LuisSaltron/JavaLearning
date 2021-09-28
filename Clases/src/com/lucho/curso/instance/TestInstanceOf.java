package com.lucho.curso.instance;

public class TestInstanceOf {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 5000);
		Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
		determinarTipo(empleado);
		determinarTipo(gerente);
	}

	public static void determinarTipo(Empleado empleado) {
		if (empleado instanceof Gerente) {
			System.out.println("Es de tipo gerente");
		} else if (empleado instanceof Empleado) {
			System.out.println("Es de tipo empleado");
		} else if (empleado instanceof Object) {
			System.out.println("Es de tipo Object");
		}
	}
}
