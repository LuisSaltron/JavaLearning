package mx.com.gm.peliculas.negocio;

public interface ICatalogoPeliculas {
	public abstract void agregarPelicula(String nombrePelicula, String nombreArchivo);

	public abstract void listarPeliculas(String nombreArchivo);

	public abstract void buscarPelicula(String nombreArchivo, String buscar);

	public abstract void iniciarArchivo(String nombreArchivo);
}
