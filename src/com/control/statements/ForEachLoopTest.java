package com.control.statements;

public class ForEachLoopTest {

    public void forEachExample(){
        int[] Marks ={10,20,30,60,75,55};

        for(int m : Marks){
            System.out.println(m);
            if(m==60) break;
        }

    }

    public static void main(String[] args) {
        ForEachLoopTest flt = new ForEachLoopTest();
        flt.forEachExample();
    }

}
