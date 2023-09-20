package com.java.collections;

import java.util.*;

/**
 * TreeSet uses a tree for storage. It is faster in terms of retrieval operations
 * It does not allow duplicate elements, it contains only unique elements
 * It maintains insertion order
 * Elements stored in TreeSet are sorted in ascending order
 * It does not allow null values
 * */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();

        TreeSet<String> set = new TreeSet<String>();
        set.add("ravi");
        set.add("ram");
        set.add("teju");
        set.add("ravi");
        set.add("Anil");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
