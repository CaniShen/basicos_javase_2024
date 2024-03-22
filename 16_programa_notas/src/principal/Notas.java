package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		//realizar un programa que solicite, una a una, la introducción
		//de seis notas (double) que será guardadas en un array
		//tras ello, el programa mostrará los siguientes datos:
		//-Notas media
		//-Notas más alta
		//-Aprobados (cada nota que sea un aprobado)
		
		
		double []notas=new double[6];
		Scanner sc= new Scanner(System.in);
		double media=0;
		double notaAlta=0;
		
		
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce tu nota");
			notas[i]=sc.nextDouble();
		}
		//media y nota más alta
		for (double nota: notas) {
			media+=nota;
			//si encuentro una nota más alta que el máximo actual
			//actualizo ese máximo
			if (nota>notaAlta) {
				notaAlta=nota;
			}
		}
		System.out.println("Nota media: "+media/notas.length);
		System.out.println("Nota más alta: "+notaAlta);
		
		sc.close();
		 
				
		
		
	/*	double []notas= {};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota");		
		notas=sc.nextInt();
		for(;6>notas>=5;) {
			System.out.println("Aprobados");
			
		}
		
		
			}*/
		
		
		
		
		
		
			
		
		

	}
}


