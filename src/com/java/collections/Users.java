package com.java.collections;

class Users {
    private int Id;
    private String Fname;
    private String Lname;
    private int Age;

    // No argument constructor
    public Users() {
    }

    // Parameterized constructor
    public Users(int id, String fname, String lname, int age) {
        this.Id = id;
        this.Fname = fname;
        this.Lname = lname;
        this.Age = age;
    }

    public int getId() {
        return Id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return Age;
    }

    // create a tostring method to display data
    public String ToString(){
        return this.Id+" "+this.Fname+" "+this.Lname+" "+this.Age;
    }
}