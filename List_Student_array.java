package com.classes;

import java.util.Scanner;

class Student_list

{
		int rollno;
		String name;
		float per;
		
		void input()
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter roll number,name,per");
			rollno = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			per = sc.nextFloat();
		}
	
			void display()
			{
		         System.out.println("1) Student roll number: " +rollno+ "\n 2)name: " +name+ "\n 3)percentage: " +per );
		         
			}
	
}


   public class List_Student_array {

	    public static void main(String[] args) 
	    {
	    	Student_list s[]=new Student_list[3];
	    	for(int i=0;i<=2;i++)
	    	{
	    		s[i]=new Student_list();
	    		s[i].input();
	    	}
	    	for(int i=0; i<=2;i++)
	    	{
	    		if(s[i].per>=60)
	    		{
	    		s[i].display();
	    		}
	    	 }
	   
      }
	    
 }