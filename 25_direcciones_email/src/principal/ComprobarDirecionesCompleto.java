package principal;

public class ComprobarDirecionesCompleto {

	public static void main(String[] args) {
		String emails = """
				ttt@altran.org,\
				aaa@gmail.com,\
				bbb@tel.es,\
				ccc@gmail.es,\
				ddd@gmail.com,\
				abc@hotmail.com""";
		//mostrar cuantas direcciones de cada dominio hay 
		
		String[] direcciones=emails.split(",");
		//obtendo los dominios
		String[] doms=dominios(direcciones);
		//recorro los dominios y con cada uno llamo al segundo método
		//para que nos diga el número de veces que ese dominio aparece 
		//en el array de direcciones 
		for (String d:doms) {
			System.out.println("Apariciones del dominio "+d+": "+contarDominio(d,direcciones));
		}
	}

		//recibe array con direcciones y devuelve array de dominios -----> "es, com" 
	static String[] dominios(String[] dirs) { // Es un método de clase String con nombre de dominio,
		StringBuilder cadenaDominios=new StringBuilder("");
		//recorrer esa array de dirección
		for(String dir:dirs) {
			//saco el dominio
			//obtenemos dominio de la dirección que estamos recorriendo
			String dominio=dir.substring(dir.indexOf(".")+1, dir.length());
			if(cadenaDominios.indexOf(dominio)==-1) { //la cadena de dominios no contiene
			//if(!cadenaDominios.contains(dominio))	{
				
				//añadimos el dominio a la cadena de dominios
				//cadenaDominios=cadenaDominios+dominio+",";
				cadenaDominios.append(dominio);
				cadenaDominios.append(",");	
			}
			
		}
		cadenaDominios.delete(cadenaDominios.length()-1,cadenaDominios.length());
		//cadenaDominios=cadenaDominios.substring(0,cadenaDominios.length()-1);
		//transformamos StringBuilder en String para poder llamar a split
		//return cadenaDominios.split(",");
		return cadenaDominios.toString().split(",");
	}
	//cuenta las veces que un dominio aparece en el array de direcciones
	static int contarDominio(String dominio,String[] dirs) {
		int contador=0;
		for(String dir:dirs) {
			//si la diracción termina en el dominio recibido, incrementamos contador
			if (dir.endsWith(dominio)) {
				contador++;
			}
			
		}
		return contador;
	}
	
	
}
// programa que me muestra seis numeros aleatorios diferentes 1-49 , no se repitan, desde menor a mayor.