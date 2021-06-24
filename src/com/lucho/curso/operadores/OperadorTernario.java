package com.lucho.curso.operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultado=(1>2)? "verdadero":"falso";
		System.out.println(resultado);
		
		int numero=7;
		resultado=(numero%2==0)? "verdadero":"falso";
		
		System.out.println(resultado);
	}

}