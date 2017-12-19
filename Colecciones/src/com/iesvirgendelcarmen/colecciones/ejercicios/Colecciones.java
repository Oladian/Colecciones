package com.iesvirgendelcarmen.colecciones.ejercicios;

import java.util.Arrays;

public class Colecciones {

	static final int NUMERO_DE_ELEMENTOS = 10;
	public static void main(String[] args) {
		
		final int NUMERO_DE_ELEMENTOS = 10;
		int[] valor1;
		int[] valor2;
		
		valor1 = new int[NUMERO_DE_ELEMENTOS];
		valor2 = new int[NUMERO_DE_ELEMENTOS];
	
		for (int i = 0; i<NUMERO_DE_ELEMENTOS; i++) {
			valor1[i]=3;
			Arrays.fill(valor2, 4);
		}
		
		mostrarDatosArrays(valor1, valor2);
	}
	
	public static void mostrarDatosArrays (int[] array1, int[] array2) {
		System.out.println("Array: ");
		for (int i = 0; i<array1.length; i++) {
			System.out.printf("Elemento de la posición %d: %d %d%n",i ,array1[i], array2[i]);
		}
	}	
}
