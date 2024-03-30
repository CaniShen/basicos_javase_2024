package principal;

import java.util.Arrays;
import java.util.Random;
	
public class Ejercicio_1_MuestraSeisNumeros {

	public static void main(String[] args) {
		// Muestra 6 números aleatorios, no repetidos,
		// 1 y 49,ordenardos de menor a mayor
		// Random num= new Random();// crear una nueva instancia de la clase'Random'
		// int numAle= num.nextInt(); //generar un número entero aleatorio
		int[] numAleatorios = new int[6];
		int i = 0; 
		while (i < 6) {
			int numAle;
			boolean repetido = false;
		
			numAle = (int) (Math.random() * 49 + 1);
			for (int j=0;j<i;j++) {
				if(numAleatorios[j]==numAle) {
					repetido=true;
					
					
				}
				
			}
			if (!repetido) {
				numAleatorios[i]=numAle;
				i++;
			
			}
		}
		//Ahora podemos imprimir los números aleatorios.
		Arrays.sort(numAleatorios);
		for (int numAleatorio:numAleatorios) {
			
			System.out.println(numAleatorio);
		}
		
}

}
