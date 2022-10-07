package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int neededLiters = 255;
        int currentLiters = 0;

        for (int i = 1; i <= n ; i++) {
            int pourLiters = Integer.parseInt(scanner.nextLine());

            currentLiters += pourLiters;

            if (currentLiters > neededLiters) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pourLiters;
            }
        }
        System.out.println(currentLiters);
    }
}
