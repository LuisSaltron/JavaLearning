package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio8 {
	public static void main(String[] args) {
		try (Scanner lectura = new Scanner(System.in)) {
			System.out.println("Indique el tamaño del array");
			int size = lectura.nextInt();
			System.out.println("Indique el número en el cual deben terminar las cifras: ");
			int numToFilter = lectura.nextInt();
			if (numToFilter >= 0 && numToFilter <= 9) {
				int[] arreglo = new int[size];
				int[] arrayFiltrado=rellenarArray(arreglo, numToFilter);
				if (arrayFiltrado.length==0) {
					System.out.println("");
					System.out.println("No se han encontrado números que terminen en la cifra indicada");
				}
				else {
					System.out.println("");
					System.out.println("Array filtrado por la cifra "+numToFilter);
					mostrarArray(arrayFiltrado);
				}
			} else {
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static int[] rellenarArray(int[] arreglo, int numToFilter) {
		int contador = 0;

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random() * 300);
			if (filterByFinalNumber(numToFilter, arreglo[i])) {
				contador++;
			}
		}
		System.out.println("Array original:");
		mostrarArray(arreglo);
		int[] arrayFiltrado = new int[contador];
		contador=0;
		for (int i = 0; i < arreglo.length; i++) {
			if (filterByFinalNumber(numToFilter, arreglo[i])) {
				arrayFiltrado[contador]=arreglo[i];
				contador++;
			}
		}
		return arrayFiltrado;
	}

	public static boolean filterByFinalNumber(int numToFilter, int numToEvaluate) {
		Integer randomNum = (Integer) numToEvaluate;
		String randomToExtract = randomNum.toString();
		int cifra = Character.getNumericValue(randomToExtract.charAt(randomToExtract.length() - 1));
		if (numToFilter == cifra) {
			return true;
		}
		return false;
	}
	
	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
}
