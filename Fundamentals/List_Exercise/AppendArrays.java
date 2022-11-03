package List_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersPart = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(numbersPart);

        System.out.println(numbersPart.toString().
                replace("[","").replace("]","").trim().replaceAll(",","")
                .replaceAll("\\s+"," "));

     }
}
