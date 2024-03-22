package principal;

public class ComprobarNota {

	public static void main(String[] args) {
				int nota=6;
				//a partir de la nota indicará si es un:
				//suspenso (entre 1y 4)
				//aprobado (5 o 6)
				//notable(7 o 8)
				//sobresaliente(9 o 10)
				
		/*		switch (nota) {
				case 1:
				case 2:
				case 3:
				case 4:
					System.out.println("Es suspenso");
					break;
				case 5:
				case 6:
					System.out.println("Es aprobado");
					break;
				case 7:
				case 8;
					System.out.println("Es notable");
					break;
				case 9:
				case 10;
					System.out.println("Es sobresaliente");
					break;
				}*/
				
				//desde java 14 se puede:
				
				
			/*	switch (nota) {
				case 1,2,3,4:
			
					System.out.println("Es suspenso");
					break;
				case 5,6:
					System.out.println("Es aprobado");
					break;
				case 7,8:
					System.out.println("Es notable");
					break;
				case 9,10:
					System.out.println("Es sobresaliente");
					break;
				}*/
				
				//desdes Java 14
				String resultado;
				resultado=switch(nota) {
						case 1,2,3,4->{int a =1; yield"Suspenso";}
						case 5,6->"Aprobado";
						case 7,8->"Notable";
						case 9,10->"Es Sobresaliente";
						default->"Nota no válida!";
				};
				System.out.println(resultado);
			
			
				

	}

}
