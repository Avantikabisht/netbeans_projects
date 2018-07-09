/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author avantika
 */
public class A implements NewInterface {
    public A()
            
    {}
    public A(NewInterface i)
    {
        if(i instanceof B){
        
        i.show();
    } 
        else
        {
            display();
        }
    }
    public void display()
    {
        System.out.println("u r in a");
    
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
