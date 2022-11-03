package List_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        List< Integer> resultList = new ArrayList<>();
        int minSize = Math.min(firstList.size(),secondList.size());
        for (int i = 0; i < minSize ; i++) {
            int firstNum = firstList.get(i);
            int secondNum = secondList.get(i);

            resultList.add(firstNum);
            resultList.add(secondNum);
        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSize,firstList.size()));
        } else if (secondList.size() > firstList.size()) {
            resultList.addAll(secondList.subList(minSize,secondList.size()));
        }
        for (Integer item:resultList) {
            System.out.print(item + " ");
        }
    }
}
