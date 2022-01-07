package com.java.basics;

public class ArithmaticTest {
	
	int a=10;
	int b=20;
	
	// We create and use methods/functionality for code re-usability and security purposes
	// Method without arguments and without return type
	void addition() {
		System.out.println("Addition of a and b is : " + (a+b));
	}
	
	// Method with arguments and without return type
	void subtraction(int a, int b) {
		System.out.println("Subraction of a and b is : " + (a-b));
	}
	
	// Method without arguments and with return type
	int mutiplication() {
		return a*b;
	}
	
	// Method with arguments and with return type
	int division(int a, int b) {
		return b/a;
	}
	
	// Method without arguments and without return type
	int modulus() {
		return b%a;
	}

	public static void main(String[] args) {
		
		ArithmaticTest arth = new ArithmaticTest();
		arth.addition();
		arth.subtraction(30, 10);
		int res = arth.mutiplication();
		System.out.println("Return value from multiplication method is : " + res);
		int res1 = arth.division(3, 20);
		System.out.println(res1);
		int res2 = arth.modulus();
		System.out.println(res2);
				
	}

}
