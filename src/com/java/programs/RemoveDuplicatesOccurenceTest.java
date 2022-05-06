package com.java.programs;

import org.openqa.selenium.json.JsonOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicatesOccurenceTest {
    public static void main(String[] args) {

        String sText = "helloworld";
        char strArray[] = sText.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for(char c : strArray){
            set.add(c);
        }

        Iterator<Character> iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }


    }

}
