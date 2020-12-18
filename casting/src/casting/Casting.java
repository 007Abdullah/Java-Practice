/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

import java.util.Scanner;
        

public class Casting {
    
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int d = obj.nextInt();
//       int area;
//       float pie = 3.142f;
//       int Diamerter;
//        System.out.println("Enter a Diamerter");
//        Diamerter = obj.nextInt();
//        float radius;
//        radius = (float) Diamerter/2;
//        System.out.println("Raius is "+radius);
//        float result;
//        System.out.println("formula is 4*pir*radius*radius");
//        result = 4*pie*radius*radius;
//        System.out.println(""+result);
//        sameer obj = new sameer();
//        
//        System.out.println(obj.a+obj.b);
////////////////////////////////////////////////////////////////////////////////////        
//        sameer obj2 = new sameer(4); 
//        obj2.show();
///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// 
////////////////////////////////////////////////////////////////////////////////
       
        
        int num = 0;
        
         while(num <= 10)
         {
            System.out.println(d+"*"+num+"="+d*num);
            num++;
         }
    }
}
class sameer
{
    Integer a;
    String b;
    String c;
    
sameer()
{
    a = 45;
}
sameer(int c)
{
    this.a = c; 
}
 void show()
    {
        System.out.println("my number print"+a);
    }
}