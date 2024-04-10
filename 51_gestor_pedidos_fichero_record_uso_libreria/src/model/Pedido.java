package model;

import java.time.LocalDate;

public record Pedido(String Producto, int Unidades, LocalDate FechaPedido) {
	public Pedido() {
		this(null,0,LocalDate.of(1, 1, 1)); //no puede hacer una constructor vacío.
	}
	
//LOMBOK
}
