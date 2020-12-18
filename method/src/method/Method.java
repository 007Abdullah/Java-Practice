/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author MY PC
 */
public class Method {
    private static Object obj1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sameer obj = new sameer();
        obj.add2();
       
        

        
    }
    
}
class sameer
{
    float a = 4;
    float b = (byte)a;  
            
   private int add(int a, int b)
   {
       int c;
       c= a*b;
       return c;
   }
   public void add2()
   {
       System.out.println(this.add(5, 4));  
      
      
   }
   
}