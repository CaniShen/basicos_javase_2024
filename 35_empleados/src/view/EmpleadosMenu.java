package view;

import java.util.Arrays;
import java.util.Scanner;

import service.EmpleadosService;

public class EmpleadosMenu {
	static EmpleadosService service = new EmpleadosService();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			// presentar menu
			// leer opción y comprobar opción elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				agregarEmpleado();
				break;
			case 2:
				buscaEmpleado();
			case 3:
				eliminarEmpleado();
				break;
			case 4:
				mostrarEmpleados();
				break;
			case 5:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 5);// mienstras no seleccione 5)
	}
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Eliminar empleado
				4.- Mostrar empleados
				5.- Salir
				
				""");			
	}
	static void agregarEmpleado() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Codigo empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado:");
		String nombre = sc.nextLine();
		if (service.agregarEmpleado(codigo, nombre)) {
			System.out.println("Añadido!");
		} else {
			System.out.println("Código ya existe, no se añado!");
		}
	}

	static void buscaEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		String nombre = service.buscaEmpleado(codigo);
		if (nombre == null) {
			System.out.println("No existe empleado");
		} else {
			System.out.println("El empleado es: " + nombre);
		}
	}
		
	static void eliminarEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		String nombre = service.eliminarEmpleado(codigo);
		if (nombre == null) {
			System.out.println("No existe empleado");
		} else {
			System.out.println("El empleado elimando es: " + nombre);
		}

	}
	static void mostrarEmpleados(){
		String[]empleados=service.todoEmpleados();
		System.out.println("Empleados: "+Arrays.toString(empleados));
	}
	
	
}

