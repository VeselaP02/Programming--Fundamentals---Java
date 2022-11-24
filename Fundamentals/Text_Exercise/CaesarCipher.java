package Text_Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
           char encrypted = ((char) (symbol + 3));
           encryptedText.append(encrypted);
        }
        System.out.println(encryptedText);
    }
}
