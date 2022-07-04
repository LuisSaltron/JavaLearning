package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio3 {
	private static int[] numeros;
	private static int mayor;

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Indique el tamaño del array: ");
		int sizeArray = lectura.nextInt();
		rellenarArray(sizeArray);
		mostrarArray();
	}

	public static void rellenarArray(int sizeArray) {
		numeros = new int[sizeArray];
		mayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = aleatorioPrimo();
			if (numeros[i] > mayor)
				mayor = numeros[i];
		}
	}

	public static int aleatorioPrimo() {
		int numeroAleatorio = (int) (Math.random() * 20);
		if (numeroAleatorio == 2 || numeroAleatorio % 2 != 0 && numeroAleatorio > 1) {
			return numeroAleatorio;
		} else {
			return aleatorioPrimo();
		}
	}
	
	public static void mostrarArray() {
		for (int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println("El mayor de los valores es: "+mayor);
	}
}
