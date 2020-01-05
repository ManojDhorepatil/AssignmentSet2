package Set2;

import java.util.Scanner;

/*2) input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2
*/

//The java string indexOf() method returns index of given character value or substring. 
//If it is not found, it returns -1. The index counter starts from zero.

public class Q2SearchString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter string to search ");
		String search = s.nextLine();
		System.out.println("enter string s1 ");
		String s1 = s.nextLine();
		System.out.println("enter string s2 ");
		String s2 = s.nextLine();

		int n = searchingString(search, s1, s2);

		if (n == 1)
			System.out.println(s1 + " comes before " + s2);
		else
			System.out.println(s2 + " comes before " + s1);
	}

	public static int searchingString(String search, String s1, String s2) 
	{
		int n = 0;
		int n1 = search.indexOf(s1);
		System.out.println(n1);
		int n2 = search.indexOf(s2);
		System.out.println(n2);
		if (n1 < n2)
			n = 1;
		else
			n = 2;
		return n;
	}
}
