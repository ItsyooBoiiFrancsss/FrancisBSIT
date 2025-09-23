package CaseStudy2;

public class Bus extends Vehicle {
	 public Bus(String vehicleId, double speed, double energyLevel) {
	        super(vehicleId, speed, energyLevel);
	    }

	    public void move() {
	        System.out.println("Bus " + getVehicleId() + " is moving along its route.");
	    }

	    public void refuelOrRecharge() {
	        System.out.println("Bus refueling with diesel.");
	    }

	    public String getCurrentLocation() {
	        return "Bus location coordinates.";
	    }

}
