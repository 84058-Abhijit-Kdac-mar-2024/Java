package com.app.geometry;

//import java.lang.FdLibm.Pow;
import java.lang.Math.*;
import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	
	public Point2D() {
		x=0;
		y=0;
	
	}
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X coordinate:");
		x=sc.nextInt();
		System.out.println("Enter Y coordinate:");
		y=sc.nextInt();
		
	}
	public void displayData()
	{
		System.out.println("************");
		System.out.println("(X,Y):("+x+","+y+")");
		
	}

	public String getDetails()
	{
		String result;
		result=x+","+y;
		System.out.println("Point:"+result);
		return result;
		
	}
	
	public boolean isEqual(Point2D p2)
	{
		if(this.x==p2.getX() && this.y==p2.getY())
		return true;
		else
			return false;
		
	}
public	void calculateDistance(Point2D p2)
	{
		int x1 = this.x - p2.getX();
		int y1 = this.y -p2.getY();
		
		int dis=(int) Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
		//int dis=(int) Math.pow(dis1,1/2);
		
		//int dis = (x1*x1 + y1*y1)^(1/2);
		
		
		System.out.println("Distance between two points :"+dis);
		
	}

	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	

}