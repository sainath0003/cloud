package com.epam.lamdas;

interface TestInterface4 {

	public void square(int a);

	// default method in interface
	default void show() {
		System.out.println("Default Method Executed");
	}
}

public class TestClass2 implements TestInterface4 {

	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		TestClass2 d = new TestClass2();
		d.square(4);

		// default method executed
		d.show();
	}
}
