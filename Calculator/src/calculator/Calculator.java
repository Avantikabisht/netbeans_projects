package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
method overloading
 */

public class Calculator {
   
    void sum(int a,int b,int c)
    {
        int d=a+b+c;
        int e=a*b*c;
        System.out.println(d+" "+e);
    }
    void sum(int a,int b)
    {
        int j=a+b;
        int m=a*b;
        int q=a/b;
        int w=a%b;
        System.out.println(j);
          System.out.println(m);
            System.out.println(q);
              System.out.println(w);
    }
     /* @param args the command line arguments
     */
    public static void main(String[] args)
   
    
    { Calculator om =new Calculator();

om.sum(2,5,7);
om.sum(14,2);// TODO code application logic here
    }}
    

