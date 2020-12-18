/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class Sam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number");
      int choice;
      choice = obj.nextInt();
       
        
        switch(choice)
        {
            case 1:
            {
                System.out.println("Monday");
                break;
            }
            case 2:
            {
                System.out.println("Thuesday");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday");
                break;
            }
            
            default:
                    {
                        System.out.println("ap nai number galat likha han");   
                    }
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
