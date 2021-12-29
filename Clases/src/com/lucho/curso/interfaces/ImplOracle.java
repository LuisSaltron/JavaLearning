package com.lucho.curso.interfaces;

public class ImplOracle implements IAccesoDatos {

	@Override
	public void insertar() {
		System.out.println("Insertar desde Oracle");
	}

	@Override
	public void listar() {
		System.out.println("Listar desde Oracle");
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar desde Oracle");
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar desde Oracle");
	}

}
