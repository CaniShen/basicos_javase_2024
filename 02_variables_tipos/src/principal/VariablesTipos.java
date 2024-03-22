package principal;

public class VariablesTipos {
	static int r; // vatriables de tipo atributo. Fuera de MAIN
	
	public static void main(String[] args) {
		//variables locales no tienen valores inicial
		int s,v,a=10;
		System.out.println(a);
		System.out.println("La variable a vale "+a);
		s=6;
		System.out.println(s);
		System.out.println(r);
		//int 4b;  ERROR por incial sea un numero.
		int b4;
		short _r;
		int x=200;
		long z =300;
		boolean bol= true;
		double tr=3.6;
		//char break;
		char w='t';
		int car=342_223_345;
		double df=345.55_7;
		float n=4.6f;//los literales decimales son double
		//long yq=2323232323232323232323;// los literales son int, salvo que le pongamos la "l"final.
		int bin=0b101;
		System.out.println(bin);
		
	
	}
	
}
