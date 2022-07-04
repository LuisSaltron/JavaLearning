package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio6 {
	public static void main(String[] args) {
		System.out.println("Ingrese una frase");
		Scanner lectura = new Scanner(System.in);
		String frase = lectura.next();
		char[] caracteres = new char[frase.length()];
		caracteres = frase.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
	}
}
