package mx.com.gm.ventas2.test;

import mx.com.gm.ventas2.Orden;
import mx.com.gm.ventas2.Producto;

public class VentasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orden orden1=new Orden();
		orden1.agregarProducto(new Producto("Agua Brisa",1500.50));
		orden1.agregarProducto(new Producto("Chocolatina",2000.00));
		System.out.println(orden1.toString());
	}

}
