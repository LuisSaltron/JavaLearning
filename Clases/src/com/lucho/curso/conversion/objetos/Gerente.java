package com.lucho.curso.conversion.objetos;

public class Gerente extends Empleado {
	private String departamento;
	
	public Gerente (String nombre, double sueldo, String departamento) {
		super(nombre,sueldo);
		this.departamento=departamento;
	}
	@Override
	public String obtenerDetalles() {
		// TODO Auto-generated method stub
		return super.obtenerDetalles()+", Departamento "+this.departamento;
	}
	
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
