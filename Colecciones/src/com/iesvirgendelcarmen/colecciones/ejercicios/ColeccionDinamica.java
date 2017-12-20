package com.iesvirgendelcarmen.colecciones.ejercicios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColeccionDinamica {
	public static void main(String[] args) {
	
		ArrayList<String> listaCadena= new ArrayList<String>(); // creación del array list
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabras. Fin para terminar.");
		
		/* OTRA FORMA DE HACER EL BUCLE	
		for (int i=0; i<listaCadena.size()+1; i++) {		
			listaCadena.add(sc.next().toLowerCase());
			if (listaCadena.get(i).equals("fin"))	
		//	if (listaCadena.get(i).equalsIgnoreCase("fin")) // Forma elegante para ignorar FIN
				break;
		}
		
		*/
			
		
		while (true) {
			String cadena = sc.nextLine().toLowerCase();
			if (cadena.equals("fin"))
				break;
		listaCadena.add(cadena);
		}
		
		
		/* FORMA DADA POR EL PROFESOR PARA REALIZAR LA ENTRADA DE LOS DATOS
		
		String cadena = sc.next();
		while (sc.hasNext() && !cadena.equals("fin")) {
			listaCadena.add(cadena);
			cadena = sc.next();
		}*/
		
		System.out.println(listaCadena);
		mayorLongitud();
		System.out.println("Coinciden alguna? "+coincideEnLaLista("erloco", listaCadena));
		añadirCadena(listaCadena);

	}
	
	public static void mayorLongitud () {
		final List<String> lista1 = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> lista2 = Arrays.asList("Brian", "Nate", "Raju", "Sara", "Scott", "hh");
		final List<String> lista3 = Arrays.asList("Brian", "Raju", "Sara");
		
		if (lista1.size()>lista2.size() && lista1.size()>lista3.size()) {
			System.out.println(lista1);
		} else if (lista2.size()>lista3.size()) {
			System.out.println(lista2);
		} else
			System.out.println(lista3);
	}
	
	public static boolean coincideEnLaLista (String cadena, ArrayList<String> arrayList) {
		return arrayList.contains(cadena);
			
	}
	
	public static void añadirCadena (ArrayList<String> listaCadena) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String cadena = sc.nextLine().toLowerCase();
			if (cadena.equals("fin"))
				break;
		listaCadena.add(cadena);
		}
		System.out.println(listaCadena);
	}
}
