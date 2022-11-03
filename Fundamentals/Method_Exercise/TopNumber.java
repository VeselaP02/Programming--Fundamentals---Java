package Method_Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            if (isDivisibleBy8(i) && isHaveOneOddNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isDivisibleBy8(int number) {

        int sumDigit = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigit = sumDigit + lastDigit;
             number = number / 10;
        }
        return sumDigit % 8 == 0;
    }
    public static boolean isHaveOneOddNumber(int number){
        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
