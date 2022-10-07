package Basic_Syntax_MoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum =Integer.parseInt(scanner.nextLine());
        int thirdNum  =Integer.parseInt(scanner.nextLine());

       int max = Math.max(firstNum,Math.max(secondNum,thirdNum));
       int min = Math.min(firstNum,Math.min(secondNum,thirdNum));
       int mid = firstNum + secondNum + thirdNum - max - min;

        System.out.printf("%d%n",max);
        System.out.printf("%d%n",mid);
        System.out.printf("%d%n",min);
    }
}
