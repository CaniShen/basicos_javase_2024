package principal;

import java.util.ArrayList;

////Realizar una nueva versión del programa de las notas. Al iniciar el programa
//aparecerá el siguiente menú:
//1.- Nueva nota
//2.- Calcular media
//3.- Notas extremas
//4.- Ver todas
//5.- Salir 
public class NotasService {
	ArrayList<Double> notas = new ArrayList<Double>();

	public void agregarNota(double nota) {
		notas.add(nota);

	}

	public double media(ArrayList<Double> notas) {
		double media = 0;
		for (Double n : notas) {
			media += n;
		}
		return media / notas.size();
	}

	public double max() {
		Double mayor = notas.get(0);
		for (Double n : notas) {
			if (n > mayor) {
				mayor = n;
			}
		}
		return mayor;

	}

	public double min() {
		Double menor = notas.get(0);
		for (Double n : notas) {
			if (menor > n) {
				menor = n;
			}
		}
		return menor;
	}

	public double[] obtenerNotas() {
		return notas.stream().mapToDouble(i -> i).toArray();
	}

}




