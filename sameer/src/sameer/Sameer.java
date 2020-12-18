/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sameer;

/**
 *
 * @author MY PC
 */
public class Sameer {

    final double pi = 3.14;
    double radius = 2;
    double area;    
    
    
    
    public static void main(String[] args) {
        Sameer obj = new Sameer();
        obj.show();
        
    }
    void show()
    {
        area = pi*radius*radius;
        System.out.println(""+area);
    }
}
