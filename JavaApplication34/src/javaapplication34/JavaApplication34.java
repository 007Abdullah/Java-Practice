/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author MY PC
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    
    
        int empID;
        String empName;
        private String SSN;
        protected String empDes;
        
        public void get(int id,String name)
        {
            empID = id;
            empName = name;
        }
        public String getSSN()
        {
            return SSN;
        }
        public void SSN(String ssn)
        {
            SSN = ssn;
        }
        public void dis(String des)
        {
            empDes = des;
        }
        void show()
        {
            System.out.println("ID "+empID);
            System.out.println("nmae "+empName);
            System.out.println("ssn "+SSN);
            System.out.println("des "+empDes);
        }
        
        
        
        
        
        
    public static void main(String[] args) {
 
        JavaApplication34 obj = new JavaApplication34();
        obj.empID = 45246;
        obj.empName = "sameer";
        obj.empDes = "manager";
        obj.SSN("874564654");
        obj.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
