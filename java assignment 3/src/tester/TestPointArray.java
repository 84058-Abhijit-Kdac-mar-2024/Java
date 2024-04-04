package tester;

import java.util.Scanner;

import day4.Point2D;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choics;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no of points to plot");
		Point2D[] points=new Point2D[sc.nextInt()];
		for(int i =0;i<points.length;i++) {
			points[i]=new Point2D();
			points[i].acceptData();
		}
	
	do {
		System.out.println("1: Display details of a specific point");
		System.out.println("2: Display x, y co-ordinates of all points");
		System.out.println("3: User i/p : 2 indices for the points , validate the indices");
		System.out.println("4: Exit");
		System.out.println("Enter your choics");
		choics=sc.nextInt();
		switch(choics) {
		case 1:
		{
			System.out.println("Enter index Display details of a specific point");
			int index=sc.nextInt();
			if(index>points.length) {
				System.out.println("Invalid index , pls retry..............!!!!");
				System.out.println("=====================================");
			}
			else {
			System.out.println("Details: "+points[index-1].getDetails());
			System.out.println("=====================================");
			}
			break;
		}
		case 2:
			System.out.println("=====================================");
			System.out.println("Points :");
			for(Point2D p:points)
				System.out.println(p.getDetails());
			System.out.println("=====================================");
		    break;
		case 3:
			System.out.println("Enter index one for compare");
		int index=sc.nextInt();
		if(index>points.length) {
			System.out.println("Invalid index , pls retry!!!!");
			System.out.println("=====================================");
			break;
		}
		System.out.println("Enter index two for compare");
		int index2=sc.nextInt();
		if(index2>points.length) {
			System.out.println("Invalid index , pls retry!!!!");
			System.out.println("=====================================");
			break;
		}
		if(points[index-1].equals(points[index2-1])){
			System.out.println(points[index].getDetails());
			System.out.println("Point p1 and  p2 at same point");
			break;
		}
		else {
			points[index-1].calculateDistance(points[index2-1]);
		}
			
		break;
		case 4:
			choics=0;
			System.out.println("Thank you for using thsi app..............");
			break;
		 default:
			 System.out.println("invalied choics............");
			 break;
			
		}
		
		
	}while(choics!=0);

}
}