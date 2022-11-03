package List_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String [] commandArr = command.split(" ");
            String input = commandArr[0];

            switch (input) {
                case "Add":
                    int addNum = Integer.parseInt(commandArr[1]);
                    numbersList.add(addNum);
                    break;
                case "Remove":
                    int removeToNum = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(removeToNum));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove((indexRemove));
                    break;
                case "Insert":
                    int insertFirstNum = Integer.parseInt(commandArr[1]);
                    int insertSecondNum = Integer.parseInt(commandArr[2]);
                    numbersList.add(insertSecondNum,insertFirstNum);
                    break;
            }


            command = scanner.nextLine();
        }
        for (Integer item:numbersList) {
            System.out.print(item + " ");
        }
    }
}
