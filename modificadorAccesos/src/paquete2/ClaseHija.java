package paquete2;

import paquete1.Clase2;

public class ClaseHija extends Clase2 {
	public ClaseHija(){
		super();
		this.atributoProtected="Modificacion atributo protected";
		this.metodoProtected();
	}
}
