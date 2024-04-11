package assign7;

import java.util.Scanner;

public class Q2 {


    public static void main(String[] args) {
    	
    	 String str;
    	 String rev="";
    	 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String : ");
        str=sc.next();

        
        for (int i = str.length() - 1; i >= 0; i--) {
        
		rev= rev+str.charAt(i);
		
        }
        
        System.out.println("Original string: " + str);
        System.out.println("reverse string is :"+rev);
    

       // System.out.println("str.equals(rev) :" +(str.equals(rev)));
        
        
if (str.equals(rev))
{
	System.out.println("palindrome");
}
	else {
	
		System.out.println("not palindrome");
	}
}
}
