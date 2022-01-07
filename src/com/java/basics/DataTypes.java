package com.java.basics;

public class DataTypes {

	public static void main(String[] args) {
		// Java is case sensitive language
		// Primitive data types
		// Always use Ctrl+Spacebar for completing the syntax
		// Run the Java Application - Click on Run button in toolbar/Right on Source Code->Run As->Java Application/Ctrl+F11
		byte b=127;
		short s=2145;
		int i=434636;
		long l=366784;
		float f=13.6f;
		double d=436.756;
		char c='t';
		boolean bflag=true;
	
		System.out.println("Byte value of b is : " +b);
		System.out.println("Short value of s is : " +s);
		System.out.println("Integer value of i is : "+i);
		System.out.println("Long value of l is : "+l);
		System.out.println("Char value of c is : "+c);
		System.out.println("Float value of f is : "+f);
		System.out.println("Double value of d is : "+d);
		System.out.println("Boolean value of bflag is : "+bflag);
		
		//Type casting: It is nothing but converting one type of primitive data into another primitive type
		// Widening/Automation conversion: Converting the smaller datatype to the bigger datatype
		//e.g. byte->short->int->long->float->double
		byte b1=125;
		short s1=b1; //Widening/Automation conversion
		System.out.println(b1 + " " + s1);
		
		// Narrowing/Explicit casting: Converting the bigger datatype to the smaller datatype: double->float->long->int->short->byte
		int i1=129;
		//byte b2=i1; //Compilation error - Unresolved compilation problem
		byte b2=(byte)i1;
		System.out.println(i1 + " " +b2);
		
		//Wrapper classes - Pre-defined java classes for all the primitive datatypes exists
		System.out.println("Min value of byte is : "+ Byte.MIN_VALUE);
		System.out.println("Max value of byte is : "+ Byte.MAX_VALUE);
		System.out.println("Size allocated for Byte container is : " + Byte.SIZE + " bits");
		System.out.println("Min value of short is : "+ Short.MIN_VALUE);
		System.out.println("Max value of short is : "+ Short.MAX_VALUE);
		System.out.println("Size allocated for Short container is : " + Short.SIZE + " bits");
		System.out.println("Min value of long is : "+ Long.MIN_VALUE);
		System.out.println("Max value of long is : "+ Long.MAX_VALUE);
		System.out.println("Size allocated for long container is : " + Long.SIZE + " bits");
	}

}
