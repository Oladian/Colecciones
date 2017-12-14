package com.iesvirgendelcarmen.colecciones.teoria;

public class Array1 {

	public static void main(String[] args) {
		// crear colección de tipos enteros de tamaño 10
		
		int[] coleccionEnteros;
		coleccionEnteros = new int[10];
		
		// rellenar el array
		
		for (int i = 0; i < coleccionEnteros.length; i++) {
			coleccionEnteros[i]=i+1;
		}
		
		// crear coleccion de tipo double de tamaño 5
		double coleccionDouble[] = new double[5];
		
		//rellenar el array
		for (double dd : coleccionDouble) {
			dd= 5.2;
		}
		
		//crear coleccion de tipo cadena inicializada
		
		String[] coleccionStrings = {"juan", "pepe", "luisa", "joaquin", "enrique"};

	}
}
