package com.control.statements;

public class IfTest {

    public static void main(String[] args) {

        byte a=50;
        byte b=30;

        if(a>b){ // if block
            System.out.println("a is greater than b");
            if (true){
                System.out.println("Nested if condition");
            }
        }else if(a==b){
            System.out.println("a is equal to b");
        }else { // else block
            System.out.println("a is less than b");
        }

        // Enhanced if statement
        if(a>b) System.out.println("a is greater than b");

    }
}
