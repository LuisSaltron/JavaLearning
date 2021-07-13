package com.lucho.curso.clases;

public class PalabraThis {
	public static void main(String[] args) {
		PersonaDos persona=new PersonaDos("Carlos","Contreras");
		System.out.println("persona= "+persona.nombre+" "+persona.apellido);
		
	}
}

class PersonaDos{
	String nombre;
	String apellido;
	public PersonaDos(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("persona usando this: "+this.nombre);
		new Imprimir().imprimir(this);
	}
}

class Imprimir{
	public void imprimir(PersonaDos persona) {
		System.out.println("persona desde imprimir:" +persona);
		System.out.println("impresión del objeto actual(this)"+this);
	}
}
