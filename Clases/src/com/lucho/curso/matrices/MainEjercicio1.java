package com.lucho.curso.matrices;

public class MainEjercicio1 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz.length; columnas++) {
				matriz[filas][columnas] = generarAleatorio();
			}
		}
		mostrarArray(matriz);
	}

	public static int generarAleatorio() {
		int numeroAleatorio = (int) (Math.random() * 9);
		return numeroAleatorio;
	}

	public static void mostrarArray(int[][] matriz) {
		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz.length; columnas++) {
				System.out.print(matriz[filas][columnas]+" ");
			}
			System.out.println("");
		}
	}
}
