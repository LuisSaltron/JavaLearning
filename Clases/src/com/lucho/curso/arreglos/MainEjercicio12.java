package com.lucho.curso.arreglos;

import java.util.Arrays;
import java.util.Collections;

public class MainEjercicio12 {
	public static void main(String[] args) {
		Integer[] arrayOriginal = { 1, 2, 3, 4, 5 };
		Integer[] arrayInvertido = Arrays.copyOf(arrayOriginal, 5);
		Arrays.sort(arrayInvertido, Collections.reverseOrder());
		mostrarArray(arrayInvertido);
	}

	public static void mostrarArray(Integer[] numeros) {
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
