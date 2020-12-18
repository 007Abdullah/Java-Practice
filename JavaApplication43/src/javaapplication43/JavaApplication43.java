/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author MY PC
 */
public class JavaApplication43 {

    
    
    
    
    
    public static void main(String[] args) {
         ArrayLists obj = new ArrayLists(); 
        ArrayList s = new ArrayList();
        Iterator imarks = s.iterator();
        
        s.add(45);
        s.add(58);
        s.add(85);
        
        System.out.println("Marks Are");  
        System.out.println("Itractor list Form the For loop");
        int i;
        for (i = 0; i < s.size(); i++) 
        {
            System.out.println(s.get(i));
        }
        System.out.println("Iterating ArrayList using Iterator:");        
        while (imarks.hasNext()) 
        {
            // line 4           
            System.out.println(imarks.next());          
                // line 5        }      
            System.out.println("-------------------------------------");            
        
             
        } 
        
        
        
    }
    
}

