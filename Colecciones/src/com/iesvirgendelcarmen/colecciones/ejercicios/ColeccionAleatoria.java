package com.iesvirgendelcarmen.colecciones.ejercicios;

import java.util.Arrays;

public class ColeccionAleatoria {
		
	static final int NUMERO_DE_ELEMENTOS = 100;
	
	public static void main(String[] args) {
	
		int[] array1;
		array1 = new int[NUMERO_DE_ELEMENTOS];
		
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			array1[i]=(int) (Math.random()*100);
		}
		
		int resultadoMedia= valorMedio(array1);
		double resultadoDesviacion = desviacionTipica(array1);
		int valorMaximo = resultadoValorMaximo(array1);
		int valorMinimo = resultadoValorMinimo(array1);
		
		int[] arrayClonado = array1.clone(); // clona el array 1
		
		System.out.println("Media: " + resultadoMedia);
		System.out.printf("Desviación estándar: %.2f%n", resultadoDesviacion);
		System.out.println("Array clonado del original: " + Arrays.toString(arrayClonado));
		ordenarArray(array1);
		arrayPares(array1);
		System.out.printf("%nValor máximo: %d%n", valorMaximo);
		System.out.printf("%nValor mínimo: %d%n", valorMinimo);
		
		System.out.println(Arrays.toString(devolverParesDelArray(array1)));
		//arrayConPares(arrayClonado);

	}
	
	public static int valorMedio (int[] array1) {
		
		int suma = 0;
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			suma+=array1[i];
		}
		return (suma/100);
	}
	
	public static double desviacionTipica (int[] array1) {
		
		int varianza = 0;
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			varianza += (int) (array1[i]*array1[i]/100);
		}
		return Math.sqrt(varianza);
	}
	
	public static void ordenarArray ( int[] array1 ) {
		Arrays.sort(array1);
		System.out.println("Array ordenado: "+Arrays.toString(array1));
	}
	
	public static void arrayPares (int[] array1 ) {
		System.out.printf("%nSolo pares: %n");
		for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++) {
			if (array1[i]%2==0)	System.out.printf("%d  ", array1[i]);
		}
	}
	
	public static int resultadoValorMaximo (int[] array1) {
		   int valorMaximo = array1[0]; 
		    for(int i=1; i < array1.length; i++) {
		      if(array1[i] > valorMaximo) valorMaximo = array1[i]; 
		    }
		    return valorMaximo; 
	  }
	
	public static int resultadoValorMinimo (int[] array1) {
		   int valorMinimo = array1[0]; 
		    for(int i=1; i < array1.length; i++) {
		      if(array1[i] < valorMinimo) valorMinimo= array1[i]; 
		    }
		    return valorMinimo; 
	  }
	
	public static int[] devolverParesDelArray (int[] array) {
		int numerosPares=0;
		for (int i: array) {
			if (i%2==0) {
				numerosPares++;
			}
		}
		
		int[] arrayPares = new int[numerosPares];
		int contador=0;
		
		for (int i=0; i< array.length;i++) {
			if (array[i]%2==0) {
				arrayPares[contador]=array[i];
				contador++;
			}	
		}
		return arrayPares;
	}
	
/*	public static void arrayConPares (int[] array) {
		
		int[] arrayPares;
		int contador=0;
		int cuentaNumero=0;
		for (int i=0; i < array.length; i++) {
			if (array[i]%2==0) {
				contador++;
				System.out.println(array[i]);
			}
		}
		
		arrayPares = new int[contador];
		System.out.println("CANTIDAD DE PARES ====>"+arrayPares.length);

		for (int j=0; j<arrayPares.length; j++) {
			if (array[j]%2==0) {
				arrayPares[cuentaNumero]=array[j];
				System.out.println("P____"+arrayPares[j]);
				cuentaNumero++;
				System.out.println("Numero "+cuentaNumero);
			}
				
		}

		for (int i=0; i<arrayPares.length; i++) {
			System.out.println("N+I______"+arrayPares[i]+" ===> "+i);
		}
	}
*/
}
