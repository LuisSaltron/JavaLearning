/**
 * 
 */
package mx.com.gm.ventas;

import java.util.Arrays;

/**
 * @author Luis Saltron
 *
 */
public class Orden {
	private int idOrden;
	private static final int MAX_PRODUCTOS=10;
	private Producto productos[];
	private int contadorProductos;
	private static int contadorOrdenes;
	
	public Orden() {
		this.productos=new Producto[Orden.MAX_PRODUCTOS];
		this.idOrden=++Orden.contadorOrdenes;
	}
	
	public void agregarProducto(Producto producto) {
		if (this.contadorProductos<Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++]=producto;
		}
		else {
			System.out.println("Se ha superado el máximo de productos "+Orden.MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal() {
		double total=0;
		for (int i = 0; i < this.contadorProductos; i++) {
			total+=this.productos[i].getPrecio();
		}
		return total;
	}

	public void mostrarOrden() {
		System.out.println("Id orden: "+this.idOrden);
		double totalOrden=this.calcularTotal();
		System.out.println("Total de la orden: $"+totalOrden);
		System.out.println("Productos de la Orden");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
		
		
	}
	
}
