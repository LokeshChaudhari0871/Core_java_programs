package com.loops;

import java.util.Scanner;

public class Switch_ {

	public static void main(String[] args)
	{
		int option;
		char ans = 0;
		
		
		do{
		Scanner sc=new Scanner(System.in);
//		System.out
		System.out.println("Enter option ");
		option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("IT");
			break;
		
		case 2:
			System.out.println("Civil");
			break;
		
  		case 3:
  			System.out.println("Computer science");
  			break;
		
		case 4:
			System.out.println("Aviation AME");
			break;
			
		default:
			System.out.println("I am ENTREPRENEUR i dont need degree ;)");
		}
		System.out.println("Do you want to ask next candidate?");
		ans=sc.next().charAt(0);
	}
		
		while(ans=='y' || ans=='Y');

}
}

