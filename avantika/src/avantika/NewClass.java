/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avantika;

/**
 *
 * @author avantika
 */
class faculty {
        float salary=30;

    
}
class science extends faculty{
    float bonous=2;
    public static void main(String args[])
    {
        science obj=new science();
        System.out.println("salary ="+obj.salary);
        System.out.println("bonus="+obj.bonous);
    }}
        
   