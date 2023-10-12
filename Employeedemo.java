package com.classes;

import java.util.Scanner;

class Employee {
	int employee_code;
	String name;
	float sal;

	void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee code, name ,sal");
		employee_code = sc.nextInt();
		name = sc.next();

		sal = sc.nextFloat();
	}

	void display() {

		System.out.println("s 1)Employee code: " + employee_code
				+ "\n 2)Employee name: " + name + "\n 3)Employee salary: "
				+ sal);
	}
}

public class Employeedemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.input();
		e1.display();

	}

}
