package Set2;

import java.util.StringTokenizer;

/*
18)String a="a very fine day"
output:A Very Fine Day
*/
public class Q18String {
	public static void main(String[] args) {

		 String str1 = "its a very fine day";
		System.out.println(str1);
	
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str1, " ");
		
		while (st.hasMoreTokens()) {
			String s2 = st.nextToken();
			String s3 = s2.substring(0, 1);
			String s4 = s2.substring(1, s2.length());
			sb.append(s3.toUpperCase()).append(s4).append(" ");
		}
		
		System.out.println("In UpperCase is ");
		System.out.println(sb.toString());
		
	}
}
