/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsuper;

/**
 *
 * @author MY PC
 */
public class Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    B obj = new B(25,45);
    obj.disp();
        
    }
    
}
class A
{
    int no;
   void meassger()
   {
       System.out.println("Super class number is "+no);
   }
}
class B extends A
{  

    int no;

B(int a,int b)
{
    super.no = a;
    this.no = b;
}
    @Override
  void meassger()
  {
      System.out.println("sub classs"+no);
  }
  void disp()
  {
      super.meassger();
      this.meassger();
  }
     
    
}