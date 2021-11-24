package com.lucho.curso.herencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona {
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;

	public Cliente(String nombre, char genero, int edad, String direccion, String fecha, boolean vip) {
		super(nombre,genero,edad,direccion);
		this.idCliente = ++Cliente.contadorCliente;
		try {
			this.fechaRegistro = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.vip = vip;
	}


	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the vip
	 */
	public boolean isVip() {
		return vip;
	}

	/**
	 * @param vip the vip to set
	 */
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
