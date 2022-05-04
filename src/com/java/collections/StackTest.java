package com.java.collections;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackTest {

    /**
     * Stack is a subclass for Vector. It follows L-I-F-O data structure
     * It is non synchronized.
     * Maintains insertion order
     * @param args
     */
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.add("mounika");
        stack.add("hari");
        stack.add("soumya");
        stack.add("Bhanu");
        stack.add("John");
        stack.add("Jyoshna");
        stack.add("Seerath");
        stack.add("Akhila");
        stack.add("John");
        stack.add(0, "Triveni");
        System.out.println(stack.capacity());
        System.out.println(stack.isEmpty());
        stack.add(null);
        stack.add(null);
        stack.add("naresh");
        stack.push("Srilatha"); //Pushes an item onto the top of this stack
        stack.pop(); //Removes the object at the top of this stack and returns that object as the value of this function
        System.out.println(stack.contains("Akhila"));

        Iterator<String> iter = stack.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        // Enhanced for loop
        for(String data:stack){
            System.out.println("Value is : " + data);
        }

        // lambda expression on collection to iterate
        stack.forEach((n)-> System.out.println(n));

        // Stream filter
        System.out.println("Applying filter condition on a vector collection");
        stack.stream().filter(n->n.startsWith("m")).forEach(System.out::println);
    }
}
