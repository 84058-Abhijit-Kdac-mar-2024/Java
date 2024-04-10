package Assignment6;

import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		Assign a=new Assign();
		try {
			a.accept();
		} catch (ExceptionLineTooLong e) {
			
			e.printStackTrace();
		}
		
	}

}