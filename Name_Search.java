package com.classes;

import java.util.Scanner;

class Student_name 
{
	int rollno;
	String name;
	float per;
	
	
	void input()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter roll number , name , percentage ");
		rollno=sc.nextInt();
		name=sc.next();
		per=sc.nextFloat();
	}
	
	void display ()
	{
		System.out.println("Roll number: \n" +rollno+ "name: \n" +name+ "Percentage: \n"+per);
		
	}
}

public class Name_Search {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		  Student_name s[]= new Student_name[3];
		  for (int i=0;i<=2;i++)
		  {
			  s[i]=new Student_name();
			  s[i].input();
			  
		  }
		  
		  for (int i=0;i<=2;i++)
		  {
			  
			  s[i].display();
			  
		  }
		  String n;
		  int flag=0;
				  System.out.println("Enter the name you want to search ");
		  	n=sc.next();
		  	
		  	for(int i=0;i<=2;i++)
		  	{
		  		if(s[i].name.equals(n))
		  		{
		  			System.out.println("Name is found");
		  			s[i].display();
		  			flag=1;
		  		}
		  		
		  		System.out.println("I wanted to print this again I wanted to enter clt +o  ");
		  	}
		  	
		  	
	}

}
