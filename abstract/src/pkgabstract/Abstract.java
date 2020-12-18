
package pkgabstract;

import java.util.Scanner;


public class Abstract {

    public static void main(String[] args) {
        Male m = new Male();
       Scanner obj = new Scanner (System.in); 
       int chosse;
       chosse = obj.nextInt();
       Human s;
        if (chosse == 1 || chosse == 2) 
        {
            if (chosse == 1) 
            {
                s = new Female();
            }
            else
            {
                s = new Male();
            }
            s.main();
            s.talk();
            m.talk();
            
        }
        else
        {
            System.out.println("number not exit");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
abstract class Human
{
    
    abstract void talk();
    void main()
    {
        System.out.println("parent class methode");
    }
    
}
class Male extends Human
{
    @Override
    void talk()
    {
        System.out.println("Male mtb partent class talk");
    }    
}
class Female extends Human
{
    @Override
    void talk()
    {
        System.out.println("Female class han");
    }
}