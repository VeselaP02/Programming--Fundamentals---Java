package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("End")){
            
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numberList.add(numberToAdd);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(numberList,index)) {
                    numberList.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int indexRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(numberList,indexRemove)) {
                    numberList.remove(indexRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                modifyElement(numberList, count);

            } else if (command.contains("Shift right")) {
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= count ; i++) {
                   int lastElement = numberList.get(numberList.size() - 1);
                   numberList.remove(numberList.size() - 1);
                   numberList.add(0,lastElement);
                }
            }


            command = scanner.nextLine();
        }
        for (int numbers:numberList) {
            System.out.print(numbers + " ");
        }
    }

    private static void modifyElement(List<Integer> numberList, int count) {
        for (int i = 1; i <= count; i++) {
           int firstElement = numberList.get(0);
           numberList.remove(0);
           numberList.add(firstElement);
        }
    }
    public static boolean isValidIndex(List<Integer> list,int index){
        return index >= 0 && index <=list.size();
    }
}
