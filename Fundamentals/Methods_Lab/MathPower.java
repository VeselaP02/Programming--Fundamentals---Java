package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = power(number,power);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double power(double num,double n){
        double result = 1;
        for (int i = 1; i <= n ; i++) {
            result = result * num;
        }
        return result;
    }
}
