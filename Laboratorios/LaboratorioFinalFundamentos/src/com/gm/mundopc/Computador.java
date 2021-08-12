package com.gm.mundopc;

public class Computador {
	private int idComputador;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputador;

	private Computador() {
		this.idComputador = ++Computador.contadorComputador;
	}

	public Computador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * @param monitor the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * @return the teclado
	 */
	public Teclado getTeclado() {
		return teclado;
	}

	/**
	 * @param teclado the teclado to set
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	/**
	 * @return the raton
	 */
	public Raton getRaton() {
		return raton;
	}

	/**
	 * @param raton the raton to set
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [idComputador=");
		builder.append(idComputador);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", raton=");
		builder.append(raton);
		builder.append("]");
		return builder.toString();
	}
}
