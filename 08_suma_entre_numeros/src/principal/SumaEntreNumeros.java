package principal;
import static java.lang.Math.*;
public class SumaEntreNumeros {

	public static void main(String[] args) {
		int n1=20;
		int n2=11;
		//calcular la suma de todo los números comprendidos 
		//entre el mayor y el menor, no incluidos
		//los extremos
		
		int menor,mayor;
		int suma=0;
		/*if (n1<n2) {
			menor=n1;
			mayor=n2;
		}else {
			menor=n2;
			mayor=n1;
			
		}*/
		menor=Math.min(n1, n2);
		mayor=Math.max(n1, n2);
		for (int i=menor+1;i<mayor;i++) {
				suma+=i;//suma=suma+i;

	}
		System.out.println(suma);

}
}