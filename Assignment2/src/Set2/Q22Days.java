package Set2;

import java.time.YearMonth;
import java.util.Scanner;

/*
 * 22)no of days in a month in specific year.
*/
public class Q22Days {
	public static void main(String[] args) {
		
		
		YearMonth ym = YearMonth.of(2012,02);
		System.out.println(ym.lengthOfMonth());

	}
}
