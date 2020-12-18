/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;



public class JavaApplication33 {
    private static int[][] b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int add[][] = new int[10][10];
        int a[][];
        a = new int[2][2];
        System.out.println("Enter First number: ");
        a[0][0] = obj.nextInt();
        System.out.println("Enter a Second Number: ");
        a[0][1] = obj.nextInt();
        System.out.println("Enter a thired number: ");
        a[1][0] = obj.nextInt();
        System.out.println("Enter a four number: ");
        a[1][1] = obj.nextInt();
        
        
        b = new int[2][2];
        System.out.println("Enter First number: ");
        b[0][0] = obj.nextInt();
        System.out.println("Enter a Second Number: ");
        b[0][1] = obj.nextInt();
        System.out.println("Enter a thired number: ");
        b[1][0] = obj.nextInt();
        System.out.println("Enter a four number: ");
        b[1][1] = obj.nextInt();
        
        
        int row;
        int col;
        for( row = 0;row < a.length;row++)
        {
            for(col = 0;col < a[row].length;col++)
            {
                add[row][col] = a[row][col] + b[row][col];
                System.out.print(add[row][col]+ "\t");
//                System.out.print(a[row][col]+"\t");
            }
            System.out.println("");
        }   
//////////////////////////////                int r;
//////////////////////////////        int c;
//////////////////////////////        for( r = 0;r < b.length;r++)
//////////////////////////////        {
//////////////////////////////            for(c = 0;c < b[r].length;c++)
////////////////////////////            {
////////////////////////////                add[r][c] = a[r][c] + b[r][c];
////////////////////////////                System.out.print(b[r][c]+"\t");
////////////////////////////               
////////////////////////////            }
////////////////////////////            System.out.println("");
////////////////////////////        }
////////               
    }
}