package CaseStudy2;

public class drone extends Vehicle {
	 private double altitude;

	    public drone(String vehicleId, double speed, double energyLevel, double altitude) {
	        super(vehicleId, speed, energyLevel);
	        this.altitude = altitude;
	    }

	    public void move() {
	        System.out.println("Drone " + getVehicleId() + " is flying at altitude " + altitude + " meters.");
	    }

	    public void refuelOrRecharge() {
	        System.out.println("Drone recharging battery.");
	    }

	    public String getCurrentLocation() {
	        return "Drone GPS coordinates.";
	    }

	    public double getAltitude() { return altitude; }
	    public void setAltitude(double altitude) { this.altitude = altitude; }

}
