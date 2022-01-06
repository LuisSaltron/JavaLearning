package mx.com.gm.peliculas.datos;

import java.util.List;

import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public interface IAccesoDatos {
	public abstract boolean existe(String nombreArchivo) throws AccesoDatosEx;

	public abstract List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

	public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

	public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
	
	public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
	
	public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
}
