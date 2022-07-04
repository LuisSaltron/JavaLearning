package com.lucho.curso.arreglos;

public class MainOrdenamientoBurbuja {
	public static void main(String[] args) {
		final int size = 4;
		int[] numerosSinOrdenar = new int[size];
		int[] numerosOrdenados = new int[size];
		numerosSinOrdenar = rellenarArray(numerosSinOrdenar);
		mostrarArray(numerosSinOrdenar);
		System.out.println("");
		numerosOrdenados = burbuja(numerosSinOrdenar);
		mostrarArray(numerosOrdenados);
	}
	
	public static int[] burbuja(int[] lista) {
		int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<lista.length-1;i++){
                if (lista[i]>lista[i+1]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
        return lista;
    }

	public static int[] rellenarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 9);
		}
		return numeros;
	}

	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
