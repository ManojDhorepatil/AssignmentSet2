package Set2;

import java.util.Scanner;

/*16)Get all the numbers alone from the string and return the sum.

Input"123gif"
Output:6
*/
public class Q16String {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input=s.next();
		int sum=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(Character.isDigit(ch))
			{
				String no= Character.toString(ch);
				sum=sum+(Integer.parseInt(no));
			}
			
		}
		
		System.out.println(sum);
		
	}
}
