package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;

import model.Empleado;
import utilidades.Util;

public class EmpleadosService {
	String fichero = "empleados.csv"; // atributo de EmpleadoService

	public void borrarEmpleados() {
		File file = new File(fichero);
		file.delete();

	}

	HashMap<Integer, Empleado> empleados = new HashMap<>(); // atributo de EmpleadoService
	// ya no guarda en String sino al objeto

	public void cargarEmpleados() { // método para cargar los empleados guardados en el fichero,
		String linea;
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {

			while ((linea = bf.readLine()) != null) {
				Empleado p = Util.convertirCadenaAEmpleado(linea);
				empleados.put(p.getCodigo(), p); // guardamos los datos del fichero en el atributo empleados de tipo
													// HashMap.
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public boolean agregarEmpleado(Empleado empleado) {
		try (FileOutputStream fos = new FileOutputStream(fichero, true); PrintStream out = new PrintStream(fos);) {
			if (!empleados.containsKey(empleado.getCodigo())) { // si no existe la clave, se añade empleado
				empleados.put(empleado.getCodigo(), empleado);
				out.println(Util.convertirEmpleadoACadena(empleado));
				return true;
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public Empleado buscaEmpleado(int codigo) {
		String linea;
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {
			while ((linea = bf.readLine()) != null) {
				if (Util.convertirCadenaAEmpleado(linea).getCodigo() == codigo) {
					return Util.convertirCadenaAEmpleado(linea);
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Empleado eliminarEmpleado(int codigo) {
		Empleado empleado = empleados.get(codigo); //buscamos el empleado a borrar.
		if (empleado != null) {							// si existe el empleado seguimos...
			borrarEmpleados();							// borrarmos fichero,
			empleados.remove(codigo);					// eliminamos el empleado del HashMap
			Collection<Empleado> colleccion = empleados.values(); // Convertimos el HashMap en un objeto iterable, para usarlo en el forEach
			for (Empleado e : colleccion) { // Nos recorremos todos los empleados.
				try (FileOutputStream fos = new FileOutputStream(fichero, true);
						PrintStream out = new PrintStream(fos);) {
						out.println(Util.convertirEmpleadoACadena(e)); //Insertamos los datos de los empleados en el fichero.
				} catch (FileNotFoundException ex) {
					ex.printStackTrace();
				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		}

		return empleado;

	}

	public Empleado[] todoEmpleados() {
		Collection<Empleado> todos = empleados.values();
		return todos.toArray(new Empleado[0]);

	}

}
