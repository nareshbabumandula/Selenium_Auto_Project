package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

    /**
     * Vector uses a dynamic array to store the data.
     * It has an additional methods which are not available in ArrayList and also in Collection framework.
     * It is non synchronized.
     * Maintains insertion order
     * @param args
     */
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();
        vec.add("mounika");
        vec.add("hari");
        vec.add("soumya");
        vec.add("Bhanu");
        vec.add("John");
        vec.add("Jyoshna");
        vec.add("Seerath");
        vec.add("Akhila");
        vec.add("John");
        vec.add(0, "Triveni");
        System.out.println(vec.capacity());
        System.out.println(vec.isEmpty());
        //vec.add(null);
        //vec.add(null);
        System.out.println(vec.contains("Akhila"));

        Iterator<String> iter = vec.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        // Enhanced for loop
        for(String data:vec){
            System.out.println("Value is : " + data);
        }

        // lambda expression on collection to iterate
        vec.forEach((n)-> System.out.println(n));

        // Stream filter
        System.out.println("Applying filter condition on a vector collection");
        vec.stream().filter(n->n.startsWith("J")).forEach(System.out::println);
    }
}
