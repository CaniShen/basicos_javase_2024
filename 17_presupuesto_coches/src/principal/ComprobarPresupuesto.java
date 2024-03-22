package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {
	//varm=10; para los variables atributos no puede usarlo!!!
	public static void main(String[] args) {
		//var x=2,d=10;//no
		// dado una serie de precios de coches, se le pedirá
		// al cliente cual es su presupuesto y programa indicará
		// a cuantos puede optar
		
		//var x=2,d=10; NO SE USA VA en una variable compuesto.
		double[] precios = { 19_500.0, 23_450, 17_300, 33_500, 25_340, 41_800 };
		//var precios= new double[] {19_500.0, 23_450, 17_300, 33_500, 25_340, 41_800 };
		int contador = 0;
		//var contador=0;
		Scanner sc = new Scanner(System.in);
		double presupuesto;
		System.out.println("¿Introduzca su presupuesto?");
		presupuesto = sc.nextDouble();
		
	// for(var precio:precios)
		for (double precio : precios) {
			if (presupuesto >= precio) {
				contador++;
			}

		}
		System.out.println("Tienes presupuesto para " + contador + " posible coches");
		sc.close();
	}
		
		
	}


