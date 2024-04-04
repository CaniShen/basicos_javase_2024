package principal;

import model.Ciudad;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		Ciudad ciudad=new Ciudad("prueba 1", 300000, 20.4);
		ArrayList<Ciudad> ciudades=new ArrayList<Ciudad>();
		ciudades.add(ciudad);
	}
}
		//deberes :
//		Realizar un programa para la gestión de empleados de una empresa. 
//		Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
//		al iniciar el programa, aparecerá el siguiente menú:
//		1.- Nuevo empleado
//		2.- Buscar empleado
//		3.- Eliminar empleado
//		4.- Mostrar datos de todos los empleados
//		5.- Salir
//
//		1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
//		2: Se pide el código del empleado y se muestran sus datos
//		3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
//		4.- Muestra datos de todos los empleados 
		




