package com.lucho.curso.manejo.archivos;
import static com.lucho.curso.manejo.archivos.ManejoArchivos.*;

public class TestManejoArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreArchivo="prueba.txt";
		crearArchivo(nombreArchivo);
		anexarInformacionArchivo(nombreArchivo,"Testing archivo");
		anexarInformacionArchivo(nombreArchivo, "Texto anexado");
		leerArchivo(nombreArchivo);
	}

}
