package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoValoresData {

	public static void main(String[] args) throws ParseException {
		
		//Instanciando modelos de datas
		SimpleDateFormat t1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		
		//Pegando a data atual
		Date d1 = new Date();
		
		//Pegando uma data específica
		Date d2 = t1.parse("25/06/2018 00:00:00");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		System.out.println(d1);
		
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(minutos);
		System.out.println(mes);
		
		System.out.println("Data específica: " + t1.format(d2));
		
		
	}

}
