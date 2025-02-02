package Ifelse;

import java.util.Scanner;

public class BillCalculator {

    public static void main(String[] args) {
        bill_calculator();
    }

    public static void bill_calculator() {
        System.out.println("Menu:");
        System.out.println("Applejuice - $7.50");
        System.out.println("Muskmelon - $15.00");
        System.out.println("Sugarcane - $7.75");
        System.out.println("Beetroot - $5.00");
        System.out.println("Exit");

        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Exit")) {
                break; // Exit the loop if the user chooses to finish
            }

            double price;
            switch (choice) {
                case "Applejuice":
                    price = 7.50;
                    System.out.println("You've selected Apple Juice. Price:$" + price);
                    total += price;
                    System.out.println("Current Total:$" + total);
                    break;
                case "Muskmelon":
                    price = 15.00;
                    System.out.println("You've selected Musk Melon. Price: $" + price);
                    total += price;
                    System.out.println("Current Total:$" + total);
                    break;
                case "Sugarcane":
                    price = 7.75;
                    System.out.println("You've selected Sugar Cane. Price: $" + price);
                    total += price;
                    System.out.println("Current Total:$" + total);
                    break;
                case "Beetroot":
                    price = 5.00;
                    System.out.println("You've selected Beetroot. Price:$" + price);
                    total += price;
                    System.out.println("Current Total:$" + total);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Grand Total:$" + total);

        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
