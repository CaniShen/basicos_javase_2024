package service;


import java.util.HashSet;

import model.Ciudad;

public class ServiceCiudades {
	//Desarrollar un programa para gestión de ciudades. Una ciudad se caracteriza por nombre, habitantes y pais.
	//
	//El programa mostrará el siguiente menú: 
	//
	//1.- Nueva ciudad
	//2.- Ciudad más poblada
	//3.- Buscar por pais
	//4.- Salir
	//
	//1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre en el mismo pais-----&&
	//2: muestra directamente los datos de la ciudad má poblada
	//3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais 
	
	HashSet <Ciudad>ciudades=new HashSet<>();// A crear un objeto de HashSet que contiene más de 2 elementos(nombre, habitantes y pais...)
											// Se guarda al objeto Ciudad. 
	

	public boolean agregaCiudad(Ciudad ciudad) {
		// si hay dos ciudades con el mismo nombre en un mismo pais. NO SE AGREGAN
		for (Ciudad c : ciudades) {
			if (c.getNombre().equals(ciudad.getNombre()) && c.getPais().equals(ciudad.getPais())) {// c. se refiere a las ciudades guardadas, y ciudad.
																							// es la ciudad que queire introducir.																					 
				return false;
			}
		}
		ciudades.add(ciudad);		
		return true;

	}
	public Ciudad mostrarCiudadMasPoblada() {
		Ciudad ciudad1=new Ciudad();//crea nuevo objeto Ciudad
		ciudad1.setHabitantes(0);
		for (Ciudad c:ciudades) {
			if(ciudad1.getHabitantes()<c.getHabitantes()) {
				ciudad1=c;
				
			}
			
		}
		return ciudad1;
	}
	
	public HashSet<Ciudad>buscarPorPais(String pais) { // El objeto HashSet con la clase Ciudad, y con el parámetro pais.
		HashSet<Ciudad> auxiliar=new HashSet<Ciudad>(); //creando un OBJETO de HashSet (una coleccion de varios objetos contienen más de dos elementos)
		for (Ciudad c:ciudades) {						// recorremos las ciudades guardadas para buscar el país.
			if (c.getPais().equals(pais)){				// si las ciudades guardades contienen el pais que el usuario introducido.
				auxiliar.add(c);						//guardamos al HashSet auxiliar.
			}
		}
		return auxiliar;								//devolvemos el conjunto de ciudades.
		
		
	}
	
	
	
	
}
