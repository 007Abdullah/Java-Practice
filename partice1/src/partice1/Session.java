/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partice1;
import partice1.Employe;

/**
 *
 * @author MY PC
 */
public class Session extends Employe {
    
    public static void main(String[] args) {
        
        Employe obj = new Employe();
        obj.main();
        Employe obj1 = new Session();
        obj1.main();
        
    }
    @Override
   void main()
   {
       int a = 4;
       int b = 4;
       int d;
       d = a*b;
       System.out.println("Session class"+d);
   }
    
    
}
