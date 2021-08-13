package paquete2;

class Clase4 {
	private String atributoPrivado="Atributo privado";
	
	private Clase4() {
		System.out.println("Constructor privado");
	}
	
	public Clase4(String argumento) {
		this();
		System.out.println("Constructor publico");
	}
	
	private void metodoPrivado() {
		System.out.println("Metodo privado");
	}

	/**
	 * @return the atributoPrivado
	 */
	public String getAtributoPrivado() {
		return atributoPrivado;
	}

	/**
	 * @param atributoPrivado the atributoPrivado to set
	 */
	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}
	
	
}
