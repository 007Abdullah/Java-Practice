/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication88;
import java.io.*; 
/**
 *
 * @author MY PC
 */
public class JavaApplication88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

  
class GFG { 
  
    // Main Method 
    public static void main(String[] args) 
        throws Exception 
    { 
        
        try { 
                  divide(2/0); 
        } 
  
        catch (ArithmeticException e) { 
  
            System.out.println("Cause of Exception : "
                               + e.getCause()); 
        } 
    } 
  
    // method which divides two number 
    public static void divide(int a, int b) 
        throws Exception 
    { 
  
        // divide two numbers 
        int i = a / b; 
    } 
}
 
    
