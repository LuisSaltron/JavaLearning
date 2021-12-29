package com.lucho.curso.interfaces;

public interface IAccesoDatos {
	public final int MAX_REGISTROS=10;
	
	public abstract void insertar();
	
	public abstract void listar();
	
	public abstract void actualizar();
	
	public abstract void eliminar();
}
