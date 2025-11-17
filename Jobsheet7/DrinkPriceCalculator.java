import java.util.Scanner;

public class DrinkPriceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Base prices (in IDR)
        final int MORNING_HOT = 15000;
        final int MORNING_COLD = 18000;
        final int AFTERNOON_HOT = 20000;
        final int AFTERNOON_COLD = 22000;
        final int EVENING_HOT = 17000;
        final int EVENING_COLD = 19000;

        // Discount or tax rates (as multipliers)
        final double RATE_MORNING = 0.10;   // 10%
        final double RATE_AFTERNOON = 0.50; // 50%
        final double RATE_EVENING = 0.15;   // 15%

        // User input
        System.out.print("Enter order time (morning/afternoon/evening): ");
        String timeOfDay = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter drink temperature (hot/cold): ");
        String temperature = scanner.nextLine().trim().toLowerCase();

        double finalPrice = 0;
        int basePrice = 0;

        // Calculate price based on time and drink type
        if (timeOfDay.equals("morning") && temperature.equals("hot")) {
            basePrice = MORNING_HOT;
            finalPrice = basePrice + (basePrice * RATE_MORNING);
        } else if (timeOfDay.equals("morning") && temperature.equals("cold")) {
            basePrice = MORNING_COLD;
            finalPrice = basePrice + (basePrice * RATE_MORNING);
        } else if (timeOfDay.equals("afternoon") && temperature.equals("hot")) {
            basePrice = AFTERNOON_HOT;
            finalPrice = basePrice + (basePrice * RATE_AFTERNOON);
        } else if (timeOfDay.equals("afternoon") && temperature.equals("cold")) {
            basePrice = AFTERNOON_COLD;
            finalPrice = basePrice + (basePrice * RATE_AFTERNOON);
        } else if (timeOfDay.equals("evening") && temperature.equals("hot")) {
            basePrice = EVENING_HOT;
            finalPrice = basePrice + (basePrice * RATE_EVENING);
        } else if (timeOfDay.equals("evening") && temperature.equals("cold")) {
            basePrice = EVENING_COLD;
            finalPrice = basePrice + (basePrice * RATE_EVENING);
        } else {
            System.out.println("Invalid input. Please enter correct order time and temperature.");
            scanner.close();
            return;
        }

        // Display result
        System.out.println("\n=== DRINK PRICE DETAILS ===");
        System.out.println("Order time       : " + timeOfDay);
        System.out.println("Drink temperature: " + temperature);
        System.out.println("Base price (IDR) : " + basePrice);
        System.out.println("Final price (IDR): " + finalPrice);

        scanner.close();
    }
}