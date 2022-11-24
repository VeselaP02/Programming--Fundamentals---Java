package Text_Exercise;


import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String [] wordArr = username.split(", ");


        for (int i = 0; i < wordArr.length ; i++) {
            String currentWord = wordArr[i];

            if (isValid(currentWord)){
                System.out.println(currentWord);
            }
        }
    }
    public static boolean isValid (String word){
        boolean isValidLength = false;
        if (word.length()>=3 && word.length()<= 16){
            isValidLength = true;
        }
        boolean isContent = true;
        for (int i = 0; i < word.length() ; i++) {
            char symbol = word.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol!= '-' && symbol != '_'){
                isContent = false;
            }
            }
        return isValidLength && isContent;
    }
}
