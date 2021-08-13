package com.lucho.curso.sobrescritura;

public class TestSobreescritura {
	public static void main(String[] args) {
		Gerente gerente1=new Gerente("Juan",500.20,"Sistemas");
		System.out.println(gerente1.obtenerDetalles());
	}
}
