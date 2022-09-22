package Basic_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        switch (day) {
            case "Friday":
                if (typeOfGroup.equals("Students")) {
                    price = 8.45;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 10.90;
                    if (groupOfPeople >= 100) {
                        groupOfPeople = groupOfPeople - 10;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 15;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price = price - price * 0.05;
                    }
                }
                break;
            case "Saturday":
                if (typeOfGroup.equals("Students")) {
                    price = 9.80;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 15.60;
                    if (groupOfPeople >= 100) {
                        groupOfPeople = groupOfPeople - 10;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 20;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price = price - price * 0.05;
                    }
                }
                break;
            case "Sunday":
                if (typeOfGroup.equals("Students")) {
                    price = 10.46;
                    if (groupOfPeople >= 30) {
                        price = price - price * 0.15;
                    }
                } else if (typeOfGroup.equals("Business")) {
                    price = 16;
                    if (groupOfPeople >= 100) {
                        groupOfPeople = groupOfPeople - 10;
                    }
                } else if (typeOfGroup.equals("Regular")) {
                    price = 22.50;
                    if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                        price = price - price * 0.05;
                    }
                }
                break;
        }
        double totalPrice = price * groupOfPeople;
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
