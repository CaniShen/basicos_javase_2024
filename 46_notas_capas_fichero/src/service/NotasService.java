package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

////Realizar una nueva versión del programa de las notas. Al iniciar el programa
//aparecerá el siguiente menú:
//1.- Nueva nota
//2.- Calcular media
//3.- Notas extremas
//4.- Ver todas
//5.- Salir 
public class NotasService {

	String fichero = "notas.txt";
	public void borrarNotas()	{
		File file=new File(fichero);
		file.delete();
		
	}
	

	public void agregarNota(double nota) {

		try (FileOutputStream fos = new FileOutputStream(fichero, true); 
				PrintStream out = new PrintStream(fos);) {
			out.println(nota);
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}

	}

	public double media() {
		String linea;
		double media = 0;
		int contador = 0;

		try (FileReader fr = new FileReader(fichero); // Intermediario//leer desde el fichero, crear el objeto
														// FileReader
				BufferedReader bf = new BufferedReader(fr);) {

			while ((linea = bf.readLine()) != null) {
				media += Double.parseDouble(linea);
				contador++;
			}

		} catch (IOException ex) {
			ex.printStackTrace();

		}
		return contador > 0 ? media / contador : 0;
	}

	public double max() {
		double max = Double.MIN_VALUE;
		String linea;

		try (FileReader fr = new FileReader(fichero); // Intermediario//leer desde el fichero, crear el objeto
														// FileReader
				BufferedReader bf = new BufferedReader(fr);) {
			// mientras haya una nota que leer
			while ((linea = bf.readLine()) != null) {
				if (Double.parseDouble(linea) > max) {
					max = Double.parseDouble(linea);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
		return max;

	}

	public double min() {
		double min = Double.MAX_VALUE;

		String linea;
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {
			// mientras haya una nota que leer
			while ((linea = bf.readLine()) != null) {

				if (Double.parseDouble(linea) < min) {
					min = Double.parseDouble(linea);
				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return min;

	}

	public ArrayList<Double> obtenerNotas() {

		ArrayList<Double> aux = new ArrayList<Double>();
		String linea;
		try (FileReader fr = new FileReader(fichero); 
				BufferedReader bf = new BufferedReader(fr);) {
			// mientras haya una nota que leer
			while ((linea = bf.readLine()) != null) {

				aux.add(Double.parseDouble(linea));
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return aux;
	}
}
