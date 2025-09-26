package activity2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a list of laptops
        ArrayList<Item> laptops = new ArrayList<>();

        // Add some sample laptops
        laptops.add(new Item("Dell Inspiron", 45000, 5));
        laptops.add(new Item("HP Pavilion", 50000, 3));
        laptops.add(new Item("Lenovo ThinkPad", 60000, 4));
        laptops.add(new Item("Lenovo ABP 14", 40000, 6));

        int choice = 0;

        do {
            System.out.println("\n--- LAPTOP STORE MENU ---");
            System.out.println("1. Show all laptops");
            System.out.println("2. Buy a laptop");
            System.out.println("3. Return a laptop");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Show all laptops
                    System.out.println("\nAvailable Laptops:");
                    for (int i = 0; i < laptops.size(); i++) {
                        System.out.println((i + 1) + ". " + laptops.get(i).getItemName());
                    }
                    System.out.println("\nDetails:");
                    for (Item l : laptops) {
                        l.logDetails();
                    }
                    break;

                case 2:
                    // Buy a laptop
                    System.out.println("Select laptop number to buy:");
                    for (int i = 0; i < laptops.size(); i++) {
                        System.out.println((i + 1) + ". " + laptops.get(i).getItemName());
                    }
                    int buyIndex = sc.nextInt() - 1;
                    if (buyIndex >= 0 && buyIndex < laptops.size()) {
                        laptops.get(buyIndex).buy();
                    } else {
                        System.out.println("Invalid selection");
                    }
                    break;

                case 3:
                    // Return a laptop
                    System.out.println("Select laptop number to return:");
                    for (int i = 0; i < laptops.size(); i++) {
                        System.out.println((i + 1) + ". " + laptops.get(i).getItemName());
                    }
                    int returnIndex = sc.nextInt() - 1;
                    if (returnIndex >= 0 && returnIndex < laptops.size()) {
                        laptops.get(returnIndex).returnItem();
                    } else {
                        System.out.println("Invalid selection");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
