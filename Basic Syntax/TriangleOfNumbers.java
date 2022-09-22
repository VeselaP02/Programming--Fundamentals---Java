package Basic_Exercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= number ; rows++) {
            for (int j = 1; j <= rows ; j++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
        }
    }
}
