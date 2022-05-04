package com.java.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    /**
     * PriorityQueue Deque does not maintain insertion order when it comes to retrieval since the
     * elements or objects are processed based on their priorities
     * PriorityQueue does not allow null values
     * PriorityQueue is also non synchronized
     * @param args
     */
    public static void main(String[] args) {

        Queue<String> q1 = new PriorityQueue<>();
        Queue<String> q2 = new ArrayDeque<>();


        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Naresh");
        pq.add("Shyam");
        pq.add("Venkat");
        pq.add("Shiva");
        pq.add("Tejaswi");
        pq.add("Ramya");
        //pq.add(null);
        //pq.add(null);
        pq.remove(); // FIFO - Retrieves and removes the head of this queue

        System.out.println("Head is : " + pq.element());
        System.out.println("Head is : " + pq.peek());
        System.out.println(pq.poll());

        Iterator<String> iter = pq.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}
