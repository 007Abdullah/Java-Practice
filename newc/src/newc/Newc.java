
package newc;


public class Newc {

   
    public static void main(String[] args) {
       Ali obj = new Ali();
       sameer emp = new sameer();
       obj.add();
       obj.multi();
//        Ali s = (Ali)emp;   
    }  
}
class sameer
{
    int a = 10;
    int b = 10;
    int c;
    void add(){
      int x;
      int y;
      x = a;
      y = b;
      c  = x+y;
      System.out.println(c);
    }
}
class Ali extends sameer
{
    void multi()
    {
      int d =a*b;  
      System.out.println(d);
    }  
}
