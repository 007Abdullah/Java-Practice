/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagal;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Pagal {

  
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int first; 
         int result;
       
        first = obj.nextInt();
        System.out.println("enter a first number");
         result = first % 2;
         if(result == 0)
        {
            System.out.println("even number");   
        }
         else
         {
             System.out.println("odd number ");
         }
        
        
        
     
    }
    
}


             