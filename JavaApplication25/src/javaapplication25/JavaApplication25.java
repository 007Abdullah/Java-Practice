
package javaapplication25;


public class JavaApplication25 {

    
    public static void main(String[] args) {
        alpha obj = new alpha();
        obj.add2(4, 5);
        
    }
    
}
class alpha
{ 
    private int add(int a,int b)
    {
       int c;
       c = a+b;
       return c;
    }
    public void add2(int a,int b)
    {
        alpha obj = new alpha();
        System.out.println(this.add(a, b));   
    }   
}