package com.lucho.curso.clase.generica;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica<Integer> num1=new ClaseGenerica<Integer>(15);
		num1.obtenerTipo();
		
		ClaseGenerica<String> palabra=new ClaseGenerica<String>("Palabra");
		palabra.obtenerTipo();
	}

}
