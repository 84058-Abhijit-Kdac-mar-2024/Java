package assign7;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args ) {
	

		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		str=sc.nextLine();
		
	int index=0;
	
	String arr[]=str.split("");
	
	for(String element : arr) {
		index++;
		
		
	}
		System.out.println("String count is :"+index);
		
		

}
}