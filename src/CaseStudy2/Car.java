package CaseStudy2;

public class Car extends Vehicle {
	public Car(String vehicleId, double speed, double energyLevel) {
        super(vehicleId, speed, energyLevel);
    }

    public void move() {
        System.out.println("Car " + getVehicleId() + " is driving on the road.");
    }

    public void refuelOrRecharge() {
        System.out.println("Car refueling with gasoline.");
    }

    public String getCurrentLocation() {
        return "Car location coordinates.";
    }

	}