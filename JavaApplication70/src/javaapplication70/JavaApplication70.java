/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class JavaApplication70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner f1 = new Scanner(System.in);
        int a,b,chosse = 0;
        System.out.println("Enter a first number");
         a =f1.nextInt();
        Scanner f2 = new Scanner(System.in);
        System.out.println("Enter a Second number");
         b  = f2.nextInt();
        System.out.println("1:Addion");
        System.out.println("2:subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Subtraction");
        Scanner obj = new Scanner(System.in);
        chosse = obj.nextInt();
        System.out.println("YOur Select answer is : "+chosse);
        switch(chosse)
        {
            
            case 1:
            {
                int sum;
                sum = a+b;
                System.out.println(sum);
            }
            case 2:
            {
                int subtraction;
                subtraction = a-b;
                System.out.println(subtraction);
            }
            case 3:
            {
                int Multiplication;
                Multiplication = a*b;
                System.out.println(Multiplication);
            }
            case 4:
            {
                int Subtraction;
                Subtraction = a*b;
                System.out.println(Subtraction);
            }

        }
        
        
        
        
        
        
//        System.out.println(f1+""+f2+""+f3+""+sum);
        
//        if (f1 == f3) {
//            int sum;
//            sum = f1+f3;
//            System.out.println(sum);
//        }
//        else if (f1 != f3) {
//            int sub;
//            sub = f1-f3;
//            System.out.println(sub);
//        }
//        
//        int sum = Integer.valueOf(f2);
//        int a = f2+f1+f3;
//        System.out.println(a);
////        int f3,f4,sub;
////        System.out.println("Enter a FIrst number :");
////        f3 = obj.nextInt();
////        System.out.println("Enter a Second number :");
////        f4 = obj.nextInt();
////        sub = f3+f4;
////        System.out.println("sub answer is"+sub);
    }
    
}
