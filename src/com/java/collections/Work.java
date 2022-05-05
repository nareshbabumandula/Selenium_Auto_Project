package com.java.collections;

import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Work {

    // create a method to get the connection
    public static Connection getConnection(){

        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/test_db", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void main(String[] args){

        // create the hashmap
        HashMap<Integer,Users> map = new HashMap<Integer,Users>();

        Statement st = null;
        ResultSet rs = null;
        Connection con = getConnection();
        Users u; // Has-A relationship

        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM users");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                int age = rs.getInt("age");

                u = new Users(id, fname,lname,age);

                // set data in the hashmap
                map.put(id, u);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        // display data from the hashmap
        for(Integer i : map.keySet()){
            Users us = map.get(i);
            System.out.println(us.getId()+" "+us.getFname()+" "+us.getLname()+" "+us.getAge());
        }

        // show data from hashmap using our ToString Method
        System.out.println("______With ToString______");
        for(Integer i : map.keySet()){
            Users us = map.get(i);
            System.out.println(us.ToString());
        }

        // now your data are displayed from mysql database using hashmap
    }
}