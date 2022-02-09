package com.control.statements;

public class SwitchTest {

    public static void main(String[] args) {

        String day = "   Thur";

        switch (day.toLowerCase().trim()){
            case "sun":
                System.out.println("Sunday");
                break;
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu": case "thur":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day..!");
        }
    }
}
