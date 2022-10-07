package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index < numbers.length  ; index++) {
            int currentNum = numbers[index];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < numbers.length ; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (rightSum == leftSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
