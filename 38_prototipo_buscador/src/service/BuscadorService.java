package service;
import java.util.HashSet;

import model.Direccion;


public class BuscadorService {

	HashSet<Direccion> direcciones=new HashSet<Direccion>();
	public BuscadorService() {
		direcciones.add(new Direccion("http://www.amazon.es/", "libros", "web de libros y más cosas"));
		direcciones.add(new Direccion("http://www.fnac.es/", "libros", "libreria completa"));
		direcciones.add(new Direccion("http://www.travel.es/", "viajes", "viajes por el mundo"));
		direcciones.add(new Direccion("http://www.game.es/", "juegos", "el mundo del juego"));
		direcciones.add(new Direccion("http://www.fly.com/", "viajes", "vuelos a todos los destinos"));
		direcciones.add(new Direccion("http://www.casadellibro.es/", "libros", "libros de todos los temas")); 

	}
	//metodo que a partir de una temática devuelva un subconjunto 
	//con las direcciones asociada a dichata temática

	public HashSet<Direccion> buscar(String tematica) {
		HashSet<Direccion> auxiliar=new HashSet<Direccion>();
		for(Direccion d:direcciones) {
			
			 	if (d.getTematica().equals(tematica)) {
			 		auxiliar.add(d);
			 	}
		
	
			}
		return auxiliar;
		
		
	}
	
	
}
