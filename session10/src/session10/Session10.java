/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

/**
 *
 * @author MY PC
 */
public class Session10 {

    
    public static void main(String[] args) {
         FourWheeler mehran = new FourWheeler("LA - 09 CS - 1405", "VolkswageN", 4, false);
        //mehran.showDetails();
        mehran.accelerate(200);
        Vehicle v = new Vehicle("LA - 09 CS - 1406", "VolkswageN", 4, true);

       // v.accelerate(300);

    }
    
}
class Vehicle {

    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public Vehicle(String vId, String vName, int numWheels, boolean pSteer) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }

    protected void accelerate(int speed) {
        System.out.println("Parent Accelerating at:" + speed + " kmph"+ vehicleNo);
    }
}

class FourWheeler extends Vehicle {

    final private boolean powerSteer;

    public FourWheeler(String vehicleNo, String vName, int numWheels, boolean pSteer) {
        super(vehicleNo, vName, numWheels,pSteer);
        
        this.vehicleNo = vehicleNo;
        vehicleName = vName;

        wheels = numWheels;
        powerSteer = pSteer;
    }

    @Override
    protected void accelerate(int speed2) {
        super.accelerate(speed2);
        System.out.println("Child's current speed of this vehicle is " + speed2);

    }

    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer == true) {
            System.out.println("Power Steering:Yes");
        } else {
            System.out.println("Power Steering:No");
        }

    }
}
