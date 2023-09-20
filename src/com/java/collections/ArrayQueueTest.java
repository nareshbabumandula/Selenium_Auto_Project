package com.java.collections;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueueTest {

    /**
     * ArrayQueue implements Deque interface
     * It allows to add or delete elements from both the ends
     * ArrayDeque is faster than ArrayList and Stack with no restriction on capacity
     */
    public static void main(String[] args) {

        ArrayDeque<String> aq = new ArrayDeque<String>();
        aq.add("Naresh");
        aq.add("Shyam");
        aq.add("Venkat");
        aq.add("Shiva");
        aq.add("Tejaswi");
        aq.add("Ramya");
        //pq.add(null);
        //pq.add(null);

        aq.remove(); // FIFO - Retrieves and removes the head of this queue
        
        System.out.println("Head is : " + aq.element());
        System.out.println("Head is : " + aq.peek());
        System.out.println(aq.poll());

        Iterator<String> iter = aq.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
