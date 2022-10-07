package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputFirst = scanner.nextLine().split(" ");
        String [] inputSecond = scanner.nextLine().split(" ");

        for (String elementSecondArray:inputSecond) {
            for (String elementFirstArray:inputFirst) {
                if (elementSecondArray.equals(elementFirstArray)) {
                    System.out.print(elementFirstArray + " ");
                    break;
                }
            }
        }
    }
}
