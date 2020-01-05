package Set2;

import java.util.Scanner;
import java.util.StringTokenizer;

/*13) count the number of times the second word in second string occurs in first string-case sensitive

input1=hai hello hai where hai Hai;
input2=what hai
output=3;
*/
//StringTokenizer class in Java is used to break a string into tokens.

public class Q13CountWord {
	public static void main(String[] args) {

		String input1 = "hai hello how are you?? hai hai";
		String input2 = "what hai";
		
		/*String a= Character.toString(input2.charAt(5)) ; 
		String ab= Character.toString(input2.charAt(6));
		String abc= Character.toString(input2.charAt(7));
		String abcd=a+ab+abc;
		System.out.println(abcd);*/
		
		System.out.println(stringCount(input1, input2));
	}

	public static int stringCount(String input1, String input2) 
	{
		int count = 0;
		StringTokenizer st1 = new StringTokenizer(input2, " ");
		String s1 = st1.nextToken();
		String s2 = st1.nextToken();

		StringTokenizer st2 = new StringTokenizer(input1, " ");

		while (st2.hasMoreTokens())
		{
			if (st2.nextToken().equals(s2))
				count++;
		}

		return count;
	}

}
