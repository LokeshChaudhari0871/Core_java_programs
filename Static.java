package com.static_variable;
class Sample
{
	static void display()
	{
		System.out.println("hello");
	}
}


public class Static {
	public static void main (String[]args)
	{
		//sample s1 = new sample(); ---------> this we use when we are not using static functions.
		Sample.display();  //------>When using static there is no need of making object.
		
		add(10,20);
		System.out.println(Math.pow(2, 3));
		
	}
	static void add (int a , int b)
	{
		System.out.println("Addition is "+(a+b)); // -------> You can call this without making object
		
	}
	static
	{
		System.out.println("this is from static function");// -----> This static function will execute before main function.
														   // ------> You can use this function only ones in program.
	}
}
