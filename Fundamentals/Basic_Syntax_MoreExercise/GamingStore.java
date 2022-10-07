package Basic_Syntax_MoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double firstBalance = currentBalance;
        String game =scanner.nextLine();

        double price = 0;
        boolean isFinish = false;

        while (!game.equals("Game Time")) {



            switch (game){
                case "OutFall 4":
                    price = 39.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 39.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 15.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 19.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 59.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 29.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance = currentBalance - 39.99;
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                isFinish = true;
                break;
            }

            game = scanner.nextLine();
        }
        if (isFinish) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",firstBalance - currentBalance,currentBalance);
        }
    }
}
