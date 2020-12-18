/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphas;

/**
 *
 * @author MY PC
 */
public class Alphas {

    int empID;  // Variable to store employee ID   
    String empName;  // Variable to store employee name
     private String SSN;  // Variable to store social security number    
     protected String empDesig;  // Variable to store designation 
     
     public Alphas(int ID, String name){             
         empID = ID;        
         empName = name;  
         
     } 
     
     public String getSSN(){  
        // Accessor for SSN      
           
         return SSN;   
       } 
     
     public void setSSN(String ssn) {  
     // Mutator for SSN           
         SSN = ssn;
         
      
     } 
     
     
    
     
      public void setDesignation(String desig) {
          // Public method     
          
          empDesig = desig;   
      } 
     
     
       public void show(){  // Public method  4           
           System.out.println("Employee ID is "+ empID);       
           System.out.println("Employee name is" + empName);        
           System.out.println("Designation is "+ empDesig);         
           System.out.println("SSN is" + SSN);    }
     
     
    public static void main(String[] args) {
        Alphas obj = new Alphas(1200,"Roger Stevens");              // Assign values to public variables       
        obj.empDesig = "Manager";      
        obj.SSN = "281-72-3873";              // Invoke the public method       
        obj.show();
    }
    
}
