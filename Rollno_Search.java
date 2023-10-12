package com.classes;

import java.util.Scanner;

class Student_roll
{
	int rollno;
	String name;
	float per;
	
	void input ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno, Name , Percentage of Student ");
		rollno=sc.nextInt();
		name =sc.next();
		per=sc.nextFloat();
	}
	
	void display ()
	{
		System.out.println("Roll number: \n" +rollno+ "name: \n" +name+ "Percentage: \n"+per);
	}
}

public class Rollno_Search {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		Student_roll s[]= new Student_roll[3];
		 for (int i=0;i<=2;i++)
		 {
			 s[i]=new Student_roll();
			 s[i].input();
			 
		 }
		 for(int i=0;i<=2;i++)
		 {
			 s[i].display ();
		 }
		 
		 int r;
		 int flag =0;
		 System.out.println("Enter the roll number you want to search ");
		 r=sc.nextInt();
		 for (int i=0;i<=2;i++)
		 {
			 if(s[i].rollno==r)
			 {
				 System.out.println("Roll number is found");
				 s[i].display();
				 flag = 1;
			 }
		 }
	}	

}
