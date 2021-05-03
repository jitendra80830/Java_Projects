package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bms","root","root");    
            s =c.createStatement(); 
            System.out.println("success");
           
          
            
        }catch(Exception e){ 
            System.out.println("Not successe"+e);
        }  
    }
    public static void main(String[] args){
        new Conn();
    }
}  