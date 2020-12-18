/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          Scanner obj = new Scanner(System.in);
          int a;
          int j = 0;
          a = obj.nextInt();
//          while(j <= 10)
//          {
//             System.out.println(a+"*"+j+"="+a*j);
//             j++;
//
//          }
          for(j = 0;j<=10;j++ )
          {
              System.out.println(a+"*"+j+"="+a*j);
          }
          for(j=1;j<=45;j++)
          {
              System.out.println("");
          }
         
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
