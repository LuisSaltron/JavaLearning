package com.lucho.curso.ciclos;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For normal
		
		for (int i = 0; i < 3; i++) {
			if (i % 2 == 0) {
				System.out.println("Contador" + i);
			}
		}
		// Uso de la palabra break
		for (int i = 0; i < 3; i++) {
			if (i % 2 == 0) {
				System.out.println("Contador" + i);
				break;
			}
		}
		// Uso de la palabra continue
		inicio:
		for (int i = 0; i < 3; i++) {
			if (i % 2 != 0) {
				continue inicio;
			}
			System.out.println("Contador" + i);
		}
	}
}
