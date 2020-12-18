/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partic;

/**
 *
 * @author MY PC
 */
public class Partic {

    
        
    public static void main(String[] args) {
        
          int value1 = 10;              
          int value2 = 40;
          
          
          if(value1 == value2) 
          {
              System.out.print("sameer value:");
              if (value2 == 5)
              {
                    System.out.println(""+value1);
              }
              else
              {
                    System.out.println("Sameer"+value2);
              }
          }
          else if(value1 == value2)
          {
              System.out.println("sorry value are not true");
          }
          else
          {
            System.out.println(value1 >= value2);  
          }
                           
            System.out.print("value1 != value2: ");               
            System.out.println(value1 != value2);               
            System.out.print("value1 > value 2: ");               
            System.out.println(value1 > value2);               
            System.out.print("value1 < value2:");               
            System.out.println(value1 < value2);               
            System.out.print("value1 <= value2: ");               
            System.out.println("value1 <= value2");
    }
}
