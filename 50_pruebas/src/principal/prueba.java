//package principal;
//
//public class prueba {
//
//	public static void main(String[] args) {
////		int a=20;
////		int s=sc.nextInt();
////		final int c=8;
////		switch(s){
////			case 5://ok
////				
////			case '#'://ok
////				
////			case "hello"://no
////				
////			case a://no se puede poner un variale en case
////					//se puede poner un contante
////				
////			case c://ok
//			
//				
//				
//				
////				
////				1-int b='f';// OK implicita
////				2-int a=3.4f;// NO 
////				3-char b=(char)5.7;// NO
////				4-int a=3;byte c=a;// NO , menor a mayor no
//				
////				
//////				int a=20;
//////				int s=sc.nextInt(); //se introduce un 5
//////				final int c=8;
//////				String res=switch(s){
//////					case 5->"hola";
//////					case '#'->"adios";
//////					case c->"hasta mañana";
//////				}
//////				System.out.println(res); 
////				//error de compilación, porque cuando se utiliza switch en expresiones tiene que //devolver un resultado en cualquier caso, por loque faltaría un bloque default
////				System.out.println(res); 
//				
//				
//				
////				try{
////					int a=Integer.parseInt(sc.nextLine()); aquí Integer. espara que el programa sigue funciona. converte a un texto si dentro de este texto existe un número
////				}catch(NullPointerException ex){  // pero si dentro de () hay NumberForatException , sí se capta el error. 
////					print("Error");
////				}
////				suponiendo que se introuce una letra:
////				1.-volcado de error------------------
////				2.-Se imprime error
////				3.-No se muestra nada
////				4.-Error de compilación 
//				
////				a. LocalDate l1=LocalDate.of(2010,13,20);
////				b. LocalDate l2=LocalDate.now();mal!!!!! LocalDate no tiene construcdor.
////				c. LocalDateTime ld3=LocalDateTime.of(
////				LocalDate.now
////				(),
////				LocalTime.now
////				());
////				d. LocalTime lt4=LocalTime.of(20,80,20);
////				e. LocaDate l5=new LocalDate();
////				f. LocalDate 
////				l6=LocalDate.now
////				().of(3000,10,10);
////
////				¿Cuales compilan? 
////				a,b,c,d,f
////				
////				String a="hello";
////				a.replace("h","p");
////				System.out.println(a);/ NO INMUTABILIDAD DE STRING
//				
////				int[] m= new int[5];
////				int[] z=m;
////				z[0]=10;
////				System.out.println(m[0]));z y m están apuntandos a lo misma array. Array no son inmutable
//////			
//		
//		
////		
////		main(){
////			int x=10;
////			int y=3;
////			sumar(x,y);
////			print(x);
////		}
////
////		void sumar(int a, int b){
////			a=a+b;
////		} 
//		
//		
////		
//////		ADMIN dice:Given:
//////		class Test{
//////			var datas=new ArrayList<Integer>();
//////			public void print(){
//////				System.out.println(datas.get(0));
//////			}
//////		}
//////
//////		Test t=new Test();
//////		t.print();
//////
//////
//////		a.) 0
//////		b.) null
//////		c.) error de compilación
//////		d.) excepción NullPointerException 
////		} 
//////
//////	}
////
////}
//
//
//Antonio Martín
//Antonio Martín dice:public void print(int a){
//	System.out.println("uno");
//}
//public void print(String a){
//	System.out.println("dos");
//}
//public void print(int a,int b){
//	System.out.println("tres");
//}
//public void print(long r){
//	System.out.println("cuatro");
//}
//
//print(25);  //imprime uno 
