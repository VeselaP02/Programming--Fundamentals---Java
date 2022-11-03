package Methods_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplySum(numInput));

    }
    public static int multiplySum(int num) {
        int evenSum = evenSum(num);
        int oddSum = oddSum(num);

        return evenSum * oddSum;

    }
    public static int evenSum(int num){
        String intoString = Integer.toString(num);


        int [] arrInt = Arrays.stream(intoString.split(""))
                .mapToInt(Integer::parseInt).toArray();

        int Sum = 0;
        for (int i = 0; i < arrInt.length ; i++) {
            if (arrInt[i] % 2 == 0) {
                Sum += arrInt[i];
            }
        }
        return Sum;
    }
    public static int oddSum(int num){
        String intString = Integer.toString(num);

        int arrInt [] = Arrays.stream(intString.split(""))
                .mapToInt(Integer::parseInt).toArray();

        int Sum = 0;
        for (int i = 0; i < arrInt.length ; i++) {

            if (arrInt[i] % 2 != 0) {
                Sum += arrInt[i];
            }
        }
        return Sum;
    }
}
