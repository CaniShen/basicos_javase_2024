package service;

import java.util.Collection;
import java.util.HashMap;

import model.Empleado;

public class EmpleadosService {
	//deberes :
//	Realizar un programa para la gestión de empleados de una empresa. 
//	Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
//	al iniciar el programa, aparecerá el siguiente menú:
//	1.- Nuevo empleado
//	2.- Buscar empleado
//	3.- Eliminar empleado
//	4.- Mostrar datos de todos los empleados
//	5.- Salir
//
//	1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, 
// 	se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
//	2: Se pide el código del empleado y se muestran sus datos
//	3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado que se ha borrado
//	4.- Muestra datos de todos los empleados 
	
	HashMap<Integer,Empleado>empleados=new HashMap<>();
					//ya no guarda en String sino al objeto
	
	
	public boolean agregarEmpleado (Empleado empleado) {
			if(!empleados.containsKey(empleado.getCodigo())) { //si no existe la clave, se añade empleado
				empleados.put(empleado.getCodigo(),empleado);
				return true;
			}
			return false;
		
		}

		public Empleado buscaEmpleado(int codigo) {
			
			return empleados.get(codigo);//devuelve nombre si exsite, sino devuelve null
		}
		
		public Empleado eliminarEmpleado(int codigo) {
			return empleados.remove(codigo);//devuelve nombre si existe, sino devuelve null
			
		}
		public Empleado[] todoEmpleados() {
			Collection<Empleado> todos=empleados.values();
			return todos.toArray(new Empleado[0]);
			
		}
		
	
	

}
