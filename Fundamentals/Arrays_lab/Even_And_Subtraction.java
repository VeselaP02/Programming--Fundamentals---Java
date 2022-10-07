package Arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class Even_And_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int TotalSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numberArr.length ; i++) {
            int currentNum = numberArr[i];


            if (currentNum % 2 == 0) {
                evenSum = evenSum + numberArr[i];
            } else {
                oddSum = oddSum + numberArr[i];
            }
        }
        TotalSum = evenSum - oddSum;
        System.out.println(TotalSum);
    }
}
