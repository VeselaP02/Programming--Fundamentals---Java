package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            if (commandArr[0].equals("Add")) {
                int currentNum = Integer.parseInt(commandArr[1]);
                numberList.add(currentNum);
            } else {
                int passengers = Integer.parseInt(commandArr[0]);
                for (int index = 0; index < numberList.size() ; index++) {
                    int currentWagon = numberList.get(index);
                    if (currentWagon + passengers <= maxCapacity) {
                        numberList.set(index, currentWagon + passengers);
                        break;
                    }
                }
            }




            command = scanner.nextLine();
        }
        for (int item:numberList) {
            System.out.print(item + " ");
        }
    }
}
