
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GunOrderSystem system = new GunOrderSystem();

        // gun menu arrays
        String[] gunNames = {"Pistol", "Shotgun", "Rifle", "Sniper"};
        double[] gunPrices = {550.0, 1250.0, 2200.0, 3200.0};

        boolean running = true;
        while (running) {
            // show menu
            System.out.println("\n=== Gun Menu ===");
            for (int i = 0; i < gunNames.length; i++) {
                System.out.println((i + 1) + ". " + gunNames[i] + " - $" + gunPrices[i]);
            }
            System.out.println("0. Finish and show orders");
            System.out.print("Enter gun number: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) {
                running = false; // exit loop
            } else if (choice >= 1 && choice <= gunNames.length) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline

                // create and add order
                String gunName = gunNames[choice - 1];
                double price = gunPrices[choice - 1];
                system.addOrder(new GunOrder(gunName, quantity, price));
                System.out.println("Added " + quantity + " x " + gunName);
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // list all orders and total
        system.listOrders();
        System.out.println("Total Amount: $" + system.totalAmount());

        scanner.close();
    }
}
