package Text_Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] text = scanner.nextLine().split("\\\\");
        String file = text[text.length - 1];
        String fileName = file.split("\\.")[0];
        String  extension = file.split("\\.")[1];
        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",extension);

    }
}
