package com.lucho.curso.excepciones;

public class TestExcepciones {

	public static void main(String[] args) {
		int resultado = 0;
		try {
			resultado = Aritmetica.divison(10, 0);
		}
		catch (OperacionExcepcion e) {
			System.out.println("Ocurrio un error de tipo OperacionExcepcion");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrio un error: ");
			e.printStackTrace(System.out);
		}
		finally {
			System.out.println("Se revisó división entre cero");
		}
		System.out.println(resultado);
	}
}
