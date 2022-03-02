package com.exceptionhandling.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public void checkedExceptionExample() throws FileNotFoundException {
        String strFilePath = "C:\\Users\\nares\\Documents\\GitHub\\Selenium_Jan22\\Files\\Data123.txt";
        File file = new File(strFilePath);
        FileInputStream fis = new FileInputStream(file);
        System.out.println("After exception..!");
    }

    public void checkedExceptionTryCatchExample() {
        try {
            // try block
            String strFilePath = "C:\\Users\\nares\\Documents\\GitHub\\Selenium_Jan22\\Files\\Data123.txt";
            File file = new File(strFilePath);
            FileInputStream fis = new FileInputStream(file);
            int i = fis.read();
            System.out.println((char)i);
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
         }catch(Exception e){
            // catch block
            e.printStackTrace();
            System.out.println("After exception..!");
        }finally {
            System.out.println("Execution completed");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        CheckedException ce = new CheckedException();
        //ce.checkedExceptionExample();
        ce.checkedExceptionTryCatchExample();
    }
}
