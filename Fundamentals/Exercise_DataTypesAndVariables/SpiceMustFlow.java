package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmountSpices = 0;
        while (yield >= 100) {

            int spices = yield - 26;
            totalAmountSpices = totalAmountSpices + spices;
            days++;
            yield = yield - 10;
        }

        System.out.println(days);
        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;

        }
        System.out.println(totalAmountSpices);
    }
}
