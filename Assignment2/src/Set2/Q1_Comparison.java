package Set2;

import java.util.Scanner;

/*1) compare two strings, if the characters in string 1 are present in
string 2, then it should be put as such in output, else '+' should be
put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+
*/

public class Q1_Comparison {
	public static void main(String[] args) {

		System.out.println("Enter two strings = ");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string ");
		String str1 = s.nextLine();
		System.out.println("Enter second string  ");
		String str2 = s.nextLine();
		int j = 0;
		
		for (int i = 0; i < str1.length() && j < str2.length(); i++)
		{
			
			if (str1.charAt(i) == str2.charAt(j)) 
			{
				System.out.print(str1.charAt(i));
				j++;
			} 
			else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') 
			{
				if (str1.charAt(i) - 32 == str2.charAt(j)) {
					System.out.print(str1.charAt(i));
					j++;
				}
				else 
				{
					System.out.print("+");
				}
			} 
			else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') 
			{
				if (str1.charAt(i) + 32 == str2.charAt(j)) {
					System.out.print(str1.charAt(i));
					j++;
				}
				else 
				{
					System.out.print("+");
				}
			}
			else 
			{
				System.out.print("+");
			}
		}

	}
}
