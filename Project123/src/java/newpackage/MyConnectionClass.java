package newpackage;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avantika
 */
public class MyConnectionClass {
    Connection con = null;
   public Connection connectMe()
{
       try
       {
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root",""); 
       
       }catch(Exception e){}
       
    return con;  
} 
}

