package principal;

import java.util.Scanner;

public class ContarMultiplos {

	public static void main(String[] args) {
		//hacer un programa que solicite dos números 
		//y nos diga cuantos múltiplos de 5
		//hay entre ambos números
		//y nos diga cuantos múltiplos de 5
		//hay entre ambos números
		//Si alguno de los numeros es negativo, se vuelve
		//a pedir
		Scanner sc = new Scanner(System.in);
		int n1, n2, mayor, menor;
		int contador = 0;
		do {
			System.out.println("Introduce un número");
			n1 = sc.nextInt();
		}while(n1<0);
		do {
			System.out.println("Introduce otro número");
			n2 = sc.nextInt();
		}while(n2<0);
		
		
		
		
		
		menor = n1 > n2 ? n2 : n1;
		mayor = n1 > n2 ? n1 : n2;
		for (int i = menor; i <= mayor; i++) {
			if (i % 5 == 0) { // condición para ser múltiplo de 5
				contador++;
			}
		}
		System.out.println("total de múltiplos de 5: " + contador);

	}

}		
		/*int num1;
		//leemos el número por teclado
		Scanner sc1=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num1=sc1.nextInt();
		
		int num2;
		Scanner sc2=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num2=sc2.nextInt();*/
		
	/*	int menor,mayor;
		if (num1<num2) {
			menor=num1;
			mayor=num2;
		}
		boolean esMultiplos5=true;
		for(int i=num1;i<num2;i++) {
		 if(i%5==0) {
			 esMultiplos5=true;
		 }
		 System.out.println(i);
	}*/
	

