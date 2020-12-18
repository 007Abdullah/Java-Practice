/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplh;

import java.util.Arrays;

/**
 *
 * @author MY PC
 */
public class Aplh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[][];
       a = new int[2][2];
       a[0][0] = 45;
       a[1][0] = 4;
       a[2][1] = 5;
       a[3][2] = 455;
              
       int v;
       int c;
       for(v = 0;v < a.length;v++)
       {
           for(c = 0; c < a.length;c++)
           {
               System.out.println(Arrays.toString(a));
           }
           System.out.println(" ");
       }
       
       
       
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
