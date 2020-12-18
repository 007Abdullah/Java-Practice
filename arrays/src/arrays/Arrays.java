/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         int a[][];
        a = new int[2][2];
        int b[][];
        b = new int [2][2];
        int sum [][];
        sum = new int [2][2];
        System.out.println("Enter a First martix");
        System.out.println("ENter a First number ");
        a[0][0] = obj.nextInt();
        System.out.println("enter a second number");
        a[0][1] = obj.nextInt();
        System.out.println("ENter a thired number");
        a[1][0] = obj.nextInt();
        System.out.println("enter a four number");
        a[1][1] = obj.nextInt();
        System.out.println("End first martix");
        System.out.println("Start Second martix ");
        System.out.println("ENter a fiorst number");
        b [0][0] = obj.nextInt();
        System.out.println("Enter a Second Number");
        b [0][1] = obj.nextInt();
        System.out.println("Enter A thired Numebr");
        b [1][0] = obj.nextInt();
        System.out.println("Enter a four numbenr");
        b [1][1] = obj.nextInt();
        
        int row,col;
        for (row = 0; row < a.length; row++)
        {
            for (col = 0; col < a[row].length;col++)
            {
               
               sum[row][col] = a[row][col] + b[row][col];
                System.out.print(sum[row][col]+"\t");
            }
            System.out.println(" ");
        }
        
        
        
        
        
        
        
        
        

        
        
        
    }
    
}
