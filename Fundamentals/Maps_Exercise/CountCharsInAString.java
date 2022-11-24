package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char symbol:text.toCharArray()) {
            map.putIfAbsent(symbol,0);
            map.put(symbol, map.get(symbol) + 1);
        }
        for (Map.Entry<Character, Integer> textEntry : map.entrySet()) {
            System.out.printf("%c -> %d%n",textEntry.getKey(),textEntry.getValue());
        }

    }
}
