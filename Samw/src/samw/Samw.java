/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samw;

/**
 *
 * @author MY PC
 */
public class Samw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        int j;
        outer :
        for(i=1;i<=10;i++)
        {
             System.out.println("");
            if(i == 5)
            {
               break;
            }
            for(j=1;j<=5;j++)
            {
                System.out.print("*");
                if(i == j)
                {
                    continue outer;
                }
            }
        }
        
        
        
    }
    
}
