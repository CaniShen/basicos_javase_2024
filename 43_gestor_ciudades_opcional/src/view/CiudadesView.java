package view;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import model.Ciudad;
import service.ServiceCiudades;

public class CiudadesView {

	// TODO Desarrollar un programa para gestión de ciudades. Una ciudad se
	// caracteriza por nombre, habitantes y pais.
	//
	// El programa mostrará el siguiente menú:
	//
	// 1.- Nueva ciudad
	// 2.- Ciudad más poblada
	// 3.- Buscar por pais
	// 4.- Salir
	//
	// 1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos
	// ciudades con mismo nombre en el mismo pais
	// 2: muestra directamente los datos de la ciudad má poblada
	// 3: se pide un nombre de pais y se muestran los datos de todas las ciudades de
	// dicho pais
	static ServiceCiudades service = new ServiceCiudades();

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			// presentar menu
			// leer opción y comprobar opción elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				AgregaCiudad();
				break;
			case 2:
				CiudadMasHabitantes();

				break;
			case 3:
				BuscaPorPais();
				break;
			case 4:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida");

			}

		} while (opcion != 4);// mienstras no seleccione 4)

	}

	static void presentarMenu() {
		System.out.println("""
				1.- Nueva ciudad
				2.- Ciudad más poblada
				3.- Buscar por país
				4.- Salir

				""");

	}

	static void AgregaCiudad() throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre de la ciudad: ");
		String nombre = sc.nextLine();
		System.out.println("Habitantes:");
		long habitantes = Integer.parseInt(sc.nextLine());
		System.out.println("Intruduzca su país: ");
		String pais = sc.nextLine();
		Ciudad c = new Ciudad(nombre, habitantes, pais);
		if (service.agregaCiudad(c)) {
			System.out.println("Se ha agregado correctamente");
		}else {
			System.out.println("La ciudad introducida ya existe.");
		}
		
	}

	static void CiudadMasHabitantes() {
		Ciudad c = service.mostrarCiudadMasPoblada();
		System.out.println("La ciudad más poblado es: " + c.getNombre());

	}

	static void BuscaPorPais() throws ParseException {
		Scanner sc = new Scanner(System.in); // crear el objeto Scanner

		System.out.println("Introduce el país: "); // El usuario introduzca el país
		String pais = sc.nextLine(); // lo que introduce se llama "pais"
		HashSet<Ciudad> c = service.buscarPorPais(pais);
		System.out.println("Los datos de dicha país son: "); // dentro de la colección de Ciudades , buscamos por el
																// parámetro país.
		for (Ciudad ciudad : c) { // recorremos todas las ciudades.
			System.out.println(ciudad.getNombre());
		}

	}

}

