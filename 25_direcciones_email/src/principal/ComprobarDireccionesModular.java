package principal;

public class ComprobarDireccionesModular {

	public static void main(String[] args) {
		String emails = """
				aaa@gmail.com,\
				bbb@tel.es,\
				ccc@gmail.es,\
				ddd@gmail.com,\
				abc@hotmail.com\
				""""
		// indicar cuantas direcciones hay de cada dominio

		int contEs = 0; int conCom = 0; //Declrar y iniciar los variables que queremos saber.

		String[] direcciones = emails.split(",");// Declrar un array y inicialr 
		contEs=contarDominio("es",direcciones); //llamado a metodo se asigna,y 
		
		conCom=contarDominio("com",direcciones);// esta parte se puede ahorrar.
		System.out.println("Direcciones '.es'"+contarDominio("es",direcciones));
		System.out.println("Direcciones '.com'"+contarDominio("com",direcciones));
	}
	
	static int contarDominio(String dominio,String[] dirs) {
		int contador=0;
		for(String dir:dirs) {
			//si la dirección termina en el dominio recibido, incremento contador 
			if (dir.endsWith(dominio)) {
				contador++;
			}
		}
		return contador;
		
	}

}
