package com.lucho.curso.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		Empleado empleado1= new Empleado("Luis",3000.60);
		System.out.println(empleado1.toString());
		Cliente cliente1=new Cliente("Carlos",'M',21,"Bogota","02/08/2021",true);
		System.out.println(cliente1.toString());
	}
}
