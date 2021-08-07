package com.lucho.curso.clases;

public class MainAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=2;
		Aritmetica operacion = new Aritmetica();
		operacion.sumar();
		int resultado = operacion.suma();
		System.out.println(resultado);
		resultado = operacion.sumarConArgumentos(a, b);
		System.out.println("Suma con argumentos: " + resultado);
	}
}
