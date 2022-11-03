package Method_Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);
    }
    public static void printVowelsCount(String text){
        int count = 0;
        for (char symbol:text.toCharArray()) {
            if (symbol == 'a' || symbol =='o' || symbol == 'i' || symbol == 'u' || symbol == 'e') {
                count++;
            }

        }
        System.out.println(count);
    }
}
