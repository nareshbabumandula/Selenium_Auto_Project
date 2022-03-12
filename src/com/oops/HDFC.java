package com.oops;

public class HDFC implements RBI{

    public void accountOpening() {
        System.out.println("accountOpening facility is available");
    }


    public void accountClosing() {
        System.out.println("accountClosing facility is available");
    }


    public void minDeposit() {
        System.out.println("minDeposit is 500 rupees");
    }


    public void maxDeposit() {
        System.out.println("minDeposit is 1 crore rupees with PAN CARD");
    }


    public void personalLoan() {
        System.out.println("personalLoan facility is available");
    }


    public void jointAccount() {
        System.out.println("jointAccount facility is available");
    }


    public void currentAccount() {
        System.out.println("currentAccount facility is available");
    }

    public static void main(String[] args) {
        HDFC hd = new HDFC();
        hd.accountOpening();
        hd.minDeposit();
        hd.maxDeposit();
        hd.personalLoan();
        hd.goldloan(); // default method of an interface
        hd.jointAccount();
        hd.accountClosing();
        RBI.carLoan();


    }
}
