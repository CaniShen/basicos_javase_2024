package principal;

import java.util.Scanner;

public class BuscaProducto {

	public static void main(String[] args) {
		String cesta="tomate,patatas,vino,tomates,leche,azucar,vino,pan,vino,patatas,pan";
		//se pide la introducción de un producto, y programa nos muestra su stock
		Scanner sc=new Scanner(System.in);
		String producto;////为什么不INICIAR? 这里是在干什么要问一下JORGE。
		int stock=0;
		String[] productos=cesta.split("[ ,.]");  //String[] productos=cesta.split(",");如果我输入VINO + 空格 ， 系统也认为空格逗号是SEPARADORES
		System.out.println("Introduce producto: ");
		producto=sc.nextLine();// le pedimos el producto
		for(String p:productos) {
			if(p.equals(producto)) {
				stock++;
			}
		}
		System.out.println("El strock de "+producto+" es "+stock);
	}

}
