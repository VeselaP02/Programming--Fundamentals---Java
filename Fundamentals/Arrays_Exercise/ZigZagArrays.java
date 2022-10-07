package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[rows];
        String [] secondArray = new String[rows];

        for (int i = 1; i <= rows ; i++) {
            String [] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (i % 2 == 0) {
                firstArray[i - 1] = secondNum;
                secondArray[i - 1] = firstNum;
            } else {
                firstArray[i - 1] = firstNum;
                secondArray[i -1] = secondNum;
            }

        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
