package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import model.Pedido;
import service.PedidoService;


class TestPedidoService {
	static PedidoService service=new PedidoService();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		LocalDate f1=LocalDate.of(2023,11,30);		
		LocalDate f2=LocalDate.of(2022,10,1);
	
		service.nuevoPedido(new Pedido("coca cola",5,f1));
		service.nuevoPedido(new Pedido("pienzo perro",2, f2));
	}

	@Test
	void testmuestraPedidoCercaFecha() {

		assertEquals("coca cola",service.muestraPedidoCercaFecha(LocalDate.of(2023,12,7)).getProducto());
		assertEquals("pienzo perro",service.muestraPedidoCercaFecha(LocalDate.of(2022,8,7)).getProducto());
		
	}

}
