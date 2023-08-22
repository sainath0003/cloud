package com.epam.lamdas;

interface TestInterface {// Interface with static method

	public void square(int a);

	static void show() {
		System.out.println("Static Method Executed");
	}
}

public class TestClass1 implements TestInterface {

// Interface with static method
	public static void main(String args[]) {
		TestClass1 d = new TestClass1();
		d.square(4);

		TestInterface.show();
	}

	@Override
	public void square(int a) {
		System.out.println(a * a);
	}
}
