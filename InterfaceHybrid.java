package com.inheritance;

import java.util.Scanner;

interface Car    // this is 1st interface of hybrid inheritance
{
	Scanner sc=new Scanner (System.in);
	 void display();
}

interface Fule_car extends Car   
{
	void display1();
}

interface EV_car extends Car
{
	void display2();
}


class Hybrid implements Fule_car,EV_car
{

	@Override
	public void display() {
		
	}

	@Override
	public void display1() {
		
		int mileage; float performance;
		System.out.println("Enter Mileage and performance: ");
		mileage=sc.nextInt();
		performance=sc.nextFloat();
		
		System.out.println("mileage of Fule Car is: "+mileage);
		System.out.println("Car gets 60Kmpl speed in "+performance+" seconds");

	}
	
	@Override
	public void display2(){
		int range; float performance;
		System.out.println("\nEnter Range and performance: ");
		range=sc.nextInt();
		performance =sc.nextFloat();
		
		System.out.println("Car gets "+range+ " In single charge");
		System.out.println("Car gets 60Kmpl speed in "+performance+ " seconds");
		
	}

}

public class InterfaceHybrid {
	
	public static void main(String[] args) {
		Hybrid h1=new Hybrid ();
		h1.display();
		h1.display1();
		h1.display2();

	}

}
