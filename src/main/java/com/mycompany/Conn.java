
package com.mycompany;

import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project1","root","root");
            System.out.println("connected");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new Conn();
    }
    
}
