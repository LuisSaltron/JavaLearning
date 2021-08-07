package com.lucho.curso.operadores;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner scanner = new Scanner(System.in);
	        System.out.println("Proporciona el alto:");
	        int alto = Integer.parseInt( scanner.nextLine());            
	        System.out.println("Proporciona el ancho:");
	        int ancho = Integer.parseInt( scanner.nextLine()); 
	        System.out.println("Area: "+alto*ancho);
	        System.out.println("Perimetro: "+(alto+ancho)*2);
	}
}
