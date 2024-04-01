package principal;

public class Ejercicio_2_MuestraFacturacionEmpresas {

	public static void main(String[] args) {
		// String
		// facturación="Ventas-20800,administración-17900,informatica-35000,RRHH-10350",
		// El programa mostrará:
		// Nombre del departamento que más a faturado Nombres de todos los
		// deparatamentos,
		// ordenados de menos a más facturación.
		String facturación = "Ventas-20800,administración-17900,informatica-35000,RRHH-10350";
		// Primero tengo que seb
		String[] depr = facturación.split(",");
		String[] departamentos = new String[depr.length];
		int[] facturas = new int[depr.length];
		int i = 0;
		for (String d : depr) {

			departamentos[i] = d.substring(0, d.indexOf("-"));

			facturas[i] = Integer.parseInt(d.substring(d.indexOf("-") + 1, d.length()));
			i++;
		}
//		for (String departamento : departamentos) {
//			System.out.println(departamento);
//
//		}
//		for (int factura : facturas) {
//			System.out.println(factura);
//		}
		for (int j = 0; j < facturas.length; j++) {
			for (int k = 0; k < j; k++) {
				if (facturas[j] < facturas[k]) {
					int aux = facturas[k];
					facturas[k] = facturas[j];
					facturas[j] = aux;
					String aux1 = departamentos[k];
					departamentos[k] = departamentos[j];
					departamentos[j] = aux1;

				}

			}
		}
		System.out.println("El departamento más facturado es: " + departamentos[departamentos.length - 1]);

		System.out.println("Siguientes son los departamentos que han facturados de menor a mayor: ");
		for (String departamento : departamentos) {
			System.out.print(departamento + ",");

		}

	}

}
	
		

