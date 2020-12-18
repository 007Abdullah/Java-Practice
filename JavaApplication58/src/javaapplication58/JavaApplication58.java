/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

import java.sql.Wrapper;

/**
 *
 * @author MY PC
 */
public class JavaApplication58 {
 public void calcResult(int num1, int num2, String choice){           
// Switch case to evaluate the choice       
     switch(choice) {           
         case "+": 
         System.out.println(“Result after addition is: “+                      (num1+num2));
         
                          break;           
         case “-”: 
         System.out.println("Result after subtraction is: "+                     (num1-num2));          
         break;           
         case "*": 
             System.out.println("Result after multiplication is: "+                     (num1*num2));  
         break; 
     }
   
    public static void main(String[] args) {
        if (args.length==3) 
        {
            
          int num1 = Integer.parseInt(args[0]);
          int num2 = Integer.parseInt(args[1]);
           JavaApplication58 obj = new JavaApplication58();
            obj.display(num1, num2, args[2]);   
        }
        
    }
    
     
     
        
        
    
            
            
            
            
            
    }
        
        
        
        
        
    
    

