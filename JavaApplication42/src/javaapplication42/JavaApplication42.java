/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.ArrayList;

/**
 *
 * @author MY PC
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList a1 = new ArrayList();
       a1.add(5, a1);
      
        System.out.println(a1.addAll(a1, a1));
    }
    
}
