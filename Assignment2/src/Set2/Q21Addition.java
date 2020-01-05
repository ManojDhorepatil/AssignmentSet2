package Set2;

import java.util.Scanner;

/*21) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
	if both the sum is equal return 1 or return -1.
*/
public class Q21Addition {
	public static void main(String[] args) {
		
		int arr[]= new int[6];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int evenAdd=0;
		int oddAdd=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				evenAdd=evenAdd+arr[i];
			else
				oddAdd=oddAdd+arr[i];
		}
		
		System.out.println("Total addition of Even = "+evenAdd+ " & Odd =  "+oddAdd);
		
		if(evenAdd==oddAdd)
			System.out.println(" output : 1");
		else
			System.out.println(" output :  -1");
	}

}
