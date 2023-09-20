package com.access.modifers;

class AlphaNumericTest
{
    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

    public static void main(String[] args)
    {
        String s = "ABC123$";
        System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));
    }
}
