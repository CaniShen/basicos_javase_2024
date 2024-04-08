package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {
		//String ruta="C:\\temp\\disa.txt";
		String ruta="dias.txt";
		try {
			PrintStream out=new PrintStream(ruta);// PritStream es un objeto, un construcdor
			out.println("viernes");
			out.println("sábado");
			out.println("domingo");
			out.println("jueves");
			System.out.println("Intormación almacenada en el fichero");
			out.close();//cierre el objeto para que no se gasta el recurso(RAM)
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();//son unos errores que me obliga a captar,
									// en este caso es no existe la ruta, 
									//no es que no existe el fichero
		}
	
				
	}

}
