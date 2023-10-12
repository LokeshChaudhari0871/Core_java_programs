package com.classes;

import java.util.Scanner;

class Student_Sort {
	int rollno;
	String name;
	float per;

	void input() {
		System.out
				.println("Enter roll mumber, name and percentage of student: ");
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		name = sc.next();
		per = sc.nextFloat();
	}

	void display() {
		System.out.println("1)Roll number: " + rollno + "\n 2)name: " + name
				+ "  \n3)Percentage: " + per + "\n\n");
	}
}

public class Sorting_Per {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_Top s[] = new Student_Top[3];
		float max;
		for (int i = 0; i <= 2; i++) {
			s[i] = new Student_Top();
			s[i].input();
		}
		for (int i = 0; i < s.length; i++) {
			s[i].display();
		}

		// --sorting by per

		System.out.println("\n_______sorting per ________");
		Student_Top temp = new Student_Top();
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++)
			{
				if (s[j].per < s[j + 1].per)
				{
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}

			}

		}

		for (int i = 0; i < 3; i++) {
			s[i].display();
		}

	}

}
