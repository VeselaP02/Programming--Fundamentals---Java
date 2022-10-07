package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte firstNum  =Byte.parseByte(scanner.nextLine());
        byte secondNum = Byte.parseByte(scanner.nextLine());
        byte thirdNum = Byte.parseByte(scanner.nextLine());
        byte fourthNum = Byte.parseByte(scanner.nextLine());

        int result = ((firstNum + secondNum) / thirdNum ) * fourthNum;
        System.out.println(result);
    }
}
