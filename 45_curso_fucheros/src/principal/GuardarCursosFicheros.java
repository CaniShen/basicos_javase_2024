package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFicheros {

	public static void main(String[] args) {
		String[] cursos = { // crear un array de cadenas
				"Java básico", "Python para principantes", "Java ee", "JavaScript en Front", "POO con JAVA",
				"Python y Django", "Desarrollo Web con ASP.NET", "Aplicaciones Web con Python" };
		// solicitamos por teclado la introducción de un
		// nombre y guardaremos en un fichero todo los
		// cursos que contegan ese nombre
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nombre");
		String nombre = sc.nextLine();
		// iniciar el variable ruta,
		guardarCursos(nombre, cursos);

	}

	static void guardarCursos(String nombre, String[] cursos) {
		String ruta = "cursos.txt";
		try (PrintStream out = new PrintStream(ruta)) {
			for (String c : cursos) {
				// si el curso contiene ese nombre se guarda
				if (c.contains(nombre)) {
					out.println(c);
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

}
