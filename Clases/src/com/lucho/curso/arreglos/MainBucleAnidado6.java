package com.lucho.curso.arreglos;

import java.util.Scanner;

public class MainBucleAnidado6 {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Indique cuantos pisos para la piramide");
		int altura = lectura.nextInt();
		for (int numeroespacios=altura, numeroasteriscos=(altura*2)-1; numeroasteriscos>=0;numeroespacios++, numeroasteriscos-=2){
            //Espacios
            for (int i=0; i<numeroespacios;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for (int j=numeroasteriscos; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
	}
}
