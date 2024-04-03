package tester;
import  com.app.geometry.*;

public class Tester {

	public static void main(String[] args) {
		boolean result;
		
		Point2D p1 = new Point2D();
		p1.acceptData();
		p1.displayData();
	
		
		Point2D p2 = new Point2D();
		p2.acceptData();
		p2.displayData();
		
		
		result = p1.isEqual(p2);
		
	//System.out.println("Is point p1 equal to p2 ?:"+result);
		
		if(p1.isEqual(p2))
		{
			p1.getDetails();
			System.out.println("Point p1 is equal to p2");
			System.out.println("************");
		}
		else {
			
		p1.getDetails();
		p2.getDetails();
		p1.calculateDistance(p2);
		}
		


	}
	

}
