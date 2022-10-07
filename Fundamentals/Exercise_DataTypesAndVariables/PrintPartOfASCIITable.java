package Exercise_DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int finishcode = Integer.parseInt(scanner.nextLine());

        for (int i = startCode; i <= finishcode ; i++) {
            System.out.printf("%c ",(char) i);
        }

    }
}
