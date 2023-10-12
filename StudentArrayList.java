package com.package1;

import java.util.ArrayList;


class Student
{
	int rollno;
	String name;
	float per;
	
	Student (int rollno, String name,float per) // para
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		
	}
	void displauy()
	{
		System.out.println("Rollno "+rollno+"Name "+name+"Per "+per);
	}
}

public class StudentArrayList {
	
	public static void main(String[]args)
	{
		Student s1=new Student(1,"admin",66);
		ArrayList<Student>a1=new ArrayList<Student>();
		a1.add(s1);
		Student s2=new Student (2,"abc",78);
		a1.add(s2);
		
		for(Student s:a1)
		{
			s.displauy();
		}
	}

}
