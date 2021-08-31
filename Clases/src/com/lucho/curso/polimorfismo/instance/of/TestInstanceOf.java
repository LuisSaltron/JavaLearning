package com.lucho.curso.polimorfismo.instance.of;

public class TestInstanceOf {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 5000);
		
		Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
		
		determinarTipo(gerente);
	}
	
	public static void determinarTipo(Empleado empleado) {
		if (empleado instanceof Gerente) {
			System.out.println("Es de tipo Gerente");
			System.out.println("Departamento: "+((Gerente) empleado).getDepartamento());
		}
		else if(empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
		}
		else if(empleado instanceof Object) {
			System.out.println("Es de tipo object");
		}
	}
}
