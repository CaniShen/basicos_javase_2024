package principal;

public class Comprobar {

	public static void main(String[] args) {
			int num=9;
			//si el numero es par, nos muestra la mitad de ese numero
			//pero si es impar, muestra la mitad del anterior
			/*if (num%2==0) {
				System.out.println(num/2);
			}
			else { 
				System.out.println((num-1)/2);
			}*/
			System.out.println(num%2==0?num/2:(num-1)/2);
	}

}
