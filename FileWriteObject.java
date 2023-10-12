package com.io;

import java.io.*;

public class FileWriteObject {

	public static void main(String[] args) throws IOException{
		FileOutputStream out= new FileOutputStream("Lokesh.txt");
		ObjectOutputStream fout=new ObjectOutputStream(out);
		
		fout.writeObject("Hello Lokesh ");
		fout.writeObject("How are You....? ");
		fout.writeObject("I am Fine... ");
		
		fout.close();
		System.out.println("Success");
		
		try {
			FileInputStream in = new FileInputStream("Lokesh.txt");
			ObjectInputStream fin =new ObjectInputStream(in);
			
			String n =(String) fin.readObject();
			System.out.println(n);
			
			
			n=(String) fin.readObject();
			System.out.println(n);
			
			fin.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
