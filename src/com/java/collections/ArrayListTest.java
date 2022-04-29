package com.java.collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class ArrayListTest {

    /**
     * The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
     * The ArrayList class maintains the insertion order and is non-synchronized.
     * The elements stored in the ArrayList class can be randomly accessed. Consider the following example.
     * @param args
     */
    public static void main(String[] args) {

        // We can instantiate the list interface in different ways like below
        List <String> list1= new ArrayList();
        List <String> list2 = new LinkedList();
        List <String> list3 = new Vector();
        List <String> list4 = new Stack();

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Mounika");
        alist.add("Asif");
        alist.add("Sadhashiva");
        alist.add("Akhila");
        alist.add("Srilatha");
        alist.add("Mounika");

        // Traverse the arraylist via iterator
        Iterator iter = alist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        alist.remove(0);
        System.out.println("Printing the elements of arraylist after removing one element");
        Iterator iter1 = alist.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        list1.add("Triveni");
        list1.add("Jyoshna");

        alist.addAll(list1); // add both collections
        System.out.println(alist);
        System.out.println("Before clearing the list : " + alist.isEmpty());
        alist.clear();
        System.out.println(alist);
        System.out.println("After clearing the list : " + alist.isEmpty());


    }
}
