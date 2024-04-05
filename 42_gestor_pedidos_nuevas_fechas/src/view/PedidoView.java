package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import model.Pedido;
import service.PedidoService;

public class PedidoView {
	static PedidoService service=new PedidoService();

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			// presentar menu
			// leer opción y comprobar opción elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				nuevoPedido();
				break;
			case 2:
				pedidoMasReciente();
			case 3:
				pedidoEntreFechas();
				break;
			case 4:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida");

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

	static void nuevoPedido() throws ParseException {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		PedidoService service = new PedidoService();

		System.out.println("Producto: ");
		String producto = sc.nextLine();
		System.out.println("Unidades");
		int unidades = Integer.parseInt(sc.nextLine());
		System.out.println("Fecha pedido(dia/mes/año):");
		LocalDate fecha = LocalDate.parse(sc.nextLine(),sdf);
		Pedido p = new Pedido(producto, unidades, fecha);
		service.nuevoPedido(p);

	}

	static void pedidoMasReciente() {
		Pedido p = service.pedidoMasReciente();
		DateTimeFormatter sdf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Producto: " + p.getProducto() + " ");
		System.out.println("Unidades: " + p.getUnidades() + " ");
		System.out.println("Fecha pedido: " + sdf.format(p.getFechaPedido()) + " ");

	}

	static void pedidoEntreFechas() throws ParseException {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha inicio (dia/mes/año):");
		LocalDate fecha1 = LocalDate.parse(sc.nextLine(),sdf);
		System.out.println("Fecha límite (día/mes/año):");
		LocalDate fecha2=LocalDate.parse(sc.nextLine(),sdf);	
		ArrayList<Pedido> pedidosEncontrados=service.pedidoEntreFechas(fecha1, fecha2);
		for (Pedido p : pedidosEncontrados) {
			System.out.print("Producto: " + p.getProducto() + " ");
			System.out.print("Unidades: " + p.getUnidades() + " ");
			System.out.println("Fecha pedido: " + sdf.format(p.getFechaPedido()) + " ");
		}
	}
}
