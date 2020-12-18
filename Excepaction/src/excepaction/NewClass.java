
package excepaction;

import java.util.Scanner;


public class NewClass {
    
    public static void main(String[] args) {
        a o = new a();
        o.main();
        Scanner obj = new Scanner(System.in);
        int a,b,d;
        a = obj.nextInt();
        b = obj.nextInt();
        d = a/b;
            
        try
        {
           if(d == 0)
           {
               System.out.println("devided by zero error");
           }
           else
           {
               System.out.println("the number divided by "+d);
           }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getCause());
           
        }
        
            int c = a+b;
            System.out.println("sum number"+c);
    }
    
    
    
    
    
    
    
}
class a
{
    private int a = 45;
    int d = 4;
    
   
    public void main()
    {
        System.out.println(a);
    }
}
class b extends a
{
    

  
    public void main(int p) {
       
        //To change body of generated methods, choose Tools | Templates.
        
        
    }

}