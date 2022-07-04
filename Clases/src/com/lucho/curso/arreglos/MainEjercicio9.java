package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainEjercicio9 {
	private static char[] letters = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		int dni = 0;
		while (dni >= 0) {
			System.out.println("Ingrese el No. de DNI, ingresar -1 para finalizar");
			dni = lectura.nextInt();
			int mod = dni % 23;
			if (mod >= 0 && mod <= 22) {
				System.out.println("Al DNI ingresado le corresponde la letra: " + letters[mod]);
			} else {
				System.out.println("El DNI ingresado ");
			}
		}

	}

}
