package com.loops;

import java.util.Scanner;

public class Switch_calculator {

	public static void main(String[] args) 
	{
		int a,b,c, avg;
		char ans;
		String option1;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("1.Addition");
			System.out.println("2.substraction");
			System.out.println("3.Multiflication");
			System.out.println("4.Division");
			System.out.println("5.Average");
			System.out.println("6.Area of Rectangle");
			System.out.println("Enter option");
			option1=sc.next();
			
			switch(option1)
			{
				case "addition" :
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a+b;
					System.out.println("Addition of this two numbers is: "+c);
					break;
					
				case "substraction":		
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a-b;
					System.out.println("Substraction of this two numbers is: "+c);
					break;
					
				case "multiflication":
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a*b;
					System.out.println("Multiflication of this two numbers is: "+c);
					break;
					
				case "division":
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a/b;
					System.out.println("Division of this two numbers is: "+c);
					break;
					
				case "average":
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					avg=(a+b)/2;
					System.out.println("Average of this two numbers is: "+avg);
					break;
					
				case "area":
					System.out.println("Enter the value of a and b: ");
					a=sc.nextInt();
					b=sc.nextInt();
					c=a*b;
					System.out.println( "Area of this rectangle is : "+c);
					break;
				
				default :
					System.out.println("Invalid");
			}
			
			//----------
					System.out.println("Do you want to continue");
					ans=sc.next().charAt(0);
			
		}
			while(ans == 'y' || ans =='Y');
			
	}

}

		
		
		
	
