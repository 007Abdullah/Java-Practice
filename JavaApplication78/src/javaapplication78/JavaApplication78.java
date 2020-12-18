/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

/**
 *
 * @author MY PC
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A obj = new A();
        obj.main();
        obj.pagal();
    }
    
}
abstract class Sameer
{
    
    abstract void main();
    void pagal()
    {
        System.out.println("parent class");
    }
    
    
}
class A extends Sameer
{
    @Override
    void main()
    {
        System.out.println("pagal han tu");
    }
    
}