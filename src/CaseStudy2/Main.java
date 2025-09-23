package CaseStudy2;

public class Main {
	public static void main(String[] args) {
        VehicleController controller = new VehicleController();

        Vehicle car = new Car("Lumbo", 60, 75);
        Vehicle bus = new Bus("SUV", 40, 90);
        Vehicle emergencyVehicle = new EmergencyVehicle("Ambulance", 80, 65);
        Vehicle drone = new drone("Drone360", 30, 50, 120.5);

        System.out.println("=== Car ===");
        controller.operateVehicle(car);
        System.out.println(car.getCurrentLocation());

        System.out.println("\n=== Bus ===");
        controller.operateVehicle(bus);
        System.out.println(bus.getCurrentLocation());

        System.out.println("\n=== Emergency Vehicle ===");
        controller.operateVehicle(emergencyVehicle);
        System.out.println(emergencyVehicle.getCurrentLocation());

        System.out.println("\n=== Drone ===");
        controller.operateVehicle(drone);
        System.out.println(drone.getCurrentLocation());
    }

	}

