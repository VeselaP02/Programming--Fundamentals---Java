package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length ; i++) {
            String currentWord = input[i];
            int length = currentWord.length();

            String result = repeatWord(currentWord,length);

            System.out.print(result);
        }
    }
    public static String repeatWord (String word,int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            sb.append(word);
        }
        return sb.toString();
    }
}
