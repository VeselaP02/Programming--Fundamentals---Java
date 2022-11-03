package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        switch (command){
            case "int":
                int firstNumInput = Integer.parseInt(scanner.nextLine());
                int secondNumInput = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumInput,secondNumInput));
                break;
            case "char":
                char firstSymbolInput = scanner.nextLine().charAt(0);
                char secondSymbolInput = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbolInput,secondSymbolInput));
                break;
            case "string":
                String firstTextInput = scanner.nextLine();
                String secondTextInput = scanner.nextLine();
                System.out.println(getMax(firstTextInput,secondTextInput));
                break;
        }

    }
    public static int getMax(int firstNum,int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        } else {
            return secondNum;
        }
    }
    public static char getMax(char firsSymbol,char secondSymbol) {
        if (firsSymbol > secondSymbol){
            return firsSymbol;
        } else {
            return secondSymbol;
        }
    }
    public static String getMax(String firstText, String secondText){
        if (firstText.compareTo(secondText) > 0){
            return firstText;
        } else {
            return secondText;
        }
    }
}
