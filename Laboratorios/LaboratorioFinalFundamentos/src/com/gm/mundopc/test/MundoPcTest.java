package com.gm.mundopc.test;

import com.gm.mundopc.Computador;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raton raton1 = new Raton("Alambrico", "Genius");
		Teclado teclado1 = new Teclado("Wireless", "Genius");
		Monitor monitor1=new Monitor("Samsung",21.9);
		Computador computador1=new Computador("The Beast",monitor1,teclado1,raton1);
		Orden orden1=new Orden();
		orden1.agregarComputador(computador1);
		System.out.println(orden1.toString());
	}

}
