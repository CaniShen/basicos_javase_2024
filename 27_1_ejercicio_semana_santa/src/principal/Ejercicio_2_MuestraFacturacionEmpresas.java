package principal;

public class Ejercicio_2_MuestraFacturacionEmpresas {

	public static void main(String[] args) {
		//String facturación="Ventas-20800,administración-17900,informatica-35000,RRHH-10350",
		//El programa mostrará:
		//Nombre del departamento que más a faturado Nombres de todos los deparatamentos,
		//ordenados de menos a más facturación.
		String facturación="Ventas-20800,administración-17900,informatica-35000,RRHH-10350";
		//Primero tengo que seb
		String[] depr=facturación.split("[,]");
		for(String d:depr) {
			
			System.out.print(d.substring(0, d.indexOf("-")));
		}
		
		
	}

}
