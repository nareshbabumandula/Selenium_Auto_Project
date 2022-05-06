package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurenceTest {
    public static void main(String[] args) {

        String sText = "helloworld";
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        char ch[] = sText.toCharArray();

        for(char c : ch){
            if(countMap.containsKey(c)){
                countMap.put(c, countMap.get(c)+1);
            }else{
                countMap.put(c,1);
            }
        }

        for(Map.Entry m: countMap.entrySet()){
            System.out.println(m.getKey() + " - " +m.getValue());
        }

    }

}
