package Set2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 3)  months between two dates
*/

public class Q3MonthsGap {
	public static void main(String[] args) throws ParseException  {
		
		Scanner s = new Scanner(System.in);

		System.out.println("enter first date in dd/MM/yyyy format ");
		String date1 = s.nextLine();
		System.out.println("enter second date in dd/MM/yyyy format ");
		String date2 = s.nextLine();
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		Date d1= sdf.parse(date1);
		Date d2=sdf.parse(date2);
		
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(d1);
		int month1= cal.get(Calendar.MONTH);
		int year1=cal.get(Calendar.YEAR);
		cal.setTime(d2);
		int month2=cal.get(Calendar.MONTH);
		int year2=cal.get(Calendar.YEAR);
		
		int gap=((year2-year1)*12)+(month2-month1);
		
		System.out.println("The gap between "+date1+" and "+date2+" is " +gap);
		
		
	}
}
