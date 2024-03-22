package principal;

public class SumaHastaMil {

	public static void main(String[] args) {
			//¿hasta que número tengo que sumar, emplezando por 1,
			//para llegar a 1000?
		
			int resultado=0;
			int contador=1;
			
			do {
				
				resultado+= contador;//resultado=resultado+contador//resulNWE=0+1=1
				contador++;
			}
			while (resultado<1000);
			
			System.out.println("Para llegar a mil he tenido que sumar hasta "+contador);
			System.out.println(resultado);
	}
		
}
