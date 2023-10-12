package com.inheritance;

interface A1 {
	void display();

}

interface B extends A1 {
	void addition(int a, int b);

}

interface C extends B {
	void multi(float a, float b);
}

class Demo implements C {

	@Override
	public void multi(float a, float b) {
		System.out.println("Multiflication is: " + (a * b));

	}

	@Override
	public void addition(int a, int b) {

		System.out.println("Addition is: " + (a + b));
	}

	@Override
	public void display() {
		System.out.println("Hello");

	}

}

public class InterfaceDemo {
	public static void main(String args[]) {
		Demo d1 = new Demo();

		d1.addition(34, 1);
		d1.multi(3.43f, 4.4f);
	}
}
