package com.java.basics;

public class ArraysTest {

    public static void main(String[] args) {

        int score[]; // array declaration
        score = new int[]{10,20};
        System.out.println(score[0]);
        int[] ranks = new int[4]; // array initialization
        ranks[0]=1;
        ranks[1]=2;
        ranks[2]=3;
        ranks[3]=4;
       // ranks[4]=5; // exception - ArrayIndexOutOfBoundsException: 4

        for(int rank: ranks){
            System.out.println("Rank is : " + rank);
        }

        int marks[] = {45,55,75,90,80};
        System.out.println(marks.length);
        for(int i=0;i<=marks.length-1;i++){
            System.out.println("Value found is  : " +  marks[i]);
        }
        for(int mark : marks){
            System.out.println(mark);
        }

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        marks[5]=100;
        System.out.println(marks[5]); // exception
    }
}
