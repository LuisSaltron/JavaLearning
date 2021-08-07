package com.lucho.curso.operadores;

public class OperadoresCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int valorMinimo=0;
		int valorMaximo=10;
		boolean resultado=a>=0 && a<=10;
		if (resultado)
			System.out.println("Dentro del rango");
		else
			System.out.println("Fuera del rango");
		
		boolean vacaciones=true;
		boolean diaDescanso=false;
		
		if (vacaciones || diaDescanso)
			System.out.println("Puede asistir");
		else
			System.out.println("No puede asistir");
	}
}
