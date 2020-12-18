/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author MY PC
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    recangle obj = new recangle();   
        recangle obj1 = new recangle(1,5);
        
        
        
        
        
        
        
        
        
    }
    
}
class recangle
{
    
    private int h;
    private int w;
   
    
    
    recangle()
    {
       h = 10;
       w = 12;
       
        System.out.println("Constructor invoked");
        System.out.println(this.h+this.w);
        
    }
    recangle(int h,int w)
    {
             this.h = h;
             this.w = w;
             
             System.out.println(this.h);
             System.out.println(this.w);
        
        
    }
    
}