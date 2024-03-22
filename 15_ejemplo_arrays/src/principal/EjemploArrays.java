package principal;

public class EjemploArrays {

	public static void main(String[] args) {
			int[] notas= {3,8,5,4,9,};
			//haz un programa que sume un puntoa cada alumno
			// y luego nos muestre todas las notas
			/*notas[0]++;
			notas[1]++;
			for(int i=0;i<notas.length;i++) {
				notas[i]++;
				
			}
			for(int i=0;i<notas.length;i++) {
				System.out.println(notas[i]);
			}*/
			
			for(int nota:notas) {
				System.out.println(nota);
			}
			
	}

}
