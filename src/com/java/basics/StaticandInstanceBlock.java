package com.java.basics;

public class StaticandInstanceBlock {
	
	// static block
	static {
		System.out.println("This is a static block..!");
	}
	
	// Instance block
	{
		System.out.println("This is an instance block..!");
	}

	// Constructor
	public StaticandInstanceBlock() {
		System.out.println("This is a no argument constructor..!");
	}
	
	
	public static void main(String[] args) {
		StaticandInstanceBlock sib= new StaticandInstanceBlock();

	}

}
