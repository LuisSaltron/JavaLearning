package com.lucho.curso.matrices;

import java.util.Scanner;

public class MainEjercicio3 {
	public static void main(String[] args) {
		int menuopcion = 0;
		int[][] matriz = null;
		Scanner lectura = new Scanner(System.in);
		while (menuopcion != 7) {
			mostrarMenu();
			System.out.println("Selecciona una opcion ingresado su número");
			menuopcion = lectura.nextInt();
			switch (menuopcion) {
			// Rellenar matriz
			case 1:
				System.out.println("Indique número de filas para la matriz");
				int noFilas = lectura.nextInt();
				System.out.println("Indique número de columnas para la matriz");
				int noColumnas = lectura.nextInt();
				matriz = new int[noFilas][noColumnas];
				rellenarMatriz(matriz);
				mostrarMatriz(matriz);
				System.out.println("");
				break;
			// Sumar fila escogida por el usuario
			case 2:
				boolean filaCorrecta = false;
				if (matriz != null) {
					while (!filaCorrecta) {
						System.out.println("Indique el número de fila");
						int fila = lectura.nextInt();
						if (fila >= 0 && fila < matriz.length) {
							if (fila == 0)
								fila = 1;
							else
								fila = fila - 1;
							System.out.println(
									"La sumatoria de la fila" + fila + " es:" + sumarFilaColumna(matriz, true, fila));
							filaCorrecta = true;
						}
					}
				} else {
					System.out.println("La matriz no ha sido rellenada");
					System.out.println("");
					filaCorrecta = true;
				}
				break;
			case 3:
				boolean columnaCorrecta = false;
				if (matriz != null) {
					while (!columnaCorrecta) {
						System.out.println("nro de columnas de la matriz" + matriz[0].length);
						System.out.println("Indique el número de columna");
						int columna = lectura.nextInt();
						if (columna >= 0 && columna < matriz[0].length) {
							if (columna == 0)
								columna = 1;
							else
								columna = columna - 1;
							System.out.println("La sumatoria de la columna" + columna + " es:"
									+ sumarFilaColumna(matriz, false, columna));
							columnaCorrecta = true;
						}
					}
				} else {
					System.out.println("La matriz no ha sido rellenada");
					System.out.println("");
					columnaCorrecta = true;
				}
				break;
			case 4:
				System.out.println("La sumatoria de la diagonal principal es " + sumarDiagonal(matriz, false));
				break;
			case 5:
				System.out.println("La sumatoria de la diagonal inversa es " + sumarDiagonal(matriz, true));
				break;
			case 6:
				System.out.println("La media de los valores de la matriz es " + mediaMatriz(matriz));
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta, intente nuevamente con una válida");
				break;
			}
		}
	}

	public static void mostrarMenu() {
		System.out.println("MENÚ DE OPCIONES:");
		System.out.println("1. Rellenar matriz");
		System.out.println("2. Sumar una fila que ud. escoga");
		System.out.println("3. Sumar una columna que ud. escoga");
		System.out.println("4. Sumar la diagonal principal");
		System.out.println("5. Sumar la diagonal inversa");
		System.out.println("6. Media de los valores de la matriz");
		System.out.println("7. SALIR");

	}

	public static void mostrarMatriz(int[][] matriz) {
		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz[0].length; columnas++) {
				System.out.print(matriz[filas][columnas] + " ");
			}
			System.out.println("");
		}
	}

	public static int generarAleatorio() {
		int numeroAleatorio = (int) (Math.random() * 9);
		return numeroAleatorio;
	}

	public static int[][] rellenarMatriz(int[][] matriz) {

		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz[0].length; columnas++) {
				matriz[filas][columnas] = generarAleatorio();
			}

		}
		return matriz;
	}

	public static int sumarDiagonal(int[][] matriz, boolean esInversa) {
		int sumatoria = 0;
		if (esInversa) {
			for (int filas = 0; filas < matriz.length; filas++) {
				sumatoria += matriz[filas][(matriz.length) - filas - 1];
			}
		} else {
			for (int filas = 0; filas < matriz.length; filas++) {
				sumatoria += matriz[filas][filas];
			}
		}
		return sumatoria;
	}

	public static int sumarFilaColumna(int[][] matriz, boolean esFila, int fila) {
		int sumatoria = 0;
		if (esFila) {
			for (int filas = fila; filas <= fila; filas++) {
				for (int columnas = 0; columnas < matriz[0].length; columnas++) {
					sumatoria += matriz[filas][columnas];
				}
			}
		} else {
			for (int filas = 0; filas < matriz.length; filas++) {
				for (int columnas = fila; columnas <= fila; columnas++) {
					sumatoria += matriz[filas][columnas];
				}
			}
		}
		return sumatoria;
	}

	public static float mediaMatriz(int[][] matriz) {
		int sumatoria = 0;
		for (int filas = 0; filas < matriz.length; filas++) {
			for (int columnas = 0; columnas < matriz[0].length; columnas++) {
				sumatoria += matriz[filas][columnas];
			}
		}
		int numeroElementos = matriz.length * matriz[0].length;
		return sumatoria / numeroElementos;
	}

}
