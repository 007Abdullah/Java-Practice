/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

/**
 *
 * @author MY PC
 */
public interface NewInterface {
    
}

interface Ia {

    void student();

}

interface Ib {

    void course();
}
class Details implements Ia, Ib {

    @Override
    public void student() {
               String name = "Mari Angel Razzaq";
        
               int id = 1071644;
               
               
               System.out.println("STUDENT NAME :" +name);
               System.out.println("STUDENT ID :" +id);
    }

    @Override
    public void course() {
            String Course = "Dism";
            String subject = "java,C#,XML";
            System.out.println("COURES :" +Course);
            System.out.println("SUBJECT :"+subject);
                   
    }
}