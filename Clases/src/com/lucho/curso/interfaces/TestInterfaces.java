package com.lucho.curso.interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		IAccesoDatos datos=new ImplMySql();
		IAccesoDatos datos2=new ImplOracle();
		datos.insertar();
		datos2.actualizar();
		imprimir(datos);
		imprimir(datos2);
	}
	public static void imprimir(IAccesoDatos datos) {
		datos.listar();
	}
}
