package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bamWord =scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(bamWord)){
           text =  text.replace(bamWord,"");

        }
        System.out.println(text);
    }
}
