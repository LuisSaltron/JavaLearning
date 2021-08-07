package com.lucho.curso.clases;

public class MainCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja calculo1=new Caja();
		calculo1.setAlto(3);
		calculo1.setAncho(2);
		calculo1.setProfundidad(2);
		System.out.println("Volumen 1: "+calculo1.calcularVolumen());
		Caja calculo2=new Caja(2,1,5);
		System.out.println("Volumen 2: "+calculo2.calcularVolumen());
	}
}
