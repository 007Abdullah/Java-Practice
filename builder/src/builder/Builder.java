/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author MY PC
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder r = new StringBuilder("RAZZAQ");
        
        System.out.println(r.append(" ABDULLAH"));
        System.out.println(r.append(r+"\t"));
        System.out.println(r.append(" pagal"+"\t"));
        System.out.println(r.append('A'+"\t"));
        System.out.println(r.append(true+"\t"));
        System.out.println(r.append(45)+"\t");
        System.out.println(r.append(4.256)+"\t");
        System.out.println("\b");
        System.out.println("Sorry isay zada append nhi kar sakta");
        System.out.println("\b");
        System.out.println(r.capacity());
        System.out.println("\b");
        System.out.println(r.charAt(0));
        System.out.println("\b");
        System.out.println(r.chars());
        System.out.println("\b");
        System.out.println(r.insert(0,5));
        System.out.println("\b");
        System.out.println(r.delete(0, 10));
    }
    
}
