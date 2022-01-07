package com.java.basics;

public class Parent{
	
	int age=30;
	String name="Ravi";
	
	void castingVote(int age) {
		if (age>=18) {
			System.out.println(name + " is eligible for voting");
		}else {
			System.out.println(name + " is not eligible for voting since the age is " + age);
		}
	}
	
	void display() {
		System.out.println("Executing display method from Parent class..!");
	}
	
	Parent(){
		System.out.println("This is a parent class constructor");
	}
	
	void demo() {
		System.out.println("Executing demo method from parent class..!");
	}
	

	public static void main(String[] args) {
		//CastingTest ct = new CastingTest();
		//ct.run();
	}

}


class Child extends Parent{
	
	void display() {
		System.out.println("Executing display method from Child class..!");
	}
	
	Child(){
		System.out.println("This is a child class constructor");
	}
	
	void demo() {
		System.out.println("Executing demo method from Child class..!");
	}
	
	
	public static void main(String[] args) {
		
		
		Parent p= new Child(); // Upcasting or Generalization or widening
		System.out.println(p.age);
		System.out.println(p.name);
		p.castingVote(17);
		p.display();
			
		//Child c = new Parent(); // Downcasting
		// Explictly we do downcasting by using a casting operator ()
		// Child c = (Child) new Parent(); // java.lang.ClassCastException
		Child c = (Child)p;
		System.out.println(c.age);
		System.out.println(c.name);
		c.castingVote(19);
		c.display();
		c.demo();
		
	}
	
}
