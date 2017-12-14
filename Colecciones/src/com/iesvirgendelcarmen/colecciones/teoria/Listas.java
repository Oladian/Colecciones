package com.iesvirgendelcarmen.colecciones.teoria;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaCadenas = new ArrayList();
		listaCadenas.add("Juan");
		listaCadenas.add("Pedro");
		listaCadenas.add("Pepe");
		listaCadenas.add("Paco");
		listaCadenas.add("Pepito");
		
		System.out.println("Tamaño de la lista: "+listaCadenas.size());
		System.out.println("Elemento 0: "+listaCadenas.get(0));
		
		for (int i=0; i < listaCadenas.size(); i++) {
			System.out.printf("El elemento %d es: %s%n",i,listaCadenas.get(i));
		}
		
		listaCadenas.remove(0);
		System.out.println(listaCadenas);
		listaCadenas.add(0, "Joselito");
		System.out.println(listaCadenas);
		listaCadenas.add(2, "Joselita");
		System.out.println(listaCadenas);
		listaCadenas.set(2, "Paulita");
		System.out.println(listaCadenas);
	}
}
