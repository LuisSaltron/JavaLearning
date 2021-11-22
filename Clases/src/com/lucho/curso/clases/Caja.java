package com.lucho.curso.clases;

public class Caja {
	int ancho, alto, profundidad;

	public Caja() {
		System.out.println("Constructor vacío");
	}

	public Caja(int ancho, int alto, int profundidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}
	
	public int calcularVolumen() {
		return ancho*alto*profundidad;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

}
