package com.static_variable;

class Sample1
{
	 static char a=65; //------> 65 is acii value of A.
	void display ()
	{
		a++;
		System.out.println(a);
		
	}
}


public class Static_demo {

	public static void main(String[] args) 
	{ 
		Sample1 s1 =new Sample1();
		Sample1 s2 =new Sample1();
		Sample1 s3 =new Sample1();
		s1.display();
		s2.display();
		s3.display();
	}

}
