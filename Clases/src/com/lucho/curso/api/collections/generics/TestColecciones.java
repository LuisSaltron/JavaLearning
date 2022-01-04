package com.lucho.curso.api.collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> miLista = new ArrayList<String>();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		// imprimir(miLista);

		Set<String> miSet = new HashSet<String>();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		imprimir(miSet);

		Map<String, String> miMapa = new HashMap<String, String>();
		miMapa.put("dia1", "Lunes");
		miMapa.put("dia2", "Martes");
		imprimir(miMapa.values());

	}

	public static void imprimir(Collection<String> coleccion) {
		coleccion.forEach(elemento -> {
			System.out.println(elemento);
		});
	}
}
