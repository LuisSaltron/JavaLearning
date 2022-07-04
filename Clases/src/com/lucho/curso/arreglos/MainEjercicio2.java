package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio2 {
	private static int[] numeros;
	private static int sumatoria;

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingresa el tamaño del array: ");
		int sizeArray = lectura.nextInt();
		numeros = new int[sizeArray];
		rellenarArray();
		mostrarArray();
	}

	public static void rellenarArray() {
		sumatoria = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 9);
			sumatoria += numeros[i];
		}
	}

	public static void mostrarArray() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion: " + i + "  Valor: " + numeros[i]);
		}
		System.out.println("Sumatoria de los valores: " + sumatoria);
	}
}
