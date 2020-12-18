/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MY PC
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList(7);
      
//     s.toArray();
     
     s.add(0,45);
     s.add(1, 46);
     s.add(2, 47);
     s.add(3, 48);
     s.add(4, 49);
     s.add(5, 50);
     s.add(6, 51);
     s.ensureCapacity(7);
     s.add(2, 104644);
     s.lastIndexOf(s);
     s.remove(2);
     s.set(6, 4566);
    s.trimToSize();
     
     
    
    
     
     
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.lastIndexOf(s));
        System.out.println(s.size());
        
           System.out.println(Arrays.toString(s.toArray()));
          
        System.out.println(s.clone());//ya bata han jo humary pass obj ma value ho ge na copy karay ga
        System.out.println(s.contains(45));//contain bata han array obj ma ture han ya false
        
        
    }
    
}
