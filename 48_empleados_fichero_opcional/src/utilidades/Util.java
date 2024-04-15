package utilidades;



import model.Empleado;


public class Util {
	public static Empleado convertirCadenaAEmpleado(String linea) {
		String[] datos=linea.split(",");
		return new Empleado(Integer.parseInt(datos[0]),
			(datos[1]),
			(datos[2]),
			Integer.parseInt(datos[3])
			);
		
		
	}
	public static String convertirEmpleadoACadena(Empleado empleado) {
		return empleado.getCodigo()+","+empleado.getNombre()+","+empleado.getEmail()+","+empleado.getEdad();
		
		
	}
}
