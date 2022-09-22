package Basic_Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudent = Integer.parseInt(scanner.nextLine());
        double priceLight = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double allSumLight =Math.ceil(countStudent + countStudent * 0.10) * priceLight;
        double allSumRobe = countStudent * priceRobe;
        double totalSumBelt = (countStudent - countStudent / 6) * priceBelt;

        double totalSum = totalSumBelt + allSumLight + allSumRobe;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - budget);
        }
    }
}
