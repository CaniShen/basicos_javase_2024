package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaTabla {

	public static void main(String[] args) {
		HashMap<String,Integer> ciudades=new HashMap<String, Integer>();
		ciudades.put("Madrid", 3200000);
		ciudades.put("Zaragoza", 300000);
		ciudades.put("Caceres", 1000000);
		ciudades.put("Caceres", 120000);
		System.out.println(ciudades.get("Caceres"));
		//recorrido de un HashMap
		//claves: 
		Set<String> claves=ciudades.keySet();
		for(String n:claves) {
			//no se puede
			System.out.println(n);
		}
		//valores:
		Collection<Integer> valores=ciudades.values();
		for(Integer n:valores) {
			System.out.println(n);
		}
		
		
	}

}
