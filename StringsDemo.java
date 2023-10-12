package com.strings;

public class StringsDemo {

	public static void main(String[] args) {
		
		String s1 ="NAshik";
		String si ="NAshik";
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		String s4=s2.concat(s3);
		System.out.println(s4);
		
		System.out.println(s1.length());
		
		int a=s1.indexOf('k');
		System.out.println(a);
		System.out.println(s1.contains("ok"));
		System.out.println(s1.startsWith("N"));
		System.out.println(s1.endsWith("k"));
		
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.replace("k", "n"));
		
	}

}
