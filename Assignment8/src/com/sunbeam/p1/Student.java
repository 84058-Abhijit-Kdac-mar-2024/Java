package com.sunbeam.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
	
	private int roll;
	 String name;
	 String city;
	 double marks;
	public Student(int roll, String name, String city, double marks) 
	{
		
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
		
		
	}
	
	
	@Override
	public String toString() 
	{
		return "roll no-"+roll + ", name-"+name + ", city-"+ city + ", marks-"+marks;
		
	}
}
		
