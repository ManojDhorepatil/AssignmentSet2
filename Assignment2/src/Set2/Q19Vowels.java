package Set2;

import java.util.Scanner;
import java.util.StringTokenizer;

/*19)Take the word with a max length in the given sentence
in that check for vowels if so count the no.of occurrences !
 Input 1="Bhavane is a good girl"
 Output =3
 Input 1="Bhavanee is a good girl"
 Output =4
*/
public class Q19Vowels {
	public static void main(String[] args) {
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=sc.next();*/
		
		String str="Bhavane is a good girl";
		
		StringTokenizer st= new StringTokenizer(str," ");
		String str1=st.nextToken();
		String str2="";
		while(st.hasMoreTokens())
		{
			str2=st.nextToken();
			if(str1.length() <= str2.length())
			{
				str1=str2;
			}
			
		}
		
		System.out.println("Max length word is " +str1);
		int count=0;
		
		for(int i=0;i<str1.length();i++) 
		{
			char ch=str1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u')
			{
				count++;
			}
		}
		
		System.out.println("no.of occurrences of vowels in word is "+count);
		
		
	}

}
