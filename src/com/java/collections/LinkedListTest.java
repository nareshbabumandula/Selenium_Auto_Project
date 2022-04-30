package com.java.collections;

import java.util.*;

public class LinkedListTest {

    /**
     * LinkedList implements the Collection interface. It uses a doubly linked list internally to
     * store the elements. It can store the duplicate elements. It maintains the insertion order
     * and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.
     */
    public static void main(String[] args) {

        // We can instantiate the list interface in different ways like below
        List <String> list2 = new LinkedList();
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("Mounika");
        llist.add("Asif");
        llist.add("Sadhashiva");
        llist.add("Akhila");
        llist.add("Srilatha");
        llist.add("Mounika");
        llist.add(null);
        llist.add(null);
        llist.set(0,"Akhila"); //index – index of the element to replace
        llist.add(0, "Naresh"); //index – index at which the specified element is to be inserted
        System.out.println(llist);
        System.out.println(llist.poll()); //Retrieves and removes the head (first element) of this list.
        System.out.println(llist);
        System.out.println(llist.peek()); //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(llist);
        System.out.println("Pop - Front of the list is : " + llist.pop()); //Returns: the element at the front of this list (which is the top of the stack represented by this list)
        System.out.println(llist);
        System.out.println(llist.peekFirst()); //Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        // Traverse the arraylist via iterator
        Iterator iter = llist.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        llist.remove(0);
        System.out.println("Printing the elements of linkedlist after removing one element");
        Iterator iter1 = llist.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        llist.add("Triveni");
        llist.add("Jyoshna");

        llist.addAll(llist); // add both collections
        System.out.println(llist);
        System.out.println("Before clearing the list : " + llist.isEmpty());
        llist.clear();
        System.out.println(llist);
        System.out.println("After clearing the list : " + llist.isEmpty());


    }
}
