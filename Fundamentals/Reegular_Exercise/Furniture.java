package Reegular_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+[.]?\\d+)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String command = scanner.nextLine();



        List<String> furnitureName = new ArrayList<>();
        double incomes = 0;
        while (!command.equals("Purchase")){
            Matcher matcher = pattern.matcher(command);

            while (matcher.find()) {
                String name = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));


                furnitureName.add(name);

                double totalPrice = price * quantity;

                incomes = incomes + totalPrice;
                break;
            }

                command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureName.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f",incomes);
    }
}
