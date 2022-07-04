package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio10 {
	public static void main(String[] args) {
		float[] notasNumericas = new float[10];
		String[] alumnos = new String[10];
		String[] notasEnLetras = new String[10];
		
		Scanner lectura = new Scanner(System.in);
		int i = 0;
		while (i < notasNumericas.length) {
			System.out.println("Ingrese la nota Nro " + i);
			float nota = lectura.nextFloat();
			if (nota >= 0 && nota <= 10) {
				notasNumericas[i] = nota;
				System.out.println("Ingrese el nombre del alumno: ");
				String nombre = lectura.next();
				alumnos[i] = nombre;
				notasEnLetras[i] = getLetra(nota);
				i++;
			} else {
				System.out.println("Debe ingresar una nota entre 0 y 10");
			}
		}
		for (int j = 0; j < notasNumericas.length; j++) {
			System.out.println("Alumno: " + alumnos[j]);
			System.out.println("Nota en número: " + notasNumericas[j]);
			System.out.println("Nota en letra: " + notasEnLetras[j]);
		}
	}

	public static String getLetra(float nota) {
		if (nota >= 0 && nota <= 4.99) {
			return "SUSPENSO";
		} else if (nota >= 5 && nota <= 6.99) {
			return "BIEN";
		} else if (nota >= 7 && nota <= 8.99) {
			return "NOTABLE";
		} else {
			return "SOBRESALIENTE";
		}
	}
}
