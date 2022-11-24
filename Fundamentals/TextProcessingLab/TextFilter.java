package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannWord: bannedWord) {
            text = text.replace(bannWord,repeatWord("*",bannWord.length()));
        }
        System.out.println(text);
    }
    public static String repeatWord (String symbol,int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }
}
