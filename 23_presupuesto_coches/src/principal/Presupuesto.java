package principal;

import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		// dado los datos de coches, se le pedirá
		// al cliente cual es su presupuesto y programa indicará
		// los coches que puede optar
		var coches = new String []{"volvo-19_500", "Audi A1-23_450","Toyota-17_300", "Bmw-33_500", "Mercedes-25_340", "Mini-41_800" };
		
		int n=Integer.parseInt("100");	//而用INTEGER 这个CLASE 和PARSEINT 这个METODO 就可以实现				
		//int n=(int)"100"; 不能从String 变为数字ENTERO
		
		int contador = 0;
		
		//var contador=0;
		Scanner sc = new Scanner(System.in);
		double presupuesto;
		System.out.println("¿Introduzca su presupuesto?");
		presupuesto = sc.nextDouble();
		
	// for(var precio:precios)
		for (var coche : coches) {
			coche=coche.replace("_",""); //记住String 的Inmutable 的属性 必须要写coche=coche.replace(); 如果只写coche.replace()， REPLACE DE 作用发挥不了
			int pos=coche.indexOf("-");//posición del separador, int posicionQuion=coche.indexOf("-");
			String marca=coche.substring(0, pos);//nombreCoche=precio.substring(0,posicionQuion);这个是自己之前尝试做的 差TIPO de datos
			double precio=Double.parseDouble(coche.substring(pos+1,coche.length()));
			System.out.println("Te puedes comprar un "+ marca);
			
			}
		

		}
		
	}


