package view;

import java.util.Arrays;
import java.util.Scanner;

import model.Empleado;
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

//		Empleado emp=new Empleado();
//		System.out.println("Codigo empleado:");
//		emp.setCodigo(Integer.parseInt(sc.nextLine()));
//		System.out.println("nombre empleado:");
//		emp.setCodigo(Integer.parseInt(sc.nextLine()));
//		System.out.println("edad empleado:");
//		emp.setCodigo(Integer.parseInt(sc.nextLine()));
//		System.out.println("Codigo empleado:");
//		emp.setCodigo(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Codigo empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado:");
		String nombre = sc.nextLine();
		System.out.println("Edad empleado:");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("E-mail empleado:");
		String email = sc.nextLine();
		
		Empleado emp=new Empleado(codigo, nombre, email, edad);
		
		
		
		if (service.agregarEmpleado(emp)) {
			System.out.println("Añadido!");
		} else {
			System.out.println("Código ya existe, no se añado!");
		}
	}

	static void buscaEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		Empleado emp = service.buscaEmpleado(codigo);
		if (emp == null) {
			System.out.println("No existe empleado");
		} else {
			System.out.println("El empleado es: " + emp.getNombre());
		}
	}
		
	static void eliminarEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo = Integer.parseInt(sc.nextLine());
		Empleado emp = service.eliminarEmpleado(codigo);
		if (emp == null) {
			System.out.println("No existe empleado");
		} else {
			System.out.println("El empleado elimando es: " + emp.getNombre());
		}

	}
	static void mostrarEmpleados(){
		Empleado[]empleados=service.todoEmpleados();
//		System.out.println("Empleados: "+Arrays.toString(empleados));
		for(Empleado e:empleados) {
			System.out.println("Nombre: "+e.getNombre()+" Edad:"+e.getEdad());
		}
	}
	
	
}

