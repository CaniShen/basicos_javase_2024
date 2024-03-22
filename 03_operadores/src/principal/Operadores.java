package principal;

public class Operadores {

	public static void main(String[] args) {
		int a =3;
		int b=5;
		System.out.println(b/a);
		System.out.println(b%a);
		b++;//b=b+1
		--a;//a=a-1
		int c=10;
		System.out.println(c++);//muestra 10
		int n=--c;//n vale 10
		
		double r=3.5;
		r++;
		int x=5;
		int y=4;
		int z=8;
		//System.out.println(x==y++);//false
		boolean rs=x>y ||++z>2; //es o como la primera y la segunda todos son true.
		//entonces no se ejecuta por el operador "o"
		System.out.println(z);
		
		
	}

}
