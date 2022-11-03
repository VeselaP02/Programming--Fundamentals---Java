package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weighInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());


        System.out.println(area(weighInput,lengthInput));
    }
    public static int area(int weigh,int length){
        return weigh * length;
    }
}
