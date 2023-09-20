package com.application.scripts;

import java.util.ArrayList;
import java.util.List;

public class Task {

    static List getList(List obj){
        System.out.println(obj);
        return obj;

    }
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("naresh");
        al.add("shiva");
        al.add("ravi");

       getList(al);
    }
}
