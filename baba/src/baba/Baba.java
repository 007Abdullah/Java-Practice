/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baba;

/**
 *
 * @author MY PC
 */
public class Baba {
    

    public static void main(String[] args) {
            shaikla obj = new shaikla();
            obj.show();
            
            int first = 10;                
            int second = 20;   
            System.out.println((first == 30) && (second == 20));        
            System.out.println((first == 30) || (second == 20));
            System.out.println((first == 152) && (second ==20));
              int value1 = 10;        
              int value2 = 20;        
              int result;        
              boolean someCondition = true;        
              result = someCondition ? value1 : value2;
            System.out.println(result);
    }
}
class shaikla
{
    
    int a = 15;
    int b = 55;
    int bhai = 45;
    int trt = 455;
    String c;
    int s = 1800;  
    void show()
    {
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+a*b*bhai*trt);
    }
}