/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       char a[];
       a = new char[4];
       
       a[0] = obj.next().charAt(a[0]);
       a[1] = obj.next().charAt(a[1]);
       a[2] = obj.next().charAt(a[2]);
       a[3] = obj.next().charAt(a[3]);
     
       int b[];
       b = new int[5];
       b[0]=obj.nextInt();
       b[1]=obj.nextInt();
       b[2]=obj.nextInt();
       b[3]=obj.nextInt();
        
        System.out.println(Arrays.toString(a)+Arrays.toString(b));
    }
    
}
