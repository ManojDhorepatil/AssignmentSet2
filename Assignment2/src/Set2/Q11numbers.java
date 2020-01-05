package Set2;

import java.util.Scanner;

/*11)  input={"1","2","3","4"}
output=10
ie,if string elements are nos,add it.
input={"a","b"}
output=-1;
*/
public class Q11numbers {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length of Array ");
		int length =s.nextInt();
		
		System.out.println("Enter array elements ");
		String [] input= new String[length];
		for (int i = 0; i < input.length; i++) 
		{
			input[i] = s.next();
		}
		
		int addition=0;
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
			if(output == 1) 
			{
				addition=addition+Integer.parseInt(str);			
			}
		}
		
		if(addition != 0)
		{
			System.out.println("Total sum is "+addition);
		}
		else
		{
			System.out.println("-1");
		}
		
	}
}
