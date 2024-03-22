package principal;

import java.util.Scanner;

public class ContarPin {

	public static void main(String[] args) {
		// hacer un programa que solicite la introducción de un PIN
				// Si es corrercto demuestro un mensaje y el programa termina
				// si es incorrecto, le informa de ello al usuarioy le solicita
				// de nuevo el pin. Si falla tres veces en la introcción del pin
				// le muestra mensaje de error, y el programa termina.

				Scanner sc = new Scanner(System.in);
				final String PIN_VALIDO = "abc";
				String pinLeido;
				int intentos = 3;

				while (intentos > 0) {
					System.out.println("Introduce pin:");
					pinLeido=sc.nextLine();// lectura de datos por teclado 读一下 但是 把它存起来， nextLine 是储存 他没在用COMPARAR
					if (pinLeido.equals(PIN_VALIDO)) {
						System.out.println("Pin correcto!");
						intentos = 0; // para que no vuelva a entrar en while
						break; // ya no neesita seguir pidiendo pin
					} else {
						intentos--;
						if (intentos > 0) {
							System.out.println("Pin incorrecto, vuelve a intentarlo, te quedan " + intentos);
						} else {
							System.out.println("Intruso, no puedes entrar!!");
						}
					}
				}


				
			/*	System.out.println("Introduce TU PIN:");*/
			/*	pin=sc.nextInt()*/
			/*	do {
					System.out.println("correcto");
					pin = sc.nextInt();
					
				}while(PIN_VALIDO=true);
				do {
					System.out.println("Introduce tu PIN");
					pin = sc.nextInt();
				}while(PIN_VALIDO=false);*/

		}
		}
