package com.ifelse;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter the number: \n");
		
		Scanner sv=new Scanner(System.in);
		a=sv.nextInt();
		
		if(a%2==0){
			System.out.println("The number is Even");
			
		}
		else{
			System.out.println("The number is odd");
		}
		

	}

}
