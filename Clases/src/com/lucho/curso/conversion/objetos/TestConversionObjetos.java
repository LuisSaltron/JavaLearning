package com.lucho.curso.conversion.objetos;

public class TestConversionObjetos {
	public static void main(String[] args) {
		Empleado empleado = new Escritor("Juan", 5000,TipoEscritura.CLASICO);
		System.out.println(empleado);
		//System.out.println(empleado.obtenerDetalles());
		
		//downcasting
		System.out.println(((Escritor) empleado).getTipoEscritura());
	}
}
