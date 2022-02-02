package com.java.basics;

public class DataTypes {
	// Instance variables
	int i;
	byte b;
	float f;
	double d;
	char c;
	boolean b1;
	long l;
	short s;

	public static void main(String[] args) {
		// Java is high level and case-sensitive programming language
		// Primitive data types in Java
		// Always use Ctrl+Space for completing the syntax
		// Run the Java Application - Click on Run button in toolbar/Right on Source Code->Run As->Java Application/Ctrl+F11
		byte b=121;
		short s=2149;
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
		short s1=b1; //Widening/Automation conversion or Implicit casting
		System.out.println(b1 + " " + s1);
		
		// Narrowing/Explicit casting: Converting the bigger datatype to the smaller datatype: double->float->long->int->short->byte
		short s2=130;
		//byte b2=s2; //Compilation error - java: incompatible types: possible lossy conversion from short to byte
		byte b2= (byte) s2;
		System.out.println(s2 + " " +b2);

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

		short s3 = 64;
		char c2 = (char) s3; // ASCII values (a-z - 97 to 114 and A-Z 63 to 90)
		System.out.println(s3 + " " + c2);

		byte b3 = 122;
		double d3 = b3;
		float f3 = b3;
		System.out.println(b3+ " " + d3);
		System.out.println(b3+ " " + f3);

		// Create an object reference for our class
		// ClassName objRef = new Constructor();
		DataTypes dt = new DataTypes();
		System.out.println("Default value of integer is : " + dt.i);
		System.out.println("Default value of byte is : " + dt.b);
		System.out.println("Default value of float is : " + dt.f);
		System.out.println("Default value of double is : " + dt.d);
		System.out.println("Default value of long is : " + dt.l);
		System.out.println("Default value of char is : " + dt.c);
		System.out.println("Default value of boolean is : " + dt.b1);
		System.out.println("Default value of short is : " + dt.s);

		// Non primitive data types
		String sText = "hello world";
		System.out.println(sText);
		sText = "hello";
		System.out.println(sText);

	}

}
