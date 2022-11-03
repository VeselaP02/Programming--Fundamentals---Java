package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "water":
                priceWater(quantity);
                break;
            case "coffee":
                priceCoffe(quantity);
                break;
            case "coke":
                priceCoke(quantity);
                break;
            case "snacks":
                priceSnacks(quantity);
                break;
        }
    }
    public static void priceWater(int n){
        double price = n * 1.00;
        System.out.printf("%.2f",price);
    }
    public static void priceCoffe(int q){
        double price = q * 1.50;
        System.out.printf("%.2f",price);
    }
    public static void priceCoke(int q){
        double price = q * 1.40;
        System.out.printf("%.2f",price);
    }
    public static void priceSnacks(int q){
        double price = q * 2.00;
        System.out.printf("%.2f",price);
    }
}
