package com.gm.mundopc2.test;

import com.gm.mundopc2.Orden;
import com.gm.mundopc2.Computadora;
import com.gm.mundopc2.Monitor;
import com.gm.mundopc2.Raton;
import com.gm.mundopc2.Teclado;

public class MundoPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teclado tecladoHP=new Teclado("E", "Hewlett Packard");
		Raton mouseGenius=new Raton("A","Genius");
		Monitor monitorSamsung=new Monitor("Samsung",21.5);
		Computadora compuGamer=new Computadora("Gamer Ryzen",monitorSamsung,tecladoHP,mouseGenius);
		Orden ordenGamer=new Orden();
		ordenGamer.agregarComputadora(compuGamer);
		System.out.println(ordenGamer.toString());
	}
}
