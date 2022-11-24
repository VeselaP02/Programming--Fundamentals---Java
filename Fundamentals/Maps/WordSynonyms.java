package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList> wordMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String word  = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordMap.putIfAbsent(word, new ArrayList<>() );
            wordMap.get(word).add(synonym);

        }
        for (Map.Entry<String, ArrayList> entry : wordMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }

    }
}
