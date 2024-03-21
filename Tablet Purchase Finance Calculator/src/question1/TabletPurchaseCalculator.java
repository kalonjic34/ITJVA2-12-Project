package question1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TabletPurchaseCalculator {
    public static void main(String[] args) {
        // Create a DecimalFormat object for currency formatting
        DecimalFormat df = new DecimalFormat("R#,##0.00");

        // Initialize constants for the prices of the tablets
        final double S_PRICE = 5799.00;
        final double M_PRICE = 7999.00;
        final double L_PRICE = 10099.00;

        // Variable to store the selected tablet's price
        double selectedPrice = 0.0;

        // Interest rate
        double interestRate = 85.4 / 100;

        // Display the tablet options to the user
        System.out.println("\tSelect a Tablet:");
        System.out.println("S - 64GB Tablet\t\tPrice: " + df.format(S_PRICE));
        System.out.println("M - 128GB Tablet\tPrice: " + df.format(M_PRICE));
        System.out.println("L - 256GB Tablet\tPrice: " + df.format(L_PRICE));
        System.out.print("\nEnter your choice: ");

        // Capture the user's choice
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toUpperCase();

        // Use if statements to select the correct tablet’s price based on the user's
        // choice
        if (choice.equals("S")) {
            selectedPrice = S_PRICE;
        }
        if (choice.equals("M")) {
            selectedPrice = M_PRICE;
        }
        if (choice.equals("L")) {
            selectedPrice = L_PRICE;
        }

        scanner.close();

        // If the selected price is still 0.0, the choice was invalid
        if (selectedPrice == 0.0) {
            System.out.println("Invalid choice! Option '" + choice + "' does not exist.");
        } else {
            // If the choice is valid, calculate the monthly instalment amount and the total
            // price
            double totalPrice = selectedPrice * (1 + interestRate);
            double monthlyPayment = totalPrice / 24;

            // Display the monthly payment and total price
            System.out.println("\nPay as little as: " + df.format(monthlyPayment) + " pm x 24 months");
            System.out.println("========================================");
            System.out.println("***Credit Price: " + df.format(totalPrice));
        }
    }

}
