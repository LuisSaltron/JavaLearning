package com.lucho.curso.sentencias.control;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		String numeroTexto = "";
		switch (numero) {
		case 1:
			numeroTexto = "Uno";
			break;
		case 2:
			numeroTexto = "Dos";
			break;
		case 3:
			numeroTexto = "Tres";
			break;
		case 4:
			numeroTexto = "Cuatro";
			break;
		default:
			numeroTexto = "Numero no encontrado";
			break;
		}
		System.out.println(numeroTexto);

		int mes = 2;
		String estacion = "";
		switch (mes) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Otono";
			break;
		default:
			estacion = "Estacion no conocida";
			break;
		}
		System.out.println(estacion);
	}

}
