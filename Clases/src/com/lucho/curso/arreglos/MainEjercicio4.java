package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio4 {
	public static void main(String[] args) {
		int opcion = 0;
		String cadena = "";
		Scanner lectura = new Scanner(System.in);
		char[] alfabeto = crearAlfabeto();
		do {
			System.out.println("Ingresa una posición para obtener la letra del alfabeto:");
			opcion = lectura.nextInt();
			if (opcion >= 0 && opcion <= 25) {
				System.out.println("La letra obtenida es: " + alfabeto[opcion]);
				cadena += alfabeto[opcion];
			}

		} while ((opcion >= 0));
		System.out.println("Cadena obtnida: " + cadena);
	}

	public static char[] crearAlfabeto() {
		char[] alfabeto = new char[26];
		for (int i = 0; i < 26; i++) {
			int asciiValue = i + 65;
			alfabeto[i] = (char) asciiValue;
		}
		return alfabeto;
	}
}
