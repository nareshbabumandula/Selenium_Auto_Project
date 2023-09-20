package com.application.scripts;

import jdk.swing.interop.SwingInterOpUtils;

public class Sample{


    public static void main(String []args){
        String s="BAAABAB";
        int len=s.length(), left_B=0, right_A=0, ans;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A') right_A++;
        }
        ans=right_A;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A') right_A--;
            else left_B++;
            ans=Math.min(ans, right_A+left_B);
        }
        System.out.println(ans);

    }

}