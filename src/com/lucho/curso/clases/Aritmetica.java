package com.lucho.curso.clases;

public class Aritmetica {
	// Class attributes
	int a;
	int b;

	public Aritmetica() {
		System.out.println("Ejecutando constructor");
	}

	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;	
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void sumar() {
		int resultado = a + b;
		System.out.println("Suma: " + resultado);
	}

	public int suma() {
		return a + b;
	}

	public int sumarConArgumentos(int arg1, int arg2) {
		a = arg1;
		b = arg2;
		return suma();
	}

}
