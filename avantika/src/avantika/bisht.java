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
public class bisht {
   
private String teacher;
public bisht(String name)
{
teacher=name;
}
public void setName(String name)
{
teacher= name;
}
public String getName()
{
return teacher;
}
public void saying()
{
System.out.printf("my first teacher was %s\n", getName());
}
public void saying2()
{
System.out.printf("my second teacher was %s\n", getName());
}
}
