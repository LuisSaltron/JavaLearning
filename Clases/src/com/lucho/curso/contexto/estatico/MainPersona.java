package com.lucho.curso.contexto.estatico;


public class MainPersona {
	private static int contador;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Luis");
		Persona persona2 = new Persona("Juan");
		Persona persona3=new Persona("Carlos");
		System.out.println(getContador());
		imprimir(persona);
		System.out.println("Persona 2 to string: " + persona2.toString());
		System.out.println("Persona 3 to string: "+persona3.toString());
	}
	
	public static void imprimir(Persona persona) {
		System.out.println("Persona= "+persona);
	}
	
	public static int getContador() {
		return contador;
	}
}
