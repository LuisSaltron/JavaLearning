package mx.com.gm.peliculas.negocio;

import java.util.List;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

	public CatalogoPeliculasImpl() {

	}

	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		IAccesoDatos accesoDato = new AccesoDatosImpl();
		Pelicula pelicula = new Pelicula(nombrePelicula);
		try {
			boolean anexar = false;
			anexar=accesoDato.existe(nombreArchivo);
			accesoDato.escribir(pelicula, nombreArchivo, anexar);
		} catch (EscrituraDatosEx e) {
			System.out.println("Error de escritura");
			e.printStackTrace();
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace();
		}
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		IAccesoDatos accesoDato = new AccesoDatosImpl();
		List<Pelicula> peliculas;
		try {
			peliculas = accesoDato.listar(nombreArchivo);
			peliculas.forEach(pelicula -> {
				System.out.println(pelicula.toString());
			});
		} catch (LecturaDatosEx e) {
			System.out.println("Error de lectura de datos");
			e.printStackTrace();
		}

	}

	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		IAccesoDatos accesoDato = new AccesoDatosImpl();
		try {
			String pelicula=accesoDato.buscar(nombreArchivo, buscar);
			System.out.println(pelicula);
		} catch (LecturaDatosEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void iniciarArchivo(String nombreArchivo) {
		IAccesoDatos accesoDato = new AccesoDatosImpl();
		try {
			accesoDato.crear(nombreArchivo);
		} catch (AccesoDatosEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
