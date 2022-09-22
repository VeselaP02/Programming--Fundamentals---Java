package Basic_Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrder = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        for (int i = 1; i <= countOrder ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            price = (daysInMonth * capsuleCount) * pricePerCapsule;
            totalPrice = totalPrice + price;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
        }

        System.out.printf("Total: $%.2f%n",totalPrice);
    }
}
