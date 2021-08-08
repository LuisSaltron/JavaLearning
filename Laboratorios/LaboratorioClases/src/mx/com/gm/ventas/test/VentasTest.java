package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {

	public static void main(String[] args) {
		Orden orden1=new Orden();
		orden1.agregarProducto(new Producto("Oreo",300.20));
		orden1.agregarProducto(new Producto("Leche",520.60));
		orden1.agregarProducto(new Producto("Leche",520.60));
		orden1.mostrarOrden();
	}
}
