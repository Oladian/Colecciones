package com.iesvirgendelcarmen.colecciones.teoria;
import java.util.Scanner;
/**
 * 
 * @author Izan
 *
 */

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud del array bidimensional");
		int entradaDeDatos = sc.nextInt(); // ¿Se pueden asignar la las longitudes de un array por consola?
		
		int[] distancia;	
		distancia = new int[entradaDeDatos];
		System.out.println(distancia.length);
		
		final int COLUMNAS	=3; // declaración de constantes
		final int FILAS 	=3;
		final int NUMERO_DE_ELEMENTOS=3;
		
		int[][] arrayBidimensional = new int[FILAS][COLUMNAS];
		
		for (int i=0; i < FILAS; i++) {
			for (int j=0; j<COLUMNAS; j++) {
				System.out.printf("Valor de columna %d %d%n", i, j);
				arrayBidimensional[i][j] = sc.nextInt();
			}
		}
		
		mostrarDatosDelArrayBidimensional(arrayBidimensional);
		
		int[][][] arrayTridimensional = 
				new int[NUMERO_DE_ELEMENTOS]
				[NUMERO_DE_ELEMENTOS]
				[NUMERO_DE_ELEMENTOS]; 		// Array Tridimensional
		
		for (int i=0; i < NUMERO_DE_ELEMENTOS; i++) { 
			for (int j=0; j<NUMERO_DE_ELEMENTOS; j++) {
				for (int k=0; k<NUMERO_DE_ELEMENTOS; k++) {
					System.out.printf("%nValor %d %d %d%n", i, j, k);
					arrayTridimensional[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			System.out.println("");
			for (int j=0; j<NUMERO_DE_ELEMENTOS; j++) {
				System.out.println("");
				for (int k=0; k<NUMERO_DE_ELEMENTOS; k++) {
					System.out.printf("%3d", arrayTridimensional[i][j][k]);
				}
			}
		}
		sc.close();
	}

	public static void mostrarDatosDelArrayBidimensional(int[][] array) {
		for (int i=0; i < array.length; i++) {
			System.out.println("");
			for (int j=0; j<array[i].length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
		}
	}
}
