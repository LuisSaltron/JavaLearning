package com.lucho.curso.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio7 {
	private static int[] arreglo1;
	private static int[] arreglo2;
	private static int[] arreglo3;
	private static int[] arregloMult;

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Indique el tamaño de los array");
		int size = lectura.nextInt();
		int[] arregloTemp = new int[size];
		arreglo1 = rellenarArray(arregloTemp);
		arreglo2 = arreglo1;
		arreglo3 = Arrays.copyOf(arregloTemp, arreglo1.length);
		arregloMult = multiplicarArrays(arreglo1, arreglo3);
		mostrarArray("Arreglo No. 1", arreglo1);
		mostrarArray("Arreglo No. 2", arreglo2);
		mostrarArray("Arreglo No. 3", arreglo3);
		mostrarArray("Arreglo Multiplicado (1 y 3)", arregloMult);
	}

	public static int[] rellenarArray(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 20);
		}
		return arreglo;
	}

	public static void mostrarArray(String nameArreglo, int[] arreglo) {
		System.out.println("");
		System.out.println("Valores del " + nameArreglo);
		for (int valor : arreglo) {
			System.out.print(valor + " ");
		}
	}

	public static int[] multiplicarArrays(int[] arreglo1, int[] arreglo2) {
		int[] arregloMultiplicado = new int[arreglo1.length];
		for (int i = 0; i < arreglo1.length; i++) {
			arregloMultiplicado[i] = arreglo1[i] * arreglo2[i];
		}
		return arregloMultiplicado;
	}
}
