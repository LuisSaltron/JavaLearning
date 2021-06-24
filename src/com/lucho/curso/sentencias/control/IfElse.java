package com.lucho.curso.sentencias.control;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		boolean condicion = true;

		if (condicion)
			System.out.println("Condicion verdadera");
		else
			System.out.println("Condicion falsa");
		
		int numero=5;
		String numeroTexto="Numero no encontrado";
		
		
		if (numero==1) {
			numeroTexto="Uno";
			System.out.println(numeroTexto);
		}
		else if(numero==2) {
			numeroTexto="Dos";
			System.out.println(numeroTexto);
		}
		else if(numero==3) {
			numeroTexto="Dos";
			System.out.println(numeroTexto);
		}
		else if(numero==4) {
			numeroTexto="Dos";
			System.out.println(numeroTexto);
		}
		else {
			System.out.println(numeroTexto);
		}
	}
}
