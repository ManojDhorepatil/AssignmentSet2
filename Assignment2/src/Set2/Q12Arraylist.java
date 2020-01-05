package Set2;

/*12) arraylist1={ 1,2,3,4,5}
arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}
*/

public class Q12Arraylist {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 10 };

		int arr3[] = new int[arr1.length];

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (i % 2 == 0)
					arr3[i] = arr2[i];
				else
					arr3[i] = arr1[i];
			}
		}

		System.out.println("Output ");

		for (int i = 0; i < arr3.length; i++) {
			System.out.print("  " + arr3[i]);
		}

	}
}
