package com.inheritance;

import java.util.Scanner;

class Student_I
{	
	int Seat_No;
	String Name;
	void Input_s ()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Student Seat no. , Name");
		Seat_No=sc.nextInt();
		Name=sc.next();
	}
	void Displays()
	{
		System.out.println("1)Seat_No: "+Seat_No+"\n2)Name: "+Name);
	}
	
}

class ICET extends Student_I
{
	int marks;
	 void Input_i()
	 {
		 System.out.println("Enter your ICET marks");
		 Scanner sc=new Scanner (System.in);
		 marks=sc.nextInt();
		 
	 }
	 void Show1()
	 {
		 System.out.println("Your Score at ICET is: "+marks);
		 
	 }
}

class GD_marks extends ICET
{
	int GD_marks;
	Scanner sc=new Scanner (System.in);
	void Take()
	{
		System.out.println("ENter your GD marks: ");
		GD_marks=sc.nextInt();
		
	}
	void Show()
	{
		System.out.println("Your marks at GD is: "+GD_marks);
		
	}
}

class Final extends GD_marks
{
	int Total;
	void Total1()
	{
		Total = (GD_marks + marks)/2;
		System.out.println("Total Score of Entrance is: "+Total);
	}
}
class Letter extends Final
{
	void show3 ()
	{
		
		if(Total>=66)
		{
			System.out.println("You are elegible");
		}
	}
}

public class Indira_CET {

	public static void main(String[] args)
	{
		
		Letter t=new Letter();
		t.Input_s();
		t.Displays();
		t.Input_i();
		t.Show1();
		t.Take();
		t.Show();
		t.Total1();
		t.show3();
	}

}
