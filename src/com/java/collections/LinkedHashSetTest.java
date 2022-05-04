package com.java.collections;

import java.util.*;

/**
 * LinkedHashSet represents the Linkedlist implemetation
 * It does not allow duplicate elements, it contains only unique elements
 * It maintains insertion order
 *
 * */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();

        s1.add("Ramya");
        s1.add("Seerath");
        s1.add(null);
        s1.add(null);

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("ravi");
        set.add("ram");
        set.add("teju");
        set.add("ravi");
        set.addAll(s1);


        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
