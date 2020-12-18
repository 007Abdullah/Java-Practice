/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.io.IOException;

/**
 *
 * @author MY PC
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{  
       throwableTest();  
   }catch(Exception e){  
    System.out.println("Cause : "+e.getCause());     
   }  
   }  
public static void throwableTest() throws Exception{  
        try{  
       int i=4/0;  
   }catch(ArithmeticException ae){  
      IOException ioe = new IOException();  
       throw (IOException)  
             ioe.initCause(ae);  
    }  
        
        
    }
    
}
