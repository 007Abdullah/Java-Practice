/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {
    
    public static void main(String[] args)
    {
        A obj = new A();
        Scanner obj1 = new Scanner(System.in);
        int a;
        a = obj1.nextInt();
        int b;
        b = obj1.nextInt();
        System.out.println(a+b);
    }
}
class A
{  
    int a;
    int b;

    void show()
    {
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
}