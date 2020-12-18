/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a1,b1,c1,d1,w,r,f1;
        String g1 = "1";
        String e1 = "0";
        System.out.println(" WHat is pagal");
        a1 = "A";
        b1 = "B";
        c1 = "C";
        d1 = "D";
        w = "correct answeer";
        r = "wrong answer :";
        System.out.println(a1+":  MAIN");
        System.out.println(b1+":  NHI");
        System.out.println(c1+":  TUM");
        System.out.println(d1+":  HAN NA");
        System.out.print("ENter your choose : ");
        f1 = obj.next().intern();
        if (f1 == a1) {
            System.out.println(w);
            System.out.println(g1);
        }
        else 
        {
            System.out.println(r);
            System.out.println(e1);
        }
        String a2,b2,c2,d2,f2;
        String g2 = "1";
        String e2 = "0";
        System.out.println(" WHat is laptop");
        a2 = "A";
        b2 = "B";
        c2 = "C";
        d2 = "D";
        w = "correct answeer";
        r = "wrong answer :";
        System.out.println(a2+":  MAIN");
        System.out.println(b2+":  NHI");
        System.out.println(c2+":  TUM");
        System.out.println(d2+":  HAN NA");
        System.out.print("ENter your choose : ");
        f2 = obj.next().intern();
        if (f2 == b2) {
            System.out.println(w);
            System.out.println(g2);
        }
        else 
        {
            System.out.println(r);
            System.out.println(e2);
        }
        System.out.println("Total marks :");
        int  sum1  = Integer.valueOf(g1);
        int  sum2  = Integer.valueOf(g2);
        System.out.println(sum1+sum2);
        
       
       
        
        
        
        
        
        
        
        
        
    }
    
}
