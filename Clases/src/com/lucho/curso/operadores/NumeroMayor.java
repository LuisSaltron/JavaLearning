package com.lucho.curso.operadores;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona el numero 1:");
		int numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Proporciona el numero 2:");
		int numero2 = Integer.parseInt(scanner.nextLine());
		String resultado = (numero1 > numero2) ? "El numero mayor es :" + numero1 : "El numero mayor es:" + numero2;
		System.out.println(resultado);
	}
}
