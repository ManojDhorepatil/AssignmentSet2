package Set2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5) Given integer array
 input :int[] arr={2,3,5,4,1,6,7,7,9};

Remove the duplicate elements and print sum of even numbers in the array..
print -1 if arr contains only odd numbers.
*/
//Java ArrayList class uses a dynamic array for storing the elements. 
//It inherits AbstractList class and implements List interface.

public class Q5Array {

	public static void main(String[] args) {
		// int[] arr={2,3,5,4,1,6,7,7,9};

		System.out.println("Enter array elements =");
		Scanner s = new Scanner(System.in);

		int arr[] = new int[5];
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr.length; i++)
			list1.add(arr[i]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					list2.add(arr[i]);
			}
		}
		
		// System.out.println(list2);
		list1.removeAll(list2);
		// System.out.println(list2);
		list1.addAll(list2);
		
		System.out.println(list1);

		int sum = 0;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) % 2 == 0) {
				sum = sum + list1.get(i);
			}
		}

		if (sum == 0)
			System.out.println("-1");
		else
			System.out.println("Addition of even numbers of array is " + sum);
	}

}
