package principal;

public class ContarVocales {

	public static void main(String[] args) {
		String cad="Esto es un texto nuevo";
		//¿cuantas vocales tiene ese texto?
		//char []vocales= {'a','e','i','o','u'};
		int vocales=0;
		cad=cad.toLowerCase();
		for(int i=0; i<cad.length();i++) {
			
			switch(cad.charAt(i)) {
			case 'a','e','i','o','u':
				vocales++;
			}
			
		}
		System.out.println("Total vocales: "+vocales);
	
}
}
