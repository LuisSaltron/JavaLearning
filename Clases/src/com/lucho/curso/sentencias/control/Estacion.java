package com.lucho.curso.sentencias.control;

public class Estacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = 10;
		String estacion = "";
		if (mes == 1 || mes == 2 || mes == 12) {
			estacion = "Invierno";
		} else if (mes == 3 || mes == 4 || mes == 5) {
			estacion = "Primavera";
		} else if (mes == 6 || mes == 7 || mes == 8) {
			estacion = "Verano";
		} else if (mes == 9 || mes == 10 || mes == 11) {
			estacion = "Otono";
		} else {
			estacion = "Estacion desconocida";
		}
		System.out.println("Estacion: "+estacion);
	}
}
