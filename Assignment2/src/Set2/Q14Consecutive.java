package Set2;

import java.util.Scanner;

/*14) find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;
*/


public class Q14Consecutive {
	public static void main(String[] args) {
		
		System.out.println("Enter the string ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		System.out.println(isConsecutiiveOfChars(input));
	}

	public static int isConsecutiiveOfChars(String input) {
		
		int c=0;
		
		 int count=0;
		 for(int i=0;i<input.length()-1;i++)
		 {
		  if(input.charAt(i)==input.charAt(i+1)) {
			  count++;
		  }
		  else {
			  count=0;
		  }
		  
		  if(count==2)
		   c++;
		  
		 }
		 return c;
		
	}
}
