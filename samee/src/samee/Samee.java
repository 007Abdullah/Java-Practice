/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samee;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Samee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a,b,c,d,h;
        System.out.println("Whos is pagal");
        c = "correct answer";
        d = "wrong answer";
        a = "A";
        b = "B";
        System.out.println(a +" :nhi");
        System.out.println(b +" :han");
        h = obj.next().intern();
        if(h == a)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
    }
    
}
