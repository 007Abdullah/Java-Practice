/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2;



/**
 *
 * @author MY PC
 */
public class Session2 {

    
    public static void main(String[] args) {
        
        person obj = new person();
        obj.show();
        System.out.println("pagal han"+obj.b+obj.a);
        
        person obj2 = new person(4);
        obj2.show();
        int a;
        a = 90;
        System.out.println("sasa"+a);
        
        
        
    }
    
}
class person
{
    int a;
    String b;
    
 person()
 {
     a = 45;
     b = "sameer";
 }
 person(int  c)
 {
     this.a = c;   
 }
    void show()
    {
        System.out.println("my number print"+a);
   
    }
   
}