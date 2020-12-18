/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arryloop;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Arryloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      
      int a[][];
      a = new int[2][2];
      int b[][];
      b = new int[2][2];
      int sum[][] = new int[10][10];
        System.out.println("Enter a First Martic");
        System.out.println("enter a first number");
      a[0][0] = obj.nextInt();
        System.out.println("Enter a Second number");
      a[0][1] = obj.nextInt();
      System.out.println("Enter a thired number");
      a[1][0] = obj.nextInt();
      System.out.println("Enter a four number");
      a[1][1] = obj.nextInt();  
        System.out.println("Enter a Scond Matric");
        System.out.println("ENter a First NUmber");
      b[0][0] = obj.nextInt();
        System.out.println("ENter a Second NUmebr");
      b[0][1] = obj.nextInt();
        System.out.println("ENetr a THirs NUmber");
      b[1][0] = obj.nextInt();
        System.out.println("Enter a Four Number");
      b[1][1] = obj.nextInt();
      
      int row;
      int col;
      for(row = 0;row < a.length;row++)
      {
        for(col = 0;col < a[row].length;col++)
        {
          
            sum[row][col] = a[row][col]+b[row][col];
            System.out.print(""+sum[row][col] +"\t");
            
//            System.out.print(a[col][row]+"\t");
        }
          System.out.println("");
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
