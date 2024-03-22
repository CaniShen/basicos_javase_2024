package principal;

public class PruebaTexto {

	public static void main(String[] args) {
//		String n="hello";  /// n contiene la referencia del objeto. n contiene el objeto.
//		n.toUpperCase();
//		System.out.println(n); // muestra hello por inmutable, 
//		n=n.toUpperCase();
//		System.out.println(n);//el n original se convierte a basura. GC 它清理垃圾 这东西叫做GC.
//
//		String a=new String("mitexto");
//		String b=new String("mitexto");
//		if(a==b) {						 // 不同的因为他们的只是显示LOCALES 但是不显示OBJETO 本身"=="
//			System.out.println("Iguales");
//		}else {
//			System.out.println("Distintos");  
//		}
//
//		String c=new String("mitextos");
//		String d=new String("mitextos");
//		if(c.equalsIgnoreCase(d)) {
//			System.out.println("Iguales");
//		}else {
//			System.out.println("Distintos");
//		}
		
		
		String a="mitextos"; //第一个JAVA 创造 第二个他不创造（NEW）， JAVA 为了节省空间它会找有没有存在的TEXTO
		String b="mitextos";//所以第二个他就不创造了直接拿第一个的做代替
		if(a==b) {
			System.out.println("Iguales");
		}else {
			System.out.println("Distintos");
		}
		
		
		

	}
}
