package Method_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharacters(firstSymbol,secondSymbol);

    }
    public static void printCharacters(char symbol1,char symbol2){

        if (symbol1 < symbol2){
        for (char symbol = (char)(symbol1 + 1); symbol < symbol2 ; symbol++){

                System.out.print(symbol + " ");
            }
        } else {
            for (char i = (char)(symbol2 + 1) ; i < symbol1 ; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
