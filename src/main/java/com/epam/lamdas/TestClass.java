package com.epam.lamdas;

public class TestClass implements TestInterface1, TestInterface2 {// multiple Inheritance with default methods
	public void show() {

		TestInterface1.super.show();

		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		TestClass d = new TestClass();
		d.show();
	}
}

interface TestInterface1 {
	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {

	default void show() {
		System.out.println("Default TestInterface2");
	}
}