
package partice1;


public class Partice1 {

   
    public static void main(String[] args) {
       
    Ali obj = new Razzaq();
        
//    razzaq obj1 = new razzaq();
//    obj.main();
    
    }
    
}
class Ali
{
   void show()
    {
       int a = 4;
      int b = 4;
      int c;
      c = a+b;
        System.out.println("Partent clas constructure"+c);
       
    }
  
    Ali()
    {
       
       
        
      int a = 4;
      int b = 4;
      int c;
      c = a+b;
        System.out.println("Partent clas constructure"+c);
     
       
    }
   
//    void main()
//    {
//       
//        int a,b,c;
//        a = 4;
//        b = 4;
//        c = a+b;
//        System.out.println("Parent Class Methode"+c);
//    }
//    int pagal()
//    {
//        return(0);
//    }
}
class Razzaq extends Ali
{
    
     
    
Razzaq()
{
    super.show();
    int f,v,m;
        f = 4;
        v = 4;
        m = f*v;
        System.out.println("sub class multipy"+m);
  
  

    
}   
    
//    @Override
//    void main()
//    {
//        super.main();
//        int f,v,m;
//        f = 4;
//        v = 4;
//        m = f*v;
//        System.out.println("sub class multipy"+m);
//        
//        
//    }
//    
    
}