package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidoService;

class TestPedidoService {
	static PedidoService service=new PedidoService();
	static Calendar calender=Calendar.getInstance();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calender.set(2023,11,30);
		Date f1=calender.getTime();
		calender.set(2022,4,11);
		Date f2=calender.getTime();
		calender.set(2022,10,1);
		Date f3=calender.getTime();
		
		service.nuevoPedido(new Pedido("coca cola",20,f1));
		service.nuevoPedido(new Pedido("whisky",1,f2));
		service.nuevoPedido(new Pedido("patatas fritas",10,f3));
	}
	

	@Test
	void testPedidoMasReciente() {
		assertEquals("coca cola",service.pedidoMasReciente().getProducto());
	}

	@Test
	void testPedidoEntreFechas() {
		calender.set(2022, 0,1);
		Date fmin=calender.getTime();
		calender.set(2022, 11,31);
		Date fmax=calender.getTime();
		assertEquals(2,service.pedidoEntreFechas(fmin, fmax).size());
	}

}
