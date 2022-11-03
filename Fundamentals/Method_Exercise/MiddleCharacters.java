package Method_Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }
    private static void printMiddleCharacters(String text) {
        if (text.length() % 2 == 1) {
            int middleCharacters = text.length() / 2;
            System.out.println(text.charAt(middleCharacters));
        } else {
            int firstMiddleCharacters = text.length() / 2 - 1;
            int secondMiddleCharacters = text.length() / 2;
            System.out.println("" + text.charAt(firstMiddleCharacters)+ text.charAt(secondMiddleCharacters));
        }
    }
}
