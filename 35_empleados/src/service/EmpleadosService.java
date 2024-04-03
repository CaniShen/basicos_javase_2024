package service;

import java.util.Collection;
import java.util.HashMap;

public class EmpleadosService {
//	Realizar un programa para la gestión de empleados de una empresa. Un empleado se caracteriza por un nombre(	VALOR) y 
//	tiene asociado un código(CLAVE) de empleado.
//	al iniciar el programa, aparecerá el siguiente menú:
//	1.- Nuevo empleado
//	2.- Buscar empleado
//	3.- Eliminar empleado
//	4.- Mostrar nombres de todos los empleados
//	5.- Salir
//
//	1: Se pide el nombre y código del empleado. Si no existe empleado con ese código(hay que crear un variable que aumenta), se guarda, (-----)ag
//	pero si el código ya existe, no se guarda y se muestra advertencia al usuario
//	2: Se pide el código del empleado y se muestra su nombre
//	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
//	4.- Muestra nombres de todos los empleados 
	
	HashMap<Integer,String>empleados=new HashMap<Integer,String>();
	
	
		public boolean agregarEmpleado(int codigo, String nombre) {
			if(!empleados.containsKey(codigo)) { //si no existe la clave, se añade empleado
				empleados.put(codigo,nombre);
				return true;
			}
			return false;
		
		}
			
		public String buscaEmpleado(int codigo) {
			
			return empleados.get(codigo);//devuelve nombre si exsite, sino devuelve null
		}
		
		public String eliminarEmpleado(int codigo) {
			return empleados.remove(codigo);
			
		}
		public String[] todoEmpleados() {
			Collection<String> todos=empleados.values();
			return todos.toArray(new String[0]);
			
		}
		
	
	

}
