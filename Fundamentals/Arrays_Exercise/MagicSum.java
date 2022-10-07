package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index < numbers.length ; index++) {
            int currentNum = numbers[index];

            for (int i = index + 1 ; i < numbers.length ; i++) {
                int numberIn = numbers[i];

                if (currentNum + numberIn == magicNum) {
                    System.out.println(currentNum + " " + numberIn);
                }
            }


        }
    }
}
