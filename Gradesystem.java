package com.ifelse;

import java.util.Scanner;

public class Gradesystem {

	public static void main(String[] args) {
		
		    int marks;
			System.out.println("Enter the number: \n");
			
			Scanner sv=new Scanner(System.in);
			marks=sv.nextInt();
			if(marks<0 || marks>100){
				System.out.println("Marks you entered is Invalid");
			}
			else if(marks>35 && marks<50){
				System.out.println("Congratulations you are passed ");
				
			}
			else if(marks>50 && marks<60){
				System.out.println("Congratulations you are passed with 2nd class ");
			}
			else if(marks>60 && marks<75){
				System.out.println("Congratulations you are passed with 1st class ");
			}
			else if(marks>75 && marks<100){
				System.out.println("Congratulations you are passed with Extinsion ");
			}
			else{
				System.out.println("You are fail better luck next time");
			}
		  
			

	}

}
