import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        char symbol = text.charAt(0);

        System.out.println(symbol);
    }
}
