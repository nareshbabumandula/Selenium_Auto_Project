package com.exceptionhandling.example;

public class UncheckedException {

    public void uncheckedExceptionExample(){
        String[] names = {"mounika", "deepika", "soumya", "ram", "Kiran", "sudhir"};
        System.out.println("Length of the array is : " + names.length);
        System.out.println(names[0]);
        System.out.println(names[1]); // ArrayIndexOutofBoundsException
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);

        int a=100;
        int b=0;
        int c=a/b; // ArithmeticException: / by zero exception
        System.out.println(c);
    }

    public void uncheckedExceptionTryCatchExample(){
        boolean bFlag = false;
        String exception ="";
        try {
            String[] names = {"mounika", "deepika", "soumya", "ram", "Kiran", "sudhir"};
            System.out.println("Length of the array is : " + names.length);
            System.out.println(names[0]);
            System.out.println(names[7]); // ArrayIndexOutofBoundsException
            System.out.println(names[2]);
            System.out.println(names[3]);
            System.out.println(names[4]);
            System.out.println(names[5]);

            int a=100;
            int b=0;
            int c=a/b; // ArithmeticException: / by zero exception
            System.out.println(c);
            bFlag = true;

        }catch (Exception e){
            e.printStackTrace();
            exception = e.toString();
        }finally {
            if (bFlag){
                System.out.println("Successfully executed the method");
            }else{
                System.out.println("Failed to execute the method since - " + exception);
            }
        }
    }


    public static void main(String[] args) {

        UncheckedException uc = new UncheckedException();
        //uc.uncheckedExceptionExample();
        uc.uncheckedExceptionTryCatchExample();

    }
}
