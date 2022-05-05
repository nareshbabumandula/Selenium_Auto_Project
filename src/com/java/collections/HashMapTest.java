package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Hashmap contains Key and Value pairs where Keys are unique but the values can be duplicate
 * Hashmap allows one null key and multiple null values
 * Hashmap is non synchronized
 * Hashmap does not maintain insertion order
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Selenium");
        map.put(2, "UFT");
        map.put(3, "Tosca");
        map.put(4, "TestComplete");
        map.put(5, "Ranorex");
        map.put(6, "CodedUI");
        map.put(7, "UFT");
        map.put(1, "Cypress"); // Replaces the Key and Value of the previously added object
        map.put(null, "Blue Prism"); // Accepts only one null key
        map.put(null, "UI Path");
        map.put(8, null); // Accepts multiple null values
        map.put(9, null);


        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.remove(3);
        System.out.println(map.containsKey(2));
        System.out.println(map.get(5));
        System.out.println(map.size());

        Iterator<String> iter = map.values().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Iterator<Integer> iter1 = map.keySet().iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(10, "Sikuli");
        map1.put(11, "Winium");
        map.putAll(map1); // Merging 2 map objects

        // Iterating through a hashmap using enhanced for loop
        System.out.println("Iterating through a hashmap using enhanced for-each loop");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        // Iterate the map using for-each loop
        System.out.println("Iterating through a hashmap using for-each loop");
        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }

}
