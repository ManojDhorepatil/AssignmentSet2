package Set2;

/*6)	input1="abc2012345"
		input2="abc2112660"
		input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4
*/
public class Q6CustomerReading {

	public static void main(String[] args) {
		
		String input1="abc2012345";
		String input2="abc2112660";
		int	input3 = 4;
		
		String ip1=input1.substring(5);
		String ip2=input2.substring(5);
		
		int reading1=Integer.parseInt(ip1);
		int reading2=Integer.parseInt(ip2);
		
		int reading=(reading2-reading1)*input3;
		System.out.println("Customer reading bill ="+reading);
	}
	
}
