package TextProcessingLab;

import java.util.Scanner;

public class Digits_LettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder isDigit = new StringBuilder();
        StringBuilder isLetter = new StringBuilder();
        StringBuilder isOther = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if (Character.isDigit(currentSymbol)){
                isDigit.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)) {
                isLetter.append(currentSymbol);
            } else {
                isOther.append(currentSymbol);
            }
        }
        System.out.println(isDigit);
        System.out.println(isLetter);
        System.out.println(isOther);
    }
}
