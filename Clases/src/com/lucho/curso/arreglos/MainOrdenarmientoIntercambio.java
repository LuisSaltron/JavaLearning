package com.lucho.curso.arreglos;

public class MainOrdenarmientoIntercambio {
	public static void main(String[] args) {
		final int size = 6;
		int[] numerosSinOrdenar = new int[size];
		int[] numerosOrdenados = new int[size];
		numerosSinOrdenar = rellenarArray(numerosSinOrdenar);
		mostrarArray(numerosSinOrdenar);
		System.out.println("");
		numerosOrdenados = ordenarPorIntercabio(numerosSinOrdenar);
		mostrarArray(numerosOrdenados);

	}

	public static int[] ordenarPorIntercabio(int[] numeros) {
		for (int i = 0; i < (numeros.length - 1); i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] > numeros[j]) {
					int posicionTemporal = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = posicionTemporal;
				}
			}
		}
		return numeros;
	}

	public static int[] rellenarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 9);
		}
		return numeros;
	}

	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
