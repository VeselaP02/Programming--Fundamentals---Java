package List_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")){
            String [] commandArr = inputLine.split(" ");
            String currentCommand = commandArr[0];

            switch (currentCommand) {
                case "Contains":
                    int number =Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(number)){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                   if (commandArr[1].equals("even")){
                       evenOrOdd(numbersList);
                   } else if (commandArr[1].equals("odd")){
                       Odd(numbersList);
                   }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNum = numbersList.get(i);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int num = Integer.parseInt(commandArr[2]);
                    Filter(numbersList,commandArr[1],num);
                    break;
            }



            inputLine = scanner.nextLine();
        }
    }
    public static void evenOrOdd (List<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
            int currentNum = list.get(i);
            if (currentNum % 2 == 0) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println();
    }
    public static void Odd(List<Integer> listNumber) {
        for (int i = 0; i < listNumber.size() ; i++) {
            int currentNum = listNumber.get(i);
            if (currentNum % 2 == 1) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println();
    }
    public static void Filter(List<Integer> numList,String command,int number){
        switch (command){
            case "<":
                for (int i = 0; i < numList.size(); i++) {
                    int currentNum = numList.get(i);
                    if (currentNum < number){
                        System.out.print(currentNum + " ");
                    }
                }
                break;
            case ">":
                for (int i = 0; i < numList.size(); i++) {
                    int currentNum = numList.get(i);
                    if (currentNum > number){
                        System.out.print(currentNum + " ");
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < numList.size(); i++) {
                    int currentNum = numList.get(i);
                    if (numList.get(i) >= number){
                        System.out.print( currentNum + " ");
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < numList.size(); i++) {
                    int currentNum = numList.get(i);
                    if (numList.get(i) <= number){
                        System.out.print(currentNum + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
}
