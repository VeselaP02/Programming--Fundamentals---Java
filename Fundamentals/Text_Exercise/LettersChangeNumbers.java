package Text_Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\s+");

        double totalSum = 0;
        for (String text: inputArr) {

            double modifiedNumber = getModifiedNumber(text);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f",totalSum);
    }

    private static double getModifiedNumber(String text) {
        char firstLetter = text.charAt(0);
        char lastLetter = text.charAt(text.length() - 1);
        double number = Double.parseDouble(text.replace(firstLetter,' ')
                .replace(lastLetter,' ').trim());

        if (Character.isUpperCase(firstLetter)){
            int positionUpper = (int) firstLetter - 64;
            number = number / positionUpper;
        } else {
            int positionLower = (int) firstLetter - 96;
            number = number * positionLower;
        }


        if (Character.isUpperCase(lastLetter)){
            int positionUpper = (int) lastLetter - 64;
            number = number - positionUpper;
        } else {
            int positionLower = (int) lastLetter - 96;
            number = number + positionLower;
        }

        return number;
    }
}
