package paquete1;

public class Clase2 {
	public String atributoPublico="Valor atributo publico";
	protected String atributoProtected="Valor atributo protected";

	protected Clase2() {
		System.out.println("Constructor protected");
	}
	
	protected void metodoProtected() {
		System.out.println("Metodo protected");
	}
}
