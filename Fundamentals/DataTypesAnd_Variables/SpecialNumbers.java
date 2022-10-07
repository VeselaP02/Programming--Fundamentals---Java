package DataTypesAnd_Variables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n ; i++) {
            int currentNum = i;

            double sum = 0;
            while (currentNum > 0) {
                double numDigit = currentNum % 10;
                sum = sum + numDigit;

                currentNum = currentNum / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n",i);
            } else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
