package com.lucho.curso.enumeraciones;

public class TestEnumeraciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dia 1: "+Dias.LUNES);
		indicarDiaSemana(Dias.MARTES);
		System.out.println("Continente No. 4: "+Continentes.AMERICA);
		System.out.println("Número de países: "+Continentes.AMERICA.getPaises());
	}
	
	private static void indicarDiaSemana(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer día de la semana");
			break;
		case MARTES:
			System.out.println("Segundo día de la semana");
		default:
			break;
		}
	}

}
