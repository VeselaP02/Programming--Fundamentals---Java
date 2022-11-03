package Method_Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isValid = (isValidLength(password));
        if (!isValid){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isConsist = isConsistLetterOrDigit(password);
        if (!isConsist){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isDigitConsist = isDigit(password);
        if (!isDigitConsist){
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid && isConsist && isDigitConsist){
            System.out.println("Password is valid");
        }
    }
    public static boolean isValidLength(String password){
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isConsistLetterOrDigit(String password){
        for (char symbol:password.toCharArray()) {
           if (!Character.isLetterOrDigit(symbol)){
               return false;
           }
        }
        return true;
    }
    public static boolean isDigit (String password){
        int countDigit = 0;
        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)){
                countDigit++;
            }
        }
        if (countDigit >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
