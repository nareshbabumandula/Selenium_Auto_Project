package com.access.modifers;

public class Demo {

    public static void main(String[] args) {
        int counter,i,j,n = 10;

        for(j=2; j<n;j++){
            counter=0;
            for(i=1;i<=j;i++){
                if(j%i==0){
                    counter++;
                }
            }

            if(counter==2){
                System.out.println(j+ " ");
            }

        }
    }
}
