package com.lucho.curso.matrices;

import java.util.Scanner;

public class MainEjercicio2 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Indique la cantidad de filas para la matriz");
		int noFilas = lectura.nextInt();
		System.out.println("Indique la cantidad de columnas para la matriz");
		int noColumnas = lectura.nextInt();
		int[][] matriz1 = new int[noFilas][noColumnas];
		int[][] matriz2 = new int[noFilas][noColumnas];
		int[][] matrizResultado = new int[noFilas][noColumnas];
		for (int filas = 0; filas < matriz1.length; filas++) {
			for (int columnas = 0; columnas < matriz1[0].length; columnas++) {
				matriz1[filas][columnas] = generarAleatorio();
				matriz2[filas][columnas] = generarAleatorio();
				matrizResultado[filas][columnas] = matriz1[filas][columnas] + matriz2[filas][columnas];
			}
		}
		mostrarArray(matriz1);
		System.out.println("");
		mostrarArray(matriz2);
		System.out.println("");
		mostrarArray(matrizResultado);
	}

	public static int generarAleatorio() {
		int numeroAleatorio = (int) (Math.random() * 9);
		return numeroAleatorio;
	}

	public static void mostrarArray(int[][] matriz) {
		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz[0].length; columnas++) {
				System.out.print(matriz[filas][columnas] + " ");
			}
			System.out.println("");
		}
	}
}
