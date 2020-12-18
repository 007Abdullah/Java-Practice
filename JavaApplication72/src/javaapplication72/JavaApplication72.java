/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author MY PC
 */
public class JavaApplication72 {

    public class Vehicle {
    // Declare common attributes of a vehicle    

        protected String vehicleNo;
    // Variable to store vehicle number   
        protected String vehicleName;
    // Variable to store vehicle name    
        protected int wheels;  
    //  Variable to store number of wheels     

        /**
         * * Accelerates the vehicle
         *
         * @return void
         */
        public void accelerate(int speed) {

            System.out.println("Accelerating at:"+ speed +  "kmph");
        }

        class Sameer extends Vehicle {
    // Declare a field specific to child class 

            private boolean powerSteer;
    // Variable to store steering information     

            /**
             * Parameterized constructor to initialize values based on user
             * input
             *
             * @param vID a String variable storing vehicle ID
             * @param vName a String variable storing vehicle name
             * @param numWheels an integer variable storing number of wheels
             * @param pSteer a String variable storing steering information
             */
            public Sameer(String vId, String vName, int numWheels, boolean pSteer) {
                // Attributes inherited from parent class      
                vehicleNo = vId;
                vehicleName = vName;
                wheels = numWheels;
    // Child class’ own attribute       
                powerSteer = pSteer;
            }
            /**
             *
             * Displays vehicle details
             *
             * @return void
             */
               public void showDetails() 
               {       
                   System.out.println("Vehicle no:"+ vehicleNo);    
                   System.out.println("Vehicle Name:"+ vehicleName);    
                   System.out.println("Number of Wheels:"+ wheels);         
                   if(powerSteer == true) 
                   {
                       
                       System.out.println("Power Steering:Yes");
                   }
                       else
                   {
                       System.out.println("Power Steering:No");
                   }
               }  
         
        }
    }

        public static void main(String[] args) {
             Vehicle.Sameer obj = new Vehicle.Sameer("LA-09 CS-1406", "Volkswagen", 4, true);   
           obj.showDetails();  // Invoke the child class method   
           obj.accelerate(200);  // Invoke the inherited method  
            
        }

}
