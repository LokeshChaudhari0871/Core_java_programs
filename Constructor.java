package com.classes;

class Demo
{
			
	Demo ()
	{
		System.out.println("Hello");
	}
	Demo(String name)
	{
		System.out.println("Hello"+name);
		
	}
		
}
    public class Constructor {
		public static void main (String[]arg)
		{
			Demo d1=new Demo();
			Demo d2 = new Demo(" Lokesh");
		}

	

}
