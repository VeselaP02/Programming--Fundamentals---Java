package Text_Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length() ; i++) {
            if (sb.charAt(i) == sb.charAt(i +1)){
                sb.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(sb);
    }
}
