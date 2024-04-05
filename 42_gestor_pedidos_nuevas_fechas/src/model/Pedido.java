package model;

import java.util.Date;

public class Pedido {
	private String producto;
	private int unidades;
	public Date fechaPedido;
	public Pedido(String producto, int unidades, Date fecha) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.fechaPedido = fecha;
	}
	
	public Pedido() {
		super();
	}

	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	

}
