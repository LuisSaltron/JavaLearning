package mx.com.gm.peliculas.excepciones;

@SuppressWarnings("serial")
public class AccesoDatosEx extends Exception {
	public AccesoDatosEx(String mensaje) {
		super(mensaje);
	}
}
