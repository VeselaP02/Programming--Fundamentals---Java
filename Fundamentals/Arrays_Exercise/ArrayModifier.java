package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numberArr[index1];
                int element2 = numberArr[index2];

                numberArr[index1] = element2;
                numberArr[index2] = element1;

            } else if (command.contains("multiply ")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numberArr[index1];
                int element2 = numberArr[index2];
                int product = element1 * element2;

                numberArr[index1] = product;

            } else if (command.equals("decrease")) {
                for (int i = 0; i < numberArr.length ; i++) {
                    numberArr[i]--;
                }
            }


            command = scanner.nextLine();
            
        }
        for (int index = 0; index < numberArr.length ; index++) {
            int currentNum = numberArr[index];

            if (index != numberArr.length - 1) {
                System.out.print(currentNum + ", ");
            } else {
                System.out.println(currentNum);
            }
        }
    }
}
