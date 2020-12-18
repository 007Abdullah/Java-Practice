/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqs;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Mcqs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int a,b,c,d,f6,f7 = 0;
        String w,s;
        System.out.println("Where are you man ?");
        a = 1;
        b = 2;
        c = 3;
        w = "wrong answer";
        s = "correct answer";
        System.out.println(a+ ": HOME");
        System.out.println(b+ ": OUTSIDE");
        System.out.println(c+ ": RAZZAQ HOME");
        d = obj.nextInt();
        System.out.println("This anwer is : "+d);
        if (d == a) 
        {
            
            System.out.print(s);
            f6 = 0;
            f7 = d+f6;
            System.out.println(f7);
        }
        else
        {
            System.out.print(w);
            int o = 0;
            System.out.println(o);
        }
        int a1,b1,c1,d1,f1,f2 = 0;
        System.out.println("Where are you doing ?");
        a1 = 1;
        b1 = 2;
        c1 = 3;
        System.out.println(a+ ": kasi ho");
        System.out.println(b+ ": ache ho");
        System.out.println(c+ ": pagal ho");
        d1 = obj.nextInt();
        System.out.println("This anwer is : "+d);
        if (d1 == b1) 
        {
            
            System.out.print(s);
            f1 = -1;
            f2 = d1+f1;
            System.out.println(f2);
        }
        else
        {
            System.out.print(w);
            int f3 = 0;
            System.out.println(f3);
            
        }
        int result = f2+f7;
        System.out.println("TOTal marks :"+result);
    }
}
