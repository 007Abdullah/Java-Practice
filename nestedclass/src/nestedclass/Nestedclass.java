
package nestedclass;


public class Nestedclass {

    
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.inner sa = obj.new inner();
        sa.main(); 
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

class Outer 
{
    int a = 45;
     class inner
    {
        void main()
        {
            System.out.println("inner class"+a);
        }
    }
    
    
    
}