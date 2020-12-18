/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

/**
 *
 * @author MY PC
 */
public class Session3 {
    
    
    

    public static void main(String[] args) {
        alpha obj = new alpha();
        obj.show();  
        alpha obj1 = new alpha();
         
        obj1.show(); 
        alpha obj2 = new alpha();
         
        obj2.show(); 
    
    }
    
}
class alpha
{
    static int a;
    static int b;

alpha()
{
    a =45;
    b++;
}
    void show()
    {
        System.out.println("ak baba"+a);
        System.out.println("ak sameer"+b);
    }
}