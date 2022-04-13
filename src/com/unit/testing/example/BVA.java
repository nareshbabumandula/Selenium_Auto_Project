package com.unit.testing.example;

public class BVA{

   public static boolean verifyUserRegistration(String USERNAME){

        boolean bFlag = false;

        if(!(USERNAME.length()>=4)|| !(USERNAME.length()<=16)){
            System.out.println("Username should be minimum 4 characters and maximum 16 characters");
        }else{
            bFlag = true;
        }

       return bFlag;
   }

}
