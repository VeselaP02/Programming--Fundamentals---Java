package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] peopleInTrain = new int[n];

        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            peopleInTrain[i] = currentNum;

            sum = sum + peopleInTrain[i];
            System.out.printf("%d ", peopleInTrain[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
