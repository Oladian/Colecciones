package com.iesvirgendelcarmen.colecciones.teoria;
import java.util.Scanner;
/**
 * 
 * @author Izan
 *
 */
public class EjemploArray {
	public static void main(String[] args) {
		final int NUMERO_DE_ELEMENTOS = 10;
		double[] numeros = new double[NUMERO_DE_ELEMENTOS];
		double[] numeros50 = new double[50];
		Scanner sc = new Scanner(System.in);		
		for (int i=0; i<50; i++) {
			numeros50[i]=i;
		}
		for (int i=0; i<50; i++) {
			System.out.println(numeros50[i]);
		}
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			System.out.println("Introduce numero");
			numeros[i] = sc.nextDouble();
		}
		for (int i=0; i<NUMERO_DE_ELEMENTOS; i++) {
			System.out.println(numeros[i]);

		}
		sc.close();		
	}	
}
