package principal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Prueba3 {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.of(2023, 11, 4);
		LocalDate f2=LocalDate.of(2024, 3, 7);
		Period p=Period.between(f1, f2);
		System.out.println(p);
		System.out.println("Meses: "+p.getMonths());
		System.out.println("Días: "+p.getDays());
		long dias1=ChronoUnit.DAYS.between(f1, f2);
			
		System.out.println("Total días primer periodo: "+ dias1);
		
		//////
		LocalDate f3=LocalDate.of(2023, 4, 4);
		LocalDate f4=LocalDate.of(2023, 8, 7);
		Period p2=Period.between(f3, f4);
		System.out.println(p);
		System.out.println("Meses: "+p2.getMonths());
		System.out.println("Días: "+p2.getDays());
		long dias2=ChronoUnit.DAYS.between(f3, f4);
		System.out.println("Total días primer periodo: "+ dias2);
	}

}

//Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
//Se presenta el siguiente menú:
//1.- Nuevo pedido
//2.- Pedido más reciente
//3.- Pedidos entre dos fechas
//4.- Pedido proximo a fecha
//5.- Salir
//
//2: Muestra los datos del pedido más reciente
//3: Se solicitan dos fechas, y se muestran los pedidos realizados
//en ese rango de fechas 
//4: Se solicita una fecha y nos muestra el pedido más cercano a dicha fecha
//HACER EN EL MISMO PROYECTO NUMERO 42, LOS METODOS