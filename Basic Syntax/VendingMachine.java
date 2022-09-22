package Basic_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double price = 0;
        while (!command.equals("Start")) {
            double money = Double.parseDouble(command);

            if (money == 0.1) {
                price = price + 0.1;
            } else if (money == 0.2) {
                price = price + 0.2;
            } else if (money == 0.5) {
                price = price + 0.5;
            } else if (money == 1) {
                price = price + 1;
            } else if (money == 2) {
                price = price + 2;
            } else {
                System.out.printf("Cannot accept %.2f%n",money);
            }


            command = scanner.nextLine();
        }


        String product = scanner.nextLine();
        while (!product.equals("End")) {


            switch (product) {
                case "Nuts":
                    if (price >= 2) {
                        price = price - 2;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (price >= 0.7) {
                        price = price - 0.7;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (price >= 1.5) {
                        price = price - 1.5;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (price >= 0.8) {
                        price = price - 0.8;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Coke":
                    if (price >= 1) {
                        price = price - 1;
                        System.out.printf("Purchased %s%n",product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }
if (price >= 0) {
    System.out.printf("Change: %.2f",price);
}
    }
}
