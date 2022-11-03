package Methods_Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                sumAdd(firstNumInput,secondNumInput);
                break;
            case "multiply":
                sumMultiply(firstNumInput,secondNumInput);
                break;
            case "subtract":
                sumSubtract(firstNumInput,secondNumInput);
                break;
            case "divide":
                sumDivide(firstNumInput,secondNumInput);
                break;
        }
    }
    public static void sumAdd(int firstNum,int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
    public static void sumMultiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void sumSubtract(int firstNum,int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void sumDivide(int firstNum,int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
