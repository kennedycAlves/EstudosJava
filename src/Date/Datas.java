package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		//Instanciando modelos de datas
		SimpleDateFormat t1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat t2 = new SimpleDateFormat("dd/MM/yyyy");
		
		//Pegando a data atual
		Date d1 = new Date();
		//ègando a data por milesegundos
		Date d2 = new Date(System.currentTimeMillis());
		
		
		//Imprimindo a data
		
		System.out.println("d1:" + t1.format(d1));
		System.out.println("d2:" + t2.format(d2));

	}

}
