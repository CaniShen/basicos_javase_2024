package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import curso.io.LectorTeclado;
import model.Pedido;
import service.PedidoService;

public class PedidoView {
	static PedidoService service=new PedidoService();

	public static void main(String[] args)  {
		LectorTeclado lector=new LectorTeclado();
		int opcion=0;
		do {
			// presentar menu
			// leer opción y comprobar opción elegida
			presentarMenu();
			
			try {
				opcion=lector.readInt();	//opcion = sc.nextInt();//trata de hacer siempre con parseInt(sc.nextLine())
				switch (opcion) {
				case 1:
					nuevoPedido();
					break;
				case 2:
					pedidoMasReciente();
					
					break;
				case 3:
					pedidoEntreFechas();
					break;
				case 4:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no válida");
				}
			}//end try
			catch(NumberFormatException ex){
				System.out.println("debe ser un valor numerico");
			}

		} while (opcion != 4);// mienstras no seleccione 4)
				
}

	static void presentarMenu() {
		System.out.println("""
				1.- Nuevo pedido
				2.- Pedido más reciente
				3.- Pedidos entre dos fechas
				4.- Salir

				""");

	}

	static void nuevoPedido() {
			LectorTeclado lector = new LectorTeclado();
			DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("Producto: ");
			String producto = lector.readString();
			System.out.println("Unidades");
			int unidades=lector.readInt();
			System.out.println("Fecha pedido(dia/mes/año):");
			LocalDate fecha = LocalDate.parse(lector.readString(),sdf);
			Pedido p = new Pedido(producto, unidades, fecha);
			service.nuevoPedido(p);
		

	}
	

	static void pedidoMasReciente() {
		Pedido p = service.pedidoMasReciente();
		DateTimeFormatter sdf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Producto: " + p.Producto() + " ");
		System.out.print("Unidades: " + p.Unidades() + " ");
		System.out.println("Fecha pedido: " + p.FechaPedido().format(sdf) + " ");

	}

	static void pedidoEntreFechas() {
		LectorTeclado lector = new LectorTeclado();
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha inicio (dia/mes/año):");
		LocalDate fecha1 = LocalDate.parse(lector.readString(),sdf);
		System.out.println("Fecha límite (día/mes/año):");
		LocalDate fecha2=LocalDate.parse(lector.readString(),sdf);	
		ArrayList<Pedido> pedidosEncontrados=service.pedidoEntreFechas(fecha1, fecha2);
		for (Pedido p : pedidosEncontrados) {
			System.out.print("Producto: " + p.Producto() + " ");
			System.out.print("Unidades: " + p.Unidades() + " ");
			System.out.println("Fecha pedido: " + sdf.format(p.FechaPedido()) + " ");
		}
	}
}
