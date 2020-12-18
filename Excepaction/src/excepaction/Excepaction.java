
package excepaction;


public class Excepaction {

    
    public static void main(String[] args) {
       
       
                
        
        
        
        
        
        
        
        
        
        
//        
//        sameer ex = new sameer();
//        ex.divide(45, 0);
//        
        
        
        int a = 20,b = 10,c = 10;
        try
        {
            int x = a/(b-c);
            System.out.println("ya rexcute ho gaya :" +x);
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj.getCause());
        }
        
        int y = a/(b+c);
        System.out.println("NO EXCEPTION ERROR  :" + y);
        
    }
    }
    

//class test
//{
//     public void divided(int num1,int num2) throws ArithmeticException
//        {
//            if(num2 == 0)
//            {
//                throw new ArithmeticException("Divided by zero ka error hN oke : "  );
//            }
//            else
//            {
//                 System.out.println("divided is: "+(num1 / num2));
//            }
//            System.out.println("Methode execution completed");
//            
//            
//        }
//    
    
    
//    
//    
//}




//class sameer
//{
//   
//        
//        void divide (int num1,int num2){
//      try{
//        System.out.println("the divded number :" +num1/num2);   
//        }
//      catch(Exception ex)
//      {
//          System.out.println("this msg :" +ex.getMessage());
//          
//      }
//    }
//}
    
    
    
    
    
    
    
