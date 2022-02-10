package com.control.statements;

public class DoWhileLoopTest {

    public void whileLoopExample(){

        int i=0;
        do{
            System.out.println("Iteration is : " + i);
            i++;
        }while(i<10);

    }

    public static void main(String[] args) {
        DoWhileLoopTest wlt = new DoWhileLoopTest();
        wlt.whileLoopExample();
    }
}
