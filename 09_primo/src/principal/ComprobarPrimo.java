package principal;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num=17;
		//indicará si el número es o o no primo
		
		boolean esPrimo=true;
		for(int i=2;i<num;i++) {
		 if(num%i==0) {
			 esPrimo=false;
		 }
		 
	}
	System.out.println("El número "+num+" es primo?"+esPrimo);
}
}
