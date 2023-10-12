package com.strings;

public class StringBufferDemo {
	
			public static void main(String []args)
			{

			StringBuffer s1 = new StringBuffer("Nashik");
			System.out.println(s1);
			
			s1.append("Pune");
			System.out.println(s1);
			s1.append(1234);
			System.out.println(s1);
			s1.insert(6,"Java");
			System.out.println(s1);
			
			s1.deleteCharAt(2);
			System.out.println(s1);
			s1.delete(6, 9);
			System.out.println(s1);
			
			s1.replace(6, 10, "Mumbai");
			System.out.println(s1);
			
			s1.reverse();
			System.out.println(s1);
			}
			
}
