package com.java.basics;

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new NumberPrinter("Thread 1");
        Thread thread2 = new NumberPrinter("Thread 2");
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class NumberPrinter extends Thread {
    private String threadName;
    
    public NumberPrinter(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                // Sleep for a random amount of time (0-999 milliseconds)
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

