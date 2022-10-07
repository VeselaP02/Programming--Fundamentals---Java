package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= rotation ; rotations++) {
            int firstElement = numberArr[0];

            for (int index = 0; index < numberArr.length - 1 ; index++) {
                numberArr[index] = numberArr[index + 1];
            }
            numberArr [numberArr.length - 1] = firstElement;
        }
        for (int element:numberArr) {
            System.out.print(element + " ");
        }
    }
}
