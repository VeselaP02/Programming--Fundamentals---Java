package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String,Double> productsPrice = new LinkedHashMap<>();
        Map<String,Integer> productsQuantity = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String product = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            productsPrice.put(product,price);


            if (!productsQuantity.containsKey(product)){
                productsQuantity.put(product,quantity);
            } else {
                productsQuantity.put(product,productsQuantity.get(product) + quantity);
            }



            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> productMap : productsPrice.entrySet()) {
            String productName = productMap.getKey();
            double totalPrice = productMap.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n",productName,totalPrice);
        }

    }
}
