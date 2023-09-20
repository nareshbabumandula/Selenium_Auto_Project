package com.io;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Demo {

    public static void main(String args[]) {
        Car c1 = new Car("Red");
        Car c2 = new Car("Yellow");
        Car c3= new Car("Green");
        //Car c4= new Car();
        System.out.println(c3.wheels);
    }
}

class Car{
    static int wheels;
    String color;
    Car(String color){
        this.color=color;
       wheels++;
    }

}


