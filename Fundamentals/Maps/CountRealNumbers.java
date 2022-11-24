package Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> countMap = new TreeMap<>();
        for (double num: numbersArr) {
            countMap.putIfAbsent(num, 0);
            countMap.put(num,countMap.get(num) + 1);

        }
        for (Map.Entry<Double, Integer> doubleIntegerEntry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",doubleIntegerEntry.getKey(),doubleIntegerEntry.getValue());
        }

    }
}
