package com.lucho.curso.contexto.estatico;

import java.util.HashSet;
import java.util.Set;

public class MainPersona {
	private static int contador;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Luis");
		Persona persona2 = new Persona("Juan");
		System.out.println("To string" + persona2.toString());
		System.out.println(getContador());
		imprimir(persona);
	}
	
	public static void imprimir(Persona persona) {
		System.out.println("Persona= "+persona);
	}
	
	public  static int getContador() {
		return contador;
	}
}
