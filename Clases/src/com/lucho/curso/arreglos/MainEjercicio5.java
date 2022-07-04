package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio5 {
	public static void main(String[] args) {
		String frase = "";
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese una frase");
		frase = lectura.next();
		char[] caracteres = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
		}
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Caracter: " + caracteres[i]);
		}
	}
}
