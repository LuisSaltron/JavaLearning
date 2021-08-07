package com.lucho.curso.sentencias.control;

import java.util.Scanner;

public class SistemaCalificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona un valor entre 0 y 10:");
		Double valor = Double.parseDouble(scanner.nextLine());
		String calificacion = "";
		if (valor >= 0 && valor < 6)
			calificacion = "F";
		else if (valor >= 6 && valor < 7)
			calificacion = "D";
		else if (valor >= 7 && valor < 8)
			calificacion = "C";
		else if (valor >= 8 && valor < 9)
			calificacion = "B";
		else if (valor >= 9 && valor <= 10)
			calificacion = "A";
		else
			calificacion = "Valor incorrecto";

		System.out.println("Calificación: " + calificacion);
	}
}
