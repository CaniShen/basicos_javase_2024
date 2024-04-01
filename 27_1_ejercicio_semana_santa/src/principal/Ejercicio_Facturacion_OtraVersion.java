package principal;

public class Ejercicio_Facturacion_OtraVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String facturacion="ventas-20800,administracion-17900,informatica-35000,RRHH-10350";
		
		String[] departamentosFacturaciones = facturacion.split(",");
		
		String[] departamentos = separarDepartamentos(departamentosFacturaciones);
		double[] facturaciones = separarFacturaciones(departamentosFacturaciones);
		ordenarPorFacturacion(departamentos, facturaciones);
		for(int i = 0; i < departamentos.length; i++) {
			System.out.println("El departamento " + departamentos[i] + " su facturacion es: " + facturaciones[i]);
		}
	}
	
	static String[] separarDepartamentos(String[] departamentosFacturaciones) {
		String[] departamentos = new String[departamentosFacturaciones.length];
		int i = 0;
		for(String departamentoFacturacion: departamentosFacturaciones) {
			departamentos[i] = departamentoFacturacion.substring(0, departamentoFacturacion.indexOf("-"));
			i++;
		}
		return departamentos;
	}
	
	static double[] separarFacturaciones(String[] departamentosFacturaciones) {
		double[] facturaciones = new double[departamentosFacturaciones.length];
		int i = 0;
		for(String departamentoFacturacion: departamentosFacturaciones) {
			facturaciones[i] = Double.parseDouble(departamentoFacturacion.substring(departamentoFacturacion.indexOf("-")+1, departamentoFacturacion.length()));
			i++;
		}
		return facturaciones;
	}
	
	static void ordenarPorFacturacion(String[] departamentos, double[] facturaciones) {
		int n = facturaciones.length;
		for(int i = 0; i< n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(facturaciones[j] > facturaciones[j+1]) {
					double tempFact = facturaciones[j];
					facturaciones[j] = facturaciones[j+1];
					facturaciones[j+1] = tempFact;
					
					String tempDep = departamentos[j];
					departamentos[j] = departamentos[j+1];
					departamentos[j+1] = tempDep;
				}
			}
			
		}
	}

}
