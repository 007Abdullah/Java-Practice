/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statice;

      
                
           

            

            
public class Partice {
            static int a = 5;
            static int b;
            Partice()
            {
               a++;
               b++;
            }
            
    public static void main(String[] args) {
        Partice obj = new Partice();
        obj.show();
        Partice obj1 = new Partice();
        obj1.show();
    }
    void show()
    {
        System.out.println("pagal han tha or rahay ga"+a);
        System.out.println("pagal han tha or rahay ga"+b);
    }
    
}
