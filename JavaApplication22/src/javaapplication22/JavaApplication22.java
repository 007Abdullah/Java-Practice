/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       alpha obj = new alpha();
        System.out.println("Enter a First Number");
       Scanner i = new Scanner(System.in);
       int c;
       c = i.nextInt();
         obj.add2();
    }
    
}
class alpha
{
    
    
    private int add(int a,int b,int d,int h)
    {
        int c;
        int m;
        int x;
        m = d * h;
        c = a + b;
        x = m*c;
        return x;
        
        
    }
    public void add2()
    {
        alpha obj = new alpha();
         int c;
        System.out.println(""+this.add(2, 2,2, 2));
    }
    
    
    
    
}