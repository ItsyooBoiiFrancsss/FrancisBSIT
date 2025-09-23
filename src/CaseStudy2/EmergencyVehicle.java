package CaseStudy2;

public class EmergencyVehicle extends Vehicle{
		public EmergencyVehicle(String vehicleId, double speed, double energyLevel) {
	        super(vehicleId, speed, energyLevel);
	    }

	    public void move() {
	        System.out.println("Emergency vehicle " + getVehicleId() + " is moving with priority.");
	    }

	    public void refuelOrRecharge() {
	        System.out.println("Emergency vehicle refueling at priority station.");
	    }

	    public String getCurrentLocation() {
	        return "Emergency vehicle coordinates.";
	    }
	}


