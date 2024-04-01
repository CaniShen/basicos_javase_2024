package principal;

import java.util.Arrays;

public class Ejercicio_1_MuestraSeisNumeros_VersionProfe {

	public static void main(String[] args) {
		int[]generados=new int[6];
		int numero,totales=0;
		//Hay que generar un número aleatorio entre 1 y 49
		//hasta conseguir 6 diferentes
		do {
			//genero número y si no está repetido, lo guardamos
			numero=(int)(Math.random()*49+1);
			if(!repetido(generados,numero,totales)) {
				generados[totales]=numero;
				totales++;
			}
		}while(totales<6);
		Arrays.sort(generados);//ordena array de menor a mayor
		for(int n:generados) {
			System.out.print(n+",");
		}
	}
	static boolean repetido(int[] numeros, int num, int totales) { //no choque si se llama los nombres si se llaman iguales. ya que son los variables dentro de ese metodo,auqnue se llaman iguales.
		boolean resultado=false;									//tiene que ser STATIC por que el metodo main es static. y el metido main tiene que llamarle luego
		for(int i=0; i<totales;i++) {
			if (numeros[i]==num) {//repetido
				resultado=true;
				break;
			}
		}
		return resultado;
	}
		
																
		
}
