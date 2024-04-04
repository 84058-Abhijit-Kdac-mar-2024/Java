package day04;

import java.util.Scanner;

public class Car {
	Scanner sc =new Scanner(System.in);
	int Total_miles;
	int Cost_per_gallon;
	int Parking_fees;
	int Tolls_fees;
	int Average_miles_per_gallon;
	static double total=0;
	public Car(){
		
	}
	public int getTotal_miles() {
		return Total_miles;
	}
	public void setTotal_miles(int total_miles) {
		Total_miles = total_miles;
	}
	public int getCost_per_gallon() {
		return Cost_per_gallon;
	}
	public void setCost_per_gallon(int cost_per_gallon) {
		Cost_per_gallon = cost_per_gallon;
	}
	public int getParking_fees() {
		return Parking_fees;
	}
	public void setParking_fees(int parking_fees) {
		Parking_fees = parking_fees;
	}
	public int getTolls_fees() {
		return Tolls_fees;
	}
	public void setTolls_fees(int tolls_fees) {
		Tolls_fees = tolls_fees;
	}
	public void acceptData() {
		System.out.println("Enter Car_miles ");
		Total_miles=sc.nextInt();
		System.out.println("Enter Cost_per_gallon");
		Cost_per_gallon=sc.nextInt();
		System.out.println("Enter Average_miles_per_gallon");
		Average_miles_per_gallon=sc.nextInt();
		System.out.println("Enter Parking_fees");
		Parking_fees=sc.nextInt();
		System.out.println("Enter Tolls_fees for day");
		Tolls_fees=sc.nextInt();
		total=((Total_miles/Average_miles_per_gallon)*Cost_per_gallon)+Parking_fees+Tolls_fees;
		
	}
	
	public void display() {
		System.out.println("Car_miles: "+Total_miles);
		System.out.println("Cost_per_gallon: "+Cost_per_gallon);
		System.out.println("Average_miles_per_gallon: "+Average_miles_per_gallon);
		System.out.println("Parking_fees: "+Parking_fees);
		System.out.println("Tolls_fees: "+Tolls_fees);
		System.out.println("daily driving cost: "+total);
		
	}
}