package test;

import com.lucho.curso.arreglos.Persona;

public class TestArreglo {

	public static void main(String[] args) {
		int edades[]= new int[3];
		edades[0]=10;
		edades[1]=29;
		edades[2]=30;
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad "+i+":"+edades[i]);
		}
		
		Persona personas[]=new Persona[3];
		personas[0]=new Persona("Luis");
		personas[1]=new Persona("Angela");
		personas[2]=new Persona("Carlos");
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Persona llamada: "+personas[i].getNombre());
		}
		//Sintaxis resumida para declarar y asignar las posiciones del arreglo
		String frutas[]= {"Banana","Naranja","Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Fruta "+i+" "+frutas[i]);
		}
	}
}
