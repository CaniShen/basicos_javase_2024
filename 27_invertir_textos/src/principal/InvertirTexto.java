package principal;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		//solicita la introducción de un texto
		//y lo muestra invertido, prihibido de utilizar StringBuilder
		//sin utilizar el metodo reverse.
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce texto a invertir");
		String texto=sc.nextLine();
		System.out.println(invertir(texto));

	}
	
	static String invertir(String cad) {
		StringBuilder sb=new StringBuilder("");
		//recorremos la cadena desde  el último al primero
		//extremos el caracter, y lo añadimosa un String 
		//auxiliar
		for(int i=cad.length()-1;i>=0;i--) {
			sb.append(cad.charAt(i));
			
		}
		return sb.toString();
		
		
		
	}

}
