package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainBucleAnidado3 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Indique cuantos pisos para la escalera");
		int pisos = lectura.nextInt();
		for (int horizontal=1;horizontal<=pisos;horizontal++) {
			for (int vertical=1;vertical<=horizontal;vertical++) {
				System.out.print(horizontal);
			}
			System.out.println("");
		}
	}
}
