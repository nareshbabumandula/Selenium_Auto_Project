package com.oops;

public interface RBI {

    abstract void accountOpening();
    abstract void accountClosing();
    abstract void minDeposit();
    abstract void maxDeposit();
    abstract void personalLoan();
    abstract void jointAccount();
    abstract void currentAccount();

    public default void goldloan(){
        System.out.println("gold loan facility is available..!");
    }

    static void carLoan(){
        System.out.println("Car loan facility is available");
    }


    public static void main(String[] args) {
       // RBI rb = new RBI();
        carLoan();
    }

}
