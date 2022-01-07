package cpjlaboratoriofinal;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {

	public static void main(String[] args) {
		int opcion = 1;
		String nombreArchivo;
		String nombrePelicula;
		ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
		Scanner sc = new Scanner(System.in);
		while (opcion != 0) {
			System.out.println("CATALOGO DE PELICULAS");
			System.out.println("-----------------------");
			System.out.println("1. Iniciar catálogo");
			System.out.println("2. Agregar película");
			System.out.println("3. Listar Películas");
			System.out.println("4. Buscar Película");
			System.out.println("0. Salir");
			System.out.println("Escoger una opción: ");
			opcion = sc.nextInt();
			System.out.println("Opción escogida: " + opcion);
			switch (opcion) {
			case 0:
				System.exit(0);
				break;
			case 1: // Iniciar catalogo
				System.out.println("Indique el nombre del archivo: ");
				nombreArchivo = sc.next();
				catalogoPeliculas.iniciarArchivo(nombreArchivo);
				break;
			case 2: // agregar peli
				System.out.println("Indique el nombre del archivo: ");
				nombreArchivo = sc.next();
				System.out.println("Indique el nombre de la película: ");
				nombrePelicula = sc.next();
				catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
				break;
			case 3:
				System.out.println("Indique el nombre del archivo: ");
				nombreArchivo = sc.next();
				catalogoPeliculas.listarPeliculas(nombreArchivo);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Indique el nombre del archivo: ");
				nombreArchivo = sc.next();
				System.out.println("Indique el nombre de la película: ");
				nombrePelicula = sc.next();
				catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}

	}
}
