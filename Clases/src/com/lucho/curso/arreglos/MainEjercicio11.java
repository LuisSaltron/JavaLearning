package com.lucho.curso.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio11 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);

		System.out.println("Ingrese la cifra para verificar si es capicua");
		String cifra = lectura.next();
		int[] numeros = new int[cifra.length()];
		int[] numeroAlReves = new int[cifra.length()];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Character.getNumericValue(cifra.charAt(i));
		}
		for (int i = 0; i < numeros.length / 2; i++) {
			int temporal = numeros[i];

			int indiceContrario = numeros.length - i - 1;

			numeroAlReves[i] = numeros[indiceContrario];

			numeroAlReves[indiceContrario] = temporal;
		}
		if (Arrays.equals(numeros, numeroAlReves)) {
			System.out.println("Es una cifra capicua");
		}
		else {
			System.out.println("No es uan cifra capicua");
		}

	}
}
