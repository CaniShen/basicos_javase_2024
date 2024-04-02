package principal;

import java.util.Arrays;

public class Panel {

	public static void main(String[] args) {
		final int FILAS = 5;
		final int COLUMNAS = 5;
		int[][] panel = new int[FILAS][COLUMNAS];
		int premios = 0;
		int fila, columna;
		do {
			fila = (int) (Math.random() * (FILAS));
			columna = (int) (Math.random() * (COLUMNAS));
			if (panel[fila][columna] != 1) {// si no está ocupada, la ocupamos
				panel[fila][columna] = 1;
				premios++;

			}
		} while (premios < 5);
		mostrarPanel(panel);
	}

	static void mostrarPanel(int[][] panel) {
		for (int i = 0; i < panel.length; i++) {
			for (int j = 0; j < panel[i].length; j++) {
				System.out.print(panel[i][j] + "|");
			}
			System.out.println();
		}

	}
}
	//Ejercicio voluntario.
//Realizar un programa que genere 100 números aleatorios entre 1 y 20 y los guarde en un array.
//Después, el programa solicita al usuario la intraoducción de un número entre 1 y 20.
//A continuación el programa nos mostrará los siguientes datos:
//-Número de veces que el número solicitado aparece en el array 
//-Total de números que hay en el array (sin contar duplicados) que sean más pequeños que el número solicitado 

