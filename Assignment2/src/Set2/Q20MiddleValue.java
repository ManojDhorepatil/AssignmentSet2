package Set2;

import java.util.Scanner;

/*20) for the given string display the middle 2 value, case satisfies only if string is of even length
ip - java
op - av
*/

public class Q20MiddleValue {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter string :");
		String input=sc.next();
		
		if(input.length()%2 == 0)
		{
			String str=input.substring((input.length()/2)-1,(input.length()/2)+1);
			System.out.println("Output is : "+str);
		}
		else {
			System.out.println(" "+input+" is having odd length");
		}
	}
}
