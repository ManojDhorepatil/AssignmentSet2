package Set2;

import java.util.Scanner;

/*9) int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.
*/

public class Q9MinMax {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of array ");
		int length =s.nextInt();
	
		
		
		int arr[]= new int[length];
		System.out.println("Enter array elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("min = " +min+ " max = "+max);
		
		System.out.println("The difference between min & max is "+(max-min));
		
		
	}
}
