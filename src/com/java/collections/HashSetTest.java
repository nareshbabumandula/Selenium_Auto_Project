package com.java.collections;

import java.util.*;

/**
 * HashSet implements Set interface
 * It does not allow duplicate elements, it contains only unique elements
 * It does not follow insertion order
 * It uses hash table for storage of elements
 * */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();

        s1.add("Ramya");
        s1.add("Seerath");
        s1.add(null);
        s1.add(null);

        HashSet<String> set = new HashSet<String>();
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
