/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MY PC
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        b obj = new b();
        int add,multi;
        obj.getdata(25, 25);
        add = obj.add();
        multi = obj.multi();
        System.out.println("Addition   :"+  obj.add());
        System.out.println("MULTIPIly  :"+  obj.multi());
        
       
    }
    
}
//single inheritance
class sa
{
    int x,y;
    
    void getdata(int a, int b)
    {
        x = a;
        y = b;
        
    }
    int add()
    {
        System.out.println("ya methode super class sa a raha han");
        return(x+y);
    }
}
class b extends sa
 {
    int multi()
     {
         System.out.println("ya sub class ka methode han");
         return(x*y);
     }
}