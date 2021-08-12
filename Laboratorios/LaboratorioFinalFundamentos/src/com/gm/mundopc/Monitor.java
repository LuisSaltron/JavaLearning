package com.gm.mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double size;
	public static int contadorMonitor;
	
	private Monitor() {
		this.idMonitor=++Monitor.contadorMonitor;
	}
	 
	public Monitor(String marca, double size) {
		this();
		this.marca = marca;
		this.size = size;
	}
	
	public int getIdMonitor() {
		return idMonitor;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [idMonitor=");
		builder.append(idMonitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}
	
}
