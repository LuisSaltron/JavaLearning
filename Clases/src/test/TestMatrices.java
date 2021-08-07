package test;

import com.lucho.curso.matrices.Persona;

public class TestMatrices {

	public static void main(String[] args) {
		int edades[][]=new int[3][2];
		String frutas[][]= {{"Naranja","Limon"},{"Fresa","Zarzamora"}};
		Persona personas[][]= new Persona[3][2];
		personas[0][0]=new Persona("Luis");
		personas[0][1]=new Persona("Carlos");
		personas[1][0]=new Persona("Maria");
		personas[1][1]=new Persona("Angela");
		personas[2][0]=new Persona("Teresa");
		personas[2][1]=new Persona("Carmela");
		edades[0][0]=33;
		edades[0][1]=20;
		edades[1][0]=12;
		edades[1][1]=22;
		edades[2][0]=36;
		edades[2][1]=18;
		System.out.println("Edad 0-1:"+edades[0][1]);
		for (int i = 0; i < edades.length; i++) {
			for (int j = 0; j < edades[i].length; j++) {
				System.out.println("Edad: "+edades[i][j]);
			}
		}
		imprimir(frutas);
		imprimir(personas);
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {
				System.out.println("Persona "+i+"-"+j+" = "+personas[i][j].getNombre());
			}
		}
		
	}
	public static void imprimir(Object matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("matriz "+i+"-"+j+" = "+matriz[i][j]);
			}
		}
	}
}
