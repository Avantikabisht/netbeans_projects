package newpackage;


import newpackage.MyConnectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avantika
 */
public class Getdata {
    ResultSet rs=null;
    public ResultSet data(){
        try{
       Connection con = new MyConnectionClass().connectMe();
       Statement s=con.createStatement();
        rs=s.executeQuery("select * from login");
        }catch(Exception e){}
        return rs;
        
    }

   
    
}
