package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(command,n));
    }
    public static String repeatString(String text,int number){
        String result = "";
        for (int i = 1; i <= number ; i++) {
            result = result + text;
        }
        return result;
    }
}
