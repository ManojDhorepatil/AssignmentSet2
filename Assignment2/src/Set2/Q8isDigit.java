package Set2;

import java.util.Scanner;

/*8)Given array of string check whether all the elements contains only digits not any alaphabets.
if condn satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1
*/
public class Q8isDigit {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 array elements ");
		
		String [] input= new String[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = s.nextLine();
		}
		
		int output=0;
		for(int i=0;i<input.length;i++)
		{
			String str=input[i];
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if(Character.isDigit(ch)) {
					output=1;
				}
				else {
					output= -1;
					break;
				}
				
			}
			if(output == -1) 
			{
				break;
			}
		}
		
		System.out.println(output);
		
	}
}
