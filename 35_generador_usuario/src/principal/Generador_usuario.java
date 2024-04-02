package principal;

import java.util.Scanner;

public class Generador_usuario {

	public static void main(String[] args) {
		// Ejercicio voluntario.
		// Realizar un programa que genere 100 números aleatorios entre 1 y 20 y los
		// guarde en un array.
		// Después, el programa solicita al usuario la introducción de un número entre
		// 1 y 20.
		// A continuación el programa nos mostrará los siguientes datos:
		// -Número de veces que el número solicitado aparece en el array
		// -Total de números que hay en el array (sin contar duplicados) que sean más
		// pequeños que el número solicitado
		int numIntro;
		int[]numerosGenerados=new int [100];
		generaNumeros(numerosGenerados);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 1 a 20 : ");
		numIntro=sc.nextInt();
		
		System.out.println("El array creado es: ");
		for(int num: numerosGenerados) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		System.out.println("Numero de veces son: "+ calculaVeces(numerosGenerados,numIntro));
		System.out.println("Numeros más pequeñas son: "+numeroMenos(numerosGenerados,numIntro));
					
		
		

	}

	// Aquí es un metodo, que no devuelve nada pero sí modifica los parametros.
	static void generaNumeros(int[] NumGenerados) {
		for (int i = 0; i < 100; i++) {
			int numero = (int) (Math.random() * 20 + 1);
			NumGenerados[i] = numero;// Asignar al Array

		}

	}

	static int calculaVeces(int[] generados, int numero) {
		int contador = 0;
		for (int g : generados) {

			if (numero == g) {
				contador++;
			}
		}

		return contador;

	}

	static int numeroMenos(int[]generados, int numero) {
		int [] numeros=new int [20];
		for (int g:generados) { // recorrer todo los numeros de ARRAY(100)
			if (g<numero) {    // cuando el nuemro es menor que el numero que ha introducido el usuario
				numeros[g-1]=1; // cuenta SOLO UNA VEZ. 
		
			}
		}
		int contador=0;
		for (int n:numeros) {
			contador+=n; //contador=n+contador;
		}
		return contador;
	}
}
