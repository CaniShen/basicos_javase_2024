package principal;

public class BloquesTexto {

	public static void main(String[] args) {		
		String tutorial="El lenguaje \"html\":\n Se emplea para formatear, las etiquetas tienen la forma <etiqueta>";
		// ---> salto la línea
		//lo de abajo no es un salto de la línea
		String bloqueTutorial="""    
				El lenguaje"html": 
				Se emplea para formatear,
				las etiquetas tienen la forma <etiqueta>"""; // dos saltos de líneas
		System.out.println(bloqueTutorial);
		System.out.println(tutorial);
	}

}
