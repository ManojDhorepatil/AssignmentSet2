package Set2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
15)What will be the DAY of current date in next year.
*/

public class Q15DayOfYear {

	public static void main(String[] args) throws ParseException {
		
		Date d1= new Date();
		Date d2=new Date();
		d2.setYear(d1.getYear()+1);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

		String day=sdf.format(d2);
		System.out.println(day);
	
	}

}
