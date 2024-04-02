package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Mostrar_Nota {

	public static void main(String[] args) {
//		Realizar un programa para solicitar al usuario las notas de un grupo de alumnos.
//		Al iniciarse el programa, se le pide al usuario que introduzca una nota y esta se guardará. 
//		Después, se le pregunta si quiere introducir una nueva nota, si dice que sí,
//		se le pide otra nota y así sucesivamente hasta que diga que no.
//		Cuando se hayan guardado todas las notas, el programa mostrará los siguientes datos:
//		-Nota media
//		-Aprobados
//		-Nota más alta 

		int nota;
		String respuesta;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();

		do {
			// pedir nota, guardar y preguntar si quiere
			// introducir otra

			System.out.println("Introduzca nota por favor: ");
			nota = Integer.parseInt(sc.nextLine());
			notas.add(nota);
			System.out.println("¿Quieres introducir otra nota?(s/n)");
			respuesta = sc.nextLine();

		} while (respuesta.equalsIgnoreCase("s")); // mientras diga que sí

		if (respuesta.equalsIgnoreCase("n"))
			;
		{// mientras diga que no
			System.out.println("Media: " + calcularMedia(notas));
			System.out.println("Aprobados: "+totalAprobados(notas));
			System.out.println("Nota más alta: "+notaMayor(notas));

		}

	}

	static double calcularMedia(ArrayList<Integer> notas) {
		double media = 0;
		for (Integer n : notas) {
			media += n;
		}
		return media / notas.size();
	}

	static int totalAprobados(ArrayList<Integer> notas) {
		int aprobados=0;
		for(Integer n:notas) {
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;

	}

	static int notaMayor(ArrayList<Integer> notas) {
		int mayor = notas.get(0);
		for (Integer n : notas) {
			if (n > mayor) {
				mayor = n;
			}
		}
		return mayor;

	}

}
