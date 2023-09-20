package com.access.modifers;

class A{

        A(){
        this(20);
        System.out.println("10");
        }

        A(int a){
            System.out.println("20");
        }

        public static void main(String args[]){
            A a = new A();
        }
}
