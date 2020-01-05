package Set2;

import java.util.Scanner;

/*4)  intput="xyzwabcd"
intput2=2;
input3=4;
output=bawz
*/
//Java StringBuffer class is used to create mutable (modifiable) string.

public class Q4String {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string ");
		String str = s.nextLine();
		System.out.println("enter start index ");
		int s1 = s.nextInt();
		System.out.println("enter end index ");
		int s2 = s.nextInt();
		
		StringBuffer sb =new StringBuffer(str);
		sb.reverse();
		
		String newStr=sb.substring(s1, s1+s2);
		System.out.println(newStr);
	}
}
