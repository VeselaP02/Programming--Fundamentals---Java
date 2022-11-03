package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNum(n);

    }
    public static void printNum (int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.",number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.",number);
        } else {
            System.out.printf("The number %d is zero.",number);
        }
    }
}
