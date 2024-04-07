package testing;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Ciudad;
import service.ServiceCiudades;

class TestServiceCiudades {

	static ServiceCiudades service=new ServiceCiudades();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		service.agregaCiudad(new Ciudad("Madrid",3332035,"Espania"));
		service.agregaCiudad(new Ciudad("Sevilla",681998,"Espania"));
		service.agregaCiudad(new Ciudad("Madrid",85090,"Colombia"));
		service.agregaCiudad(new Ciudad("Madrid",85090,"Espania"));
		
		
	}


	@Test
	void testmostrarCiudadMasPoblada() {
		assertEquals("Madrid",service.mostrarCiudadMasPoblada().getNombre());
	}
	@Test
	void testbuscarPorPais() {
		String pais1 ="Colombia";
		Ciudad ciudad1=new Ciudad("Madrid",85090,"Colombia");
		HashSet<Ciudad> ciudades=new HashSet<>();
		ciudades.add(ciudad1);
		assertEquals(ciudades.toString(),service.buscarPorPais(pais1).toString());///hay que repasarlo por aqui...

		
		
	}

}
