package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayer.size() > 0 && secondPlayer.size() > 0){
            int firstCard = firstPlayer.get(0);
            int secondCard = secondPlayer.get(0);
            int removeFirstCard = firstPlayer.remove(0);
            int removeSecondCard = secondPlayer.remove(0);

            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else if (secondCard > firstCard) {
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);
            }
        }
        if (firstPlayer.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getSumCards(secondPlayer));
        } else {
            System.out.printf("First player wins! Sum: %d",getSumCards(firstPlayer));
        }

    }
    public static int getSumCards (List<Integer> listSum){
        int sum = 0;
        for (int number:listSum) {
            sum += number;
        }
        return sum;
    }
}
