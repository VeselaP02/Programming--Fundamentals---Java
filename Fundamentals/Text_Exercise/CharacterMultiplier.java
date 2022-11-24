package Text_Exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String [] commandArr = command.split(" ");

        String firstWord = commandArr[0];
        String secondWord = commandArr[1];

        String fotMultiply = "";
        if (firstWord.length()> secondWord.length()){
            fotMultiply = firstWord.substring(0,secondWord.length());
        } else {
            fotMultiply = secondWord.substring(0,firstWord.length());
        }
        int sum = 0;
        for (int i = 0; i <fotMultiply.length() ; i++) {
            sum += (int) firstWord.charAt(i) * (int) secondWord.charAt(i);
        }
        if (firstWord.length() > secondWord.length()){
            for (int i = fotMultiply.length(); i <firstWord.length() ; i++) {
                sum += (int) firstWord.charAt(i);
            }
        } else {
            for (int i = fotMultiply.length(); i <secondWord.length() ; i++) {
                sum += (int) secondWord.charAt(i);
            }
        }
        System.out.println(sum);
    }

}
