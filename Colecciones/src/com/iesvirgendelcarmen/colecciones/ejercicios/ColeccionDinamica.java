package com.iesvirgendelcarmen.colecciones.ejercicios;
import java.lang.reflect.Array;
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
		} */
		
 		//FORMA DADA POR EL PROFESOR PARA REALIZAR LA ENTRADA DE LOS DATOS
		
		String cadena = sc.next();
		while (sc.hasNext() && !cadena.equals("fin")) {
			listaCadena.add(cadena);
			cadena = sc.next();
		}
		
		
		/*while (true) {
			String cadena = sc.nextLine().toLowerCase();
			if (cadena.equals("fin"))
				break;
		listaCadena.add(cadena);
		}*/
		
		//añadirCadena(listaCadena);
		//	System.out.println("La nueva lista con items añadidos es: "+listaCadena);
		//	eliminarCadena(listaCadena);
		//	System.out.println("La nueva con items eliminados es: "+listaCadena);
		
		//	mayorLongitud();
		
		System.out.println(listaCadena);
		System.out.println("Coinciden alguna? "+coincideEnLaLista("erloco", listaCadena));
		System.out.printf("Añadiendo la cadena %s a la lista. ¿Éxito? - %b%n","pepito" ,insertarCadena("pepito", listaCadena));
		System.out.printf("Eliminando la cadena %s a la lista. ¿Éxito? - %b%n","pepitoh" ,removerCadena("pepitoh", listaCadena));
		System.out.println(listaCadena);
		System.out.println("CadenaMasLarga - "+obtenerCadenasMasLarga(listaCadena));
	}
	
	public static ArrayList<String> obtenerCadenasMasLarga (ArrayList<String> listaCadena){
		ArrayList<String> listaCadenasMasLargas = new ArrayList<>();
		
		String cadenaMasLarga = listaCadena.get(0);
		listaCadenasMasLargas.add(cadenaMasLarga);

		if (listaCadena.size()==0)
			return listaCadenasMasLargas;
		
		for (int i=1; i<listaCadena.size();i++) {
			if (listaCadena.get(i).length()>cadenaMasLarga.length()) {
				listaCadenasMasLargas.clear();
				listaCadenasMasLargas.add(listaCadena.get(i));
				cadenaMasLarga = listaCadena.get(i);
				continue;
				
			} 
			
			if (listaCadena.get(i).length()==cadenaMasLarga.length()) {
				listaCadenasMasLargas.add(listaCadena.get(i));
			} 	
		}
		return listaCadenasMasLargas;
	}
	
	public static boolean coincideEnLaLista (String cadena, ArrayList<String> arrayList) {
		return arrayList.contains(cadena);
			
	}
		
	public static boolean insertarCadena (String cadena, ArrayList<String> listaCadena) {
		return listaCadena.add(cadena);
	}
	

	
	public static boolean removerCadena (String cadena, ArrayList<String> listaCadena) {
		return listaCadena.remove(cadena);
	}
	
	/*public static void mayorLongitud () {
	final List<String> lista1 = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
	final List<String> lista2 = Arrays.asList("Brian", "Nate", "Raju", "Sara", "Scott", "hh");
	final List<String> lista3 = Arrays.asList("Brian", "Raju", "Sara");
	
	if (lista1.size()>lista2.size() && lista1.size()>lista3.size()) {
		System.out.println(lista1);
	} else if (lista2.size()>lista3.size()) {
		System.out.println(lista2);
	} else
		System.out.println(lista3);
}*/
	
	/*public static void eliminarCadena (ArrayList<String> listaCadena) {
	System.out.println("Introduce las cadenas a eliminar. Fin para salir.");
	Scanner sc = new Scanner(System.in);
	while (true) {
		String cadena = sc.nextLine().toLowerCase();
		if (cadena.equals("fin"))
			break;
	listaCadena.remove(cadena);
	}
}*/
	/*public static void añadirCadena (ArrayList<String> listaCadena) {
	System.out.println("Introduce las cadenas a añadir. Fin para salir.");
	Scanner sc = new Scanner(System.in);
	while (true) {
		String cadena = sc.nextLine().toLowerCase();
		if (cadena.equals("fin"))
			break;
	listaCadena.add(cadena);
	}
}*/
}
