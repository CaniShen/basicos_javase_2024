package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Direccion;
import service.BuscadorService;


public class BuscarView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BuscadorService service=new BuscadorService(); 
		System.out.println("Introduzca temática: ");
		String tematica=sc.nextLine();
		HashSet<Direccion> direcciones=service.buscar(tematica);
		
		for(Direccion d:direcciones) {
			System.out.println("URL: "+d.getUrl());
			System.out.println("Descripción: "+d.getDescripcion());
			System.out.println("-----------------------");
		}

		
	}

}
//Desarrollar un programa para gestión de ciudades. Una ciudad se caracteriza por nombre, habitantes y pais.
//
//El programa mostrará el siguiente menú: 
//
//1.- Nueva ciudad
//2.- Ciudad más poblada
//3.- Buscar por pais
//4.- Salir
//
//1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre en el mismo pais
//2: muestra directamente los datos de la ciudad má poblada
//3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais 