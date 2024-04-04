package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PruebaFecha {

	public static void main(String[] args) throws ParseException {
		//fecha actual
		Date f1=new Date();
//		java.sql.Date.f2; ///nombre cualificado
		System.out.println(f1);
		//Fecha y hora concreta
//		Date f2=new Date(2023,10,20);//deprecated...!!!
		Calendar cal=Calendar.getInstance();
		cal.set(2022, 0,30,10,20,35);
		Date f2=cal.getTime();
		System.out.println(f2);
		//Fecha a partir de un String
		String fecha="4/10/1999";
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		Date f3=format.parse(fecha);
		
	}

}
