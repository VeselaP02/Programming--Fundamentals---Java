package List_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestName = new ArrayList<>();

        for (int i = 1; i <= countCommands ; i++) {
            String command = scanner.nextLine();

            List<String> commandPart = Arrays.stream(command.split("\\s+")).collect(Collectors.toList());

            String name = commandPart.get(0);

            if (commandPart.size() == 3) {
                if (guestName.contains(name)){
                    System.out.printf("%s is already in the list!%n",name);
                } else {
                    guestName.add(name);
                }
            } else if (commandPart.size() == 4) {
                if (guestName.contains(name)){
                    guestName.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }
        for (String name:guestName) {
            System.out.println(name);
        }
    }
}
