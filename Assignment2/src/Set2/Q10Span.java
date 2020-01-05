package Set2;

/*10) Given an array find the largest 'span'(span is the number of elements between two same digits)
find their sum.
a[]={1,4,2,1,4,1,5}
Largest span=5
*/
public class Q10Span {
	public static void main(String[] args) {

		int a[] = { 1, 4, 2, 1, 4, 1, 5 };

		int max = 0;
		int element1 = 0;
		int element2 = 0;
		int temp = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] == a[j]) 
				{
					temp = j;
				}
			}
			if (temp - i > max) 
			{
				max = temp - i;
				element1 = i;
				element2 = temp;
			}
		}
		
		int span= element2 - element1 ;
		System.out.println("largest span :" + span );

	}

}
