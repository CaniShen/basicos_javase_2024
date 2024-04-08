package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) {
		// String ruta="C:\\temp\\disa.txt";
		String ruta = "dias.txt";
//		FileOutputStream = null;
//		PrintStream = null;
//		try {
//			fos = new FileOutputStream(ruta, true);// false es sobreescriba
//			out = new PrintStream(fos);// PritStream es un objeto, un construcdor
//			out.println("viernes");
//			out.println("sábado");
//			out.println("miércoles");
//
//			System.out.println("Intormación almacenada en el fichero");
//
//		} 
//		catch (FileNotFoundException ex) {
//			ex.printStackTrace();// son unos errores que me obliga a captar,
//									// en este caso es no existe la ruta,
//									// no es que no existe el fichero
//		}
//
//		catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		// que no garandiza que esta introcción seguro que va a ejecutar
//		finally {
//			try {
//				if (fos != null) {
//					fos.close();
//				}
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//			if (out != null) {
//				out.close(); // cierre el objeto para que no se gasta el recurso(RAM)
//			}
//		}*/
		//con try con recursos
		try(FileOutputStream fos=new FileOutputStream(ruta,true); 
				PrintStream out= new PrintStream(fos);){
			out.println("viernes");
			out.println("sábado");
			out.println("miércoles");
			System.out.println("Información almacenada en el fichero");
		}
		catch(FileNotFoundException ex)  {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
