package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateEx2calender {

	public static void main(String[] args) throws ParseException {

		//Somando uma unidade de tempo
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse(d));
		
		System.out.println();
		
	}

}
