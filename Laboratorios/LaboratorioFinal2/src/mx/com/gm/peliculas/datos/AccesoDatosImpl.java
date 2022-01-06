package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements IAccesoDatos {

	@Override
	public boolean existe(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		List<Pelicula> peliculas = new ArrayList<>();
		File archivo = new File(nombreArchivo);
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			while (lectura != null) {
				Pelicula pelicula = new Pelicula(lectura);
				peliculas.add(pelicula);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al listar peliculas " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al listar peliculas " + e.getMessage());
		}
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
		File archivo = new File(nombreArchivo);
		if (anexar) {
			try {
				PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
				salida.println(pelicula.getNombre());
				salida.close();
				System.out.println("Se ha anexado una pelicula en el archivo");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new EscrituraDatosEx("Excepción al listar peliculas " + e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				throw new EscrituraDatosEx("Excepción al listar peliculas " + e.getMessage());
			}
		} else {
			try {
				PrintWriter salida = new PrintWriter(archivo);
				salida.println(pelicula.getNombre());
				salida.close();
				System.out.println("Se ha escrito una pelicula en el archivo");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new EscrituraDatosEx("Excepción al listar peliculas " + e.getMessage());
			}
		}
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		File archivo = new File(nombreArchivo);
		String resultado = null;
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String lectura = entrada.readLine();
			int indice = 1;
			while (lectura != null) {
				if (buscar != null && buscar.equalsIgnoreCase(lectura)) {
					resultado = "Pelicula " + lectura + " encontrada en el indice " + indice;
					break;
				}
				lectura = entrada.readLine();
				indice++;
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al buscar pelicula " + e.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new LecturaDatosEx("Excepción al buscar pelicula " + e.getMessage());
		}
		return resultado;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AccesoDatosEx("Excepción al crear catalogo " + e.getMessage());
		}
	}

	@Override
	public void borrar(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		if (archivo.exists()) {
			archivo.delete();
			System.out.println("se ha borrado el archivo");
		}
	}
}
