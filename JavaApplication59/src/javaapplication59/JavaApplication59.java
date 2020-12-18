/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author MY PC
 */
public class JavaApplication59 {

     // Declare and initialize static variable   
    public static int staticCounter = 0;       
    // Declare and initialize instance variable   
    int instanceCounter = 0; 
    /**    
     * static block     
     *      
     */       
    static{    
        System.out.println("I am a static block");
    }
     /**    
      * 
      * Static method   
      *    * @return void    */    
    public static void staticMethod(){
        
        System.out.println("I am a static method"); 
    } 
    /**    
     * 
     * Displays the value of static and instance counters    
     *    
     * @return void    
     */     
    public void displayCount(){  
        //Increment the static and instance variable      
        staticCounter++;       
        instanceCounter++;      
// Print the value of static and instance variable      
        System.out.println("Static counter is:"+ staticCounter);      
        System.out.println("Instance counter is:" + instanceCounter);   
    
    }
    
    
    
    
    
    public static void main(String[] args) {
         System.out.println("I am the main method");         
        // Invoke the static method using the class name        
         JavaApplication59.staticMethod(); 
        // Create first instance of the class        
         JavaApplication59 objStatic1 = new JavaApplication59();    
         objStatic1.displayCount();                
        // Create second instance of the class        
         JavaApplication59 objStatic2 = new JavaApplication59();        
         objStatic2.displayCount();                
    // Create third instance of the class        
         JavaApplication59 objStatic3 = new JavaApplication59();        
         objStatic3.displayCount();    
    } 
    }
        
        
        
        
        
        

   
    

