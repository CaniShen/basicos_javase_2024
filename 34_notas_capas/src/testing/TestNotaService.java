package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.NotasService;


class TestNotaService {
	//
	static NotasService service= new NotasService();
	@BeforeAll ///ANOTACIONES--INDICACIONES meta datos.información
	static void setUpBeforeClass() throws Exception {
		//añadimos unas cuantas notas de prueba 
		service.agregarNota(5);
		service.agregarNota(8);
		service.agregarNota(1);
		service.agregarNota(6);
	}
	

	@Test
	void testMedia() {
		assertEquals(5.0, service.media());
	}

	@Test
	void testMax() {
		assertEquals(8.0, service.max());
	}

	@Test
	void testMin() {
		assertEquals(1.0, service.min());
	}

	@Test
	void testObtenerNotas() {
		assertEquals(4, service.obtenerNotas().length);
		assertArrayEquals(new Double[] {5.0,8.0,1.0,6.0},service.obtenerNotas());
	}

}
