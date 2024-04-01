package principal;

public class ComprobarDepartamentos {

	public static void main(String[] args) {
		String facturacion = "Ventas-20800,administración-17900,informatica-35000,RRHH-10350";
		String[]datos=facturacion.split(",");
		ordenarFacturacion(datos);
		//Nombre del departamento que más a faturado
		System.out.println(datos[datos.length-1].split("-")[0]);
		//Nombres de todos los deparatamentos,ordenados de menos a más facturación.
		for (String n:datos) {
			System.out.println(n.split("-")[0]);
		}
		
	}
	static void ordenarFacturacion(String[] datos) {
		String aux;
		for (int i=0;i<datos.length;i++) {
			for(int j=i+1;j<datos.length;j++) {
				//la comparación se debe realizar en base a los números
				int numeroI=Integer.parseInt(datos[i].split("-")[1]);
				int numeroJ=Integer.parseInt(datos[j].split("-")[1]);
				if (numeroJ<numeroI) {
					//intercambiamos posiciones j e i.
					aux=datos[i];
					datos[i]=datos[j];
					datos[j]=aux;
				}
			}
		}
	}

}
