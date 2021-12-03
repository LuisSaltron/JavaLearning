package mx.com.gm.ventas2;

import java.util.Arrays;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private int contadorProductos;
	private static int contadorOrdenes;
	private static final int MAX_PRODUCTOS=10;
	
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
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orden [idOrden=");
		builder.append(idOrden);
		builder.append(", productos=");
		builder.append(Arrays.toString(productos));
		builder.append("] ");
		builder.append("Total productos =");
		builder.append(String.valueOf(this.calcularTotal()));
		return builder.toString();
	}
	
	
}
