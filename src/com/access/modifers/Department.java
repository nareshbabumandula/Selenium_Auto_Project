package com.access.modifers;

public class Department {
    static String dName;

    public Department(String dName) {
            this.dName =dName;
    }

    public static void main(String[] args) {
        Department d1 =new Department("MT-21");
        Department d2 =new Department("MT-22");
        System.out.println(d1.dName);

    }





}
