package Text_Exercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        boolean isNegative1 = false;
        boolean isNegative2 = false;

        if (firstNum.charAt(0) == '-') {
            firstNum = firstNum.substring(1);
            isNegative1 = true;
        }
        firstNum = firstNum.replaceAll("^0+(?!$)", "");
        int secondNum = Integer.parseInt(scanner.nextLine());
        if (secondNum < 0) {
            secondNum = Math.abs(secondNum);
            isNegative2 = true;
        }

        if (secondNum != 0) {
            String multiplication = multiplication(firstNum, secondNum);
            StringBuilder result = new StringBuilder(multiplication);
            if (isNegative1 && !isNegative2)
                result.append('-');
            if (!isNegative1 && isNegative2)
                result.append('-');
            System.out.println(result.reverse());
        } else
            System.out.println("0");
    }

    public static String multiplication(String first, int second){
        StringBuilder result = new StringBuilder();
        int rest = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(first.charAt(i) + "");
            int multiplication = digit * second;
            if ((multiplication + rest) >= 10) {
                int toAdd = (multiplication + rest) % 10;
                result.append(toAdd);
                rest = (multiplication + rest) / 10;
            } else {
                int toAdd = multiplication + rest;
                result.append(toAdd);
                rest = 0;
            }
        }
        if (rest > 0)
            result.append(rest);
        return result.toString();
    }
}
