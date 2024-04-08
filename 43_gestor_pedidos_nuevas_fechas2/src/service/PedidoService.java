package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;

import model.Pedido;

public class PedidoService {

	//TODO Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
	//Se presenta el siguiente menú:
	//1.- Nuevo pedido
	//2.- Pedido más reciente
	//3.- Pedidos entre dos fechas
	//4.- Pedido proximo a fecha
	//5.- Salir
	//
	//2: Muestra los datos del pedido más reciente
	//3: Se solicitan dos fechas, y se muestran los pedidos realizados
	//en ese rango de fechas 
	//4: Se solicita una fecha y nos muestra el pedido más cercano a dicha fecha
	//HACER EN EL MISMO PROYECTO NUMERO 42, LOS METODOS
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);		
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pAxu=null;   ///=new Pedido();
		LocalDate fMax=LocalDate.of(0, 1, 1); // 1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if (p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				 pAxu= p;
			}
		}
		return pAxu;
	}
		 						
										
		
	
	public ArrayList<Pedido> pedidoEntreFechas (LocalDate f1, LocalDate f2) {
		ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2. se incluye 
			if (p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;
	}

	public Pedido muestraPedidoCercaFecha(LocalDate f3) {
//		Pedido pAux=new Pedido();
//		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
//		//comparamos la diferencia de días entre la fecha de cada pedido y la 
//		//parámetro, con la dierencia de días entre la fecha auxiliar y la parámetro
//		//si la del pedido es inferior, actualizamos la viariable pedido auxiliar
//		for(Pedido p:pedidos) {
//			if(Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), f3))<
//					Math.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(),f3))) {
//				pAux=p;
//				
//			}
//			
//		}
//		 return pAux;
		Pedido pAxu = null; //Se crea un producto AUXILIAR para ayudarnos a hacer la comparación, 
							//guardando en este variable el menor tiempo a una fecha dada ...
		for (Pedido p : pedidos) {//recorremos los pedidos guardados.
			long diaPedido = Math.abs(ChronoUnit.DAYS.between(f3, p.getFechaPedido()));//iniciando los dias que tienen entre la fecha 
																		//introducido del usuario hasta la fecha del pedido.		
			if(pAxu == null) {///si el producto axuliar es nulo.
				pAxu=p;			//lo inicializamos, es decir, es igual al PRIMER pedido de HashSet.
			}
			long diaAxu =Math.abs(ChronoUnit.DAYS.between(f3, pAxu.getFechaPedido()));//iniciando los dias que tienen entre la fecha introducido del usuario 
																			//hasta la fecha del pedido auxiliar.

			if(diaAxu>diaPedido) {// si el numero de dias del pedido es menor al pedido auxiliar , entonces modificamos el pedido auxiliar con el pedido actual.
				pAxu=p;
			}
		}
		return pAxu;
//		Pedido pAxu = null; // Se crea un producto AUXILIAR para ayudarnos a hacer la comparación,
//		// guardando en este variable el menor tiempo a una fecha dada ...
//		for (Pedido p : pedidos) {// recorremos los pedidos guardados.
//			long diaPedido = Math.abs(ChronoUnit.DAYS.between(f3, p.getFechaPedido()));// iniciando los dias que tienen
//																				// entre la fecha
//				pAxu = p; 
//			
//			long diaAxu = Math.abs(ChronoUnit.DAYS.between(f3, pAxu.getFechaPedido()));// iniciando los dias que tienen
//																						// entre la fecha introducido
//																						// del usuario
//			// hasta la fecha del pedido auxiliar.
//
//			if (diaAxu > diaPedido) {// si el numero de dias del pedido es menor al pedido auxiliar , entonces
//										// modificamos el pedido auxiliar con el pedido actual.
//				pAxu = p;
//			}
//		}
//		return pAxu;

	}
	
	
	
}
