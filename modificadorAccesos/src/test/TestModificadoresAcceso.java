package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Clase con métodos y modificador publico
		Clase1 clase1 = new Clase1();
		System.out.println(clase1.atributoPublico);
		clase1.metodoPublico();
		// Clase con métodos y modificador protected
		ClaseHija clase2 = new ClaseHija();
		System.out.println(clase2);
	}

}
