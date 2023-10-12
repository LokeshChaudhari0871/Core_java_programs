package com.ifelse;

import java.util.Scanner;

public class Positiveneg {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number: \n");
		
		Scanner sv=new Scanner(System.in);
		a=sv.nextInt();
		
		if(a>0){
			System.out.println("The number is Positive");
		}
		else if(a<0){
			System.out.println("The number is Negative");
		}
		else
			System.out.println("Its Zero");
			
		}
	}


