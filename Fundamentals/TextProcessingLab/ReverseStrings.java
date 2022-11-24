package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        while (!text.equals("end")){
            StringBuilder sb = new StringBuilder();

            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);
                sb.append(symbol);
            }

            System.out.printf("%s = %s%n",text,sb);

            text = scanner.nextLine();
        }
    }
}
