package com.inheritance;
class A12
{
	int a=100;
	A12(int rollno)
	{
		System.out.println("In A "+rollno);
	}
	
}

class B12 extends A12
{
	int a=200;
	B12(int rollno,String name)
	{
		super(rollno);
		System.out.println("In B"+name);
		System.out.println("a= "+super.a);
	}
}
public class SingleInheritanceConstr 
{
	
	public static void main(String []args)

	{
		B12 b1=new B12(11,"admin");
		
	}
}
