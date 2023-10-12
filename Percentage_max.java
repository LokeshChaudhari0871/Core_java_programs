package com.classes;

import java.util.Scanner;

class Student_Top {
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
				+ "  \n3)Percentage: " + per);
	}
}

public class Percentage_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_Top s[] = new Student_Top[3];
		float max;
		for (int i = 0; i <= 2; i++) {
			s[i] = new Student_Top();
			s[i].input();
		}

		for (int i = 0; i <= 2; i++) {
			s[i].display();
		}

		// for max percentage and print
		max = s[0].per;
		int pos = 0;
		for (int i = 0; i <= 2; i++) {

			if (s[i].per > max) {
				max = s[i].per;
				pos = i;
			}

		}
		System.out.println("\nMax percentage is : " + max);
		s[pos].display();
	}

}
