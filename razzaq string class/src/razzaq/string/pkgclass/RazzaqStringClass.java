/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razzaq.string.pkgclass;

import java.util.ArrayList;

/**
 *
 * @author MY PC
 */
public class RazzaqStringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String s = new String();
     s = "sameer";
        System.out.println(s.length());
        System.out.println(s.charAt(1)); 
        System.out.println(s.concat("pagal han"));
        System.out.println(s.compareTo("RAZZAQ"));//uni code 
        System.out.println(s.indexOf("s"));//index
        System.out.println(s.replace('s', 'A'));//replace
        System.out.println(s.subSequence(0, 6));//first index last index
        System.out.println(s.substring(3, 6));
        System.out.println(s.toString());
        System.out.println(s.trim());
        
        
        
    }
    
}
