package mx.com.gm.peliculas.domain;

public class Pelicula {
	private String nombre;

	public Pelicula() {

	}

	public Pelicula(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
}
