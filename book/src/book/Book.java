/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author MY PC
 */
public class Book {

    int empID;
    String empName;
    private   String SSN;
    protected String empDesig;
    
    public Book(int id,String name)
    {
        empID = id;
        empName = name;
    }
    public String getSSN()
    {
        return SSN;
    }
    
    public void Book(String ssn)
    {
        SSN = ssn;
    }
    public void de(String desig)
    {
        empDesig = desig;
    }
    
     void show()
    {
        
        System.out.println("Employee id"+" "+empID);
        System.out.println("Employee Name"+" "+empName);
        System.out.println("Employee SSN"+" "+SSN);
        System.out.println("Employee DES"+" "+empDesig);
    }
    
    
    public static void main(String[] args) {
    Book obj = new Book(1071644,"Sameer");
    obj.empDesig = "Manager";
    obj.SSN = "0312128181";
    obj.show();
    
    }
    
}
