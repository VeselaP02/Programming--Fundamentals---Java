package Methods_Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (symbol){
            case "+":
                System.out.println(addSum(firstNumInput,secondNumInput));
                break;
            case "*":
                System.out.println(multiplySum(firstNumInput,secondNumInput));
                break;
            case "/":
                System.out.println(divideSum(firstNumInput,secondNumInput));
                break;
            case "-":
                System.out.println(subtractSum(firstNumInput,secondNumInput));
                break;
        }
    }
    public static int addSum(int firstNum,int secondNum){
         return  firstNum + secondNum;
    }
    public static int multiplySum(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    public static int divideSum(int firstNum,int secondNum) {
        return firstNum / secondNum;
    }
    public static int subtractSum(int firstNum,int secondNum) {
        return firstNum - secondNum;
    }
}
