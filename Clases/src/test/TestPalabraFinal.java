package test;

import com.lucho.curso.palabraFinal.Persona;

public class TestPalabraFinal {

	public static void main(String[] args) {
		final int miVariable=10;
		System.out.println("mi variable ="+miVariable);
		System.out.println("La constante NUM es: "+Persona.NUM);
		final Persona persona1=new Persona();
		System.out.println("Primera referencia del objeto persona"+persona1.getNombre());
		persona1.setNombre("test");
		System.out.println("Cambiamos el atributo de la clase "+persona1.getNombre());
	}
}
