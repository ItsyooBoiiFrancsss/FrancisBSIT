package CaseStudy2;

public abstract class Vehicle implements Tracker {
	 private String vehicleId;
	    private double speed;
	    private double energyLevel;
	    public Vehicle(String vehicleId, double speed, double energyLevel) {
	    this.vehicleId = vehicleId;
	    this.speed = speed;
	    this.energyLevel = energyLevel;
	    }
	    public void move() {			
		}
	    public abstract void refuelOrRecharge();

	    public String getStatus() {		
	    return "ID: " + vehicleId + ", Speed: " + speed + " km/h, Energy: " + energyLevel;
}
	    // Getters and Setters
	    public String getVehicleId() { return vehicleId; }
	    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

	    public double getSpeed() { return speed; }
	    public void setSpeed(double speed) { this.speed = speed; }

	    public double getEnergyLevel() { return energyLevel; }
	    public void setEnergyLevel(double energyLevel) { this.energyLevel = energyLevel; }
	}