package Maps;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []  wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word: wordsArr) {
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word,wordsMap.get(word) + 1);
        }

        List<String> worList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                worList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",worList));
    }
}
