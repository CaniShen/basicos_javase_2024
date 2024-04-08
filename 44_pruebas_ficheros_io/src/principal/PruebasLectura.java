package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PruebasLectura {

	public static void main(String[] args) {
		String ruta = "dias.txt";//iniciar el variable ruta,
		try (FileReader fr = new FileReader(ruta); //Intermediario//leer desde el fichero, crear el objeto FileReader
				BufferedReader bf = new BufferedReader(fr);) {
//			System.out.println(bf.readLine());
//			System.out.println(bf.readLine());
			// no hay un metodo que nos diga cuantas lineas hay PERO
			// Cuando es null quiere decir que ya no hay nada.
//			String linea = bf.readLine();
//			while (linea != null) {
//				System.out.println(linea);
//				linea = bf.readLine();
//			}
			String linea;
			while((linea=bf.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

}
