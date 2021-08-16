package com.lucho.curso.polimorfismo;

public class TestPolimorfismo {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 5000);
		imprimir(empleado);
		
		Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
		imprimir(gerente);
	}
	
	public static void imprimir(Empleado empleado) {
		System.out.println("Empleado: "+empleado.obtenerDetalles());
	}
}
