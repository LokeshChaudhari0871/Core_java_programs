package com.io;

import java.io.*;


class Student implements Serializable
{
	int rollno;
	String name;
	float per;

	Student(int rollno,String name,float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}

	void Display()
	{
		System.out.println("Roll no: "+rollno+"\nName: "+name+"\nPer: "+per);
	}
}
public class ObjectWriteStudent {

	public static void main(String args[])
	{
		try 
		{
			FileOutputStream out=new FileOutputStream("std.txt");
			ObjectOutputStream fout=new ObjectOutputStream(out);

			Student s1=new Student(11,"Lokesh",89);
			Student s2=new Student(12,"Himanshu",98);

			fout.writeObject(s1);
			fout.writeObject(s2);

			fout.close();
			System.out.println("Success\n------<>------<>------<>-----\n");

		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
	
		try 
		{	
			FileInputStream in= new FileInputStream("std.txt");
			ObjectInputStream fin=new ObjectInputStream(in);
			
			Student s1= (Student) fin.readObject();
			s1.Display();
			
			Student s2=(Student) fin.readObject();
			s2.Display();
			
			
			fin.close();
			System.out.println("\n----<>-------<>------<>-----");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	}
	
	
	
	














}
