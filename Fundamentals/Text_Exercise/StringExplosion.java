package Text_Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        int totalStrength = 0;
        for (int position = 1; position < sb.length() ; position++) {
            char symbol = sb.charAt(position);

            if (symbol == '>'){
                int strength = Integer.parseInt(sb.charAt(position + 1) + "");
                totalStrength += strength;
            } else if (symbol != '>' && totalStrength > 0) {
                sb.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(sb);
    }
}
