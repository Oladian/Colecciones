package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.Arrays;
/**
 * 
 * @author Izan
 *
 */
public class Array1 {

	public static void main(String[] args) {

		
		int[] coleccionEnteros;	// crear colección de tipos enteros de tamaño 10
		coleccionEnteros = new int[10];
		
		for (int i = 0; i < coleccionEnteros.length; i++) { // rellenar el array
			coleccionEnteros[i]=i+1;
		}
		
		double coleccionDouble[] = new double[5]; // crear coleccion de tipo double de tamaño 5
		
		for (double d : coleccionDouble) { //rellenar . El bucle "for each" no se suele usar para almacenar datos en arrays
			d= 5.2;
			System.out.println(d);
		}
		
		String[] coleccionStrings = {"juan", "pepe", "luisa", "joaquin", "enrique"};	//crear coleccion de tipo cadena inicializada
				
		for (int i = 0; i < coleccionDouble.length; i++) { 		//mostramos datos, aunque como no se ha almacenado nada en coleccionDouble, se muestran vacíos
			System.out.println(coleccionDouble[i]);
		} // ¡OJO! Nos encontramos una sorpresa -> No hemos inicializado la coleccion.
		
		for (double d : coleccionDouble) { 		// rellenar el double d con 5.2 con fill
			Arrays.fill(coleccionDouble, 5.2);
		}
		
		for (int i = 0; i < coleccionDouble.length; i++) { //ya no hay sorpresas
			System.out.println(coleccionDouble[i]);
		}
		
		for (int i = 0; i < coleccionStrings.length; i++) {
			System.out.println(coleccionStrings[i]);
		}
		
		
		for (String nombres : coleccionStrings) {
			System.out.println(nombres.toUpperCase().substring(1, 2));
		}
		
		System.out.printf("Tamaño de la colección de cadenas %d%n", coleccionStrings.length);
		// esto de abajo no puede ser, el tamaño es 5 y fijo
		// empezamos a contar desde 0, y en este caso el ultimo es 4
		//coleccionStrings[5]="hola";
		// jajajaskdlah
		
	}
}
