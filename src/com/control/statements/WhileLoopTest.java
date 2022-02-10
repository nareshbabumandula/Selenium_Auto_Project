package com.control.statements;

public class WhileLoopTest {

    public void whileLoopExample(){
        int i=0;
        while(i<10){
            System.out.println("Iteration is : " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        WhileLoopTest wlt = new WhileLoopTest();
        wlt.whileLoopExample();
    }
}
