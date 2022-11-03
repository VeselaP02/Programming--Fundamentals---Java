package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")){
            String [] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "Delete":
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.removeAll(Arrays.asList(numberToRemove));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    numbersList.add(index,element);
                    break;
            }

            command = scanner.nextLine();
        }
        for (int item:numbersList) {
            System.out.print(item + " ");
        }
    }
}
