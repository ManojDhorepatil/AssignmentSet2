package Set2;

import java.util.Scanner;

/*17)input array={red,green,blue,ivory}
sort the given array
reverse the given array
if user input is 1 it should give 0th element of an reversed array.
*/
public class Q17Array {
	public static void main(String[] args) {
		
		String[] s = new String[4];
		System.out.println("Enter string array elements ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {

			s[i] = sc.nextLine();

		}

		// String s[] = { "red", "green", "blue", "ivory" };

		String s1[] = new String[s.length]; //creating new array for storing array elements in rverse order
		int index = 0;

		for (int i = s.length - 1; i >= 0; i--) 
		{
			String temp = s[i];						//Storing value in String temp
			s1[index] = temp;						//value array store s1
			index++;								//index increment
		}
		
		System.out.println("enter input less than or equal to "+s.length);
		int input=sc.nextInt();
		System.out.println(s1[input - 1]);

		
	}

}
