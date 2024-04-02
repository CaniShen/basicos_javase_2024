package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String>cadenas=new ArrayList<String>();
		ArrayList<Integer>numeros=new ArrayList<Integer>();
		var decimales=new ArrayList<Double>();//tamaño de la colección:0, ya que recién lo creamos
		System.out.println(cadenas.size());
		
		cadenas.add("lunes");
		cadenas.add("martes");
		cadenas.add(0,"miercoles");
		//cadenas.add(7,"jueves");//Excepción 
		System.out.println(cadenas.get(2));
	
//		numeros.add(35); //el objeto Integer
//		numeros.add(numeros.get(0));
//		numeros.set(0, 100);
//		System.out.println(numeros.get(1));
//		numeros.set(1, 40);
		cadenas.remove(1);//eliminar "lunes", "el martews se mueve a su posición.
		
		if (!cadenas.contains("martes")) {
			cadenas.add("martes");
		}
		
		for(int i=0;i<cadenas.size();i++) {
			System.out.println(cadenas.get(i));
		}
		
		
	}

}
//
