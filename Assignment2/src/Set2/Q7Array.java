package Set2;

import java.util.Scanner;

/*7)Given array of intergers,print the sum of elements sqaring/cubing as per the power of their indices.         
//answer=  sum=sum+a[i]^i;
   eg:input:{2,3,5}
	Output:29
*/
//math.pow = Returns the value of the first argument raised to the power of the second argument.
public class Q7Array {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter length of array ");
		int length = s.nextInt();
		int arr[] = new int[length];

		System.out.println("Enter array elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + (Math.pow(arr[i], i));
		}

		System.out.println("Adition =" + sum);
	}
}
