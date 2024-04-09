package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import model.Pedido;
import utilidades.Util;

public class PedidoService {
	String fichero = "pedido.csv";

	// cada pedido se graba en una línea:
	// producto,unidades,fechaPedido
	public void borrarPedidos() {
		File file = new File(fichero);
		file.delete();
	}

	public void nuevoPedido(Pedido pedido) {
		try (FileOutputStream fos = new FileOutputStream(fichero, true); PrintStream out = new PrintStream(fos);) {
			out.println(Util.convertirPedidoACadena(pedido));

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}

	}

	public Pedido pedidoMasReciente() {
		String linea;
		LocalDate fMax = LocalDate.of(0, 1, 1);// 1/1/1970
		Pedido pAxu = null;

		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {

			while ((linea = bf.readLine()) != null) {
				Pedido p = Util.convertirCadenaAPedido(linea);
				// si encontramos pedido con fecha más reciente que fMax
				// actualizamos fMax y pAux
				if (p.FechaPedido().isAfter(fMax)) {
					fMax = p.FechaPedido();
					pAxu = p;

				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return pAxu;
	}

	public ArrayList<Pedido> pedidoEntreFechas(LocalDate f1, LocalDate f2) {
		ArrayList<Pedido> aux = new ArrayList<Pedido>();
		String linea;
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {
			// mientras haya una nota que leer

			while ((linea = bf.readLine()) != null) {
				Pedido p = Util.convertirCadenaAPedido(linea);
				// si fecha del pedido es posterior o igual a f1 y anterior o igual a f2, se
				// incluye
				if (p.FechaPedido().compareTo(f1) >= 0 && p.FechaPedido().compareTo(f2) <= 0) {
					aux.add(p);
				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return aux;
	}

	public Pedido pedidoProximoFecha(LocalDate fecha) {
		Pedido pAux = new Pedido();
		//pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		try (FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr);) {
			String linea;
			while ((linea = bf.readLine()) != null) {
				Pedido p = Util.convertirCadenaAPedido(linea);
				if (Math.abs(ChronoUnit.DAYS.between(p.FechaPedido(), fecha)) < Math
						.abs(ChronoUnit.DAYS.between(pAux.FechaPedido(), fecha))) {
					pAux = p;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
	}
}
