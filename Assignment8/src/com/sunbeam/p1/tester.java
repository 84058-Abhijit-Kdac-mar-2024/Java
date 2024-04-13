package com.sunbeam.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class tester {

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		Student arr[] = new Student[5];
		arr[0] = new Student(01, "vedant", "Pune", 90);
		arr[1] = new Student(02,"Nirr", "Nagpur", 74);
		arr[2] = new Student(03, "Rohit", "Satara", 95);
		arr[3] = new Student(04, "Anand", "Kolhapur", 70);
		arr[4] = new Student(05, "Abhi", "Chandrapur", 66);
		
	
	
		do
		{
	  System.out.println("Menu:");
	  System.out.println("1. Sort by city(Ascending):");
	  System.out.println("2.Sort by Marks(descending :");
	  System.out.println("3.Sort by Name(Ascending : ");
	  System.out.println("Enter The Choice -");
	  choice=sc.nextInt();


	
	switch(choice)
	{
		case 1:
		class cityCompare implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) 
			{
				int value=o1.city.compareTo(o2.city);
				return value;
			}
		}
			Comparator<Student> c1 = new cityCompare();
			Arrays.sort(arr,c1);
			for(Student element:arr)
			{
				System.out.println("City with ascendig "+element);
			}
			
	break;
		case 2:
			class marks_Comparator implements Comparator<Student>
			{

				@Override
				public int compare(Student o1, Student o2)
				{
					int value =Double.compare(o1.marks, o2.marks);
					return value;
				}
				
			}
			Comparator<Student> m1=new marks_Comparator();
			Arrays.sort(arr,m1);
			System.out.println("After sorting ");
			for(Student element:arr)
			{
				System.out.println("City with ascendig "+element);
			}
			break;
		case 3:
			class Name_Compare implements Comparator<Student>
			{

				@Override
				public int compare(Student o1, Student o2) 
				{
					int value=o1.name.compareTo(o2.city);
					return value;
				}
			}
				Comparator<Student> n1= new Name_Compare();
				Arrays.sort(arr,n1);
				for(Student element:arr)
				{
					System.out.println("City with ascendig "+element);
				}
				break;
	}
}while(choice!=0);
	}
}

