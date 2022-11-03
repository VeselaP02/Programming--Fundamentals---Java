package Regular_Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> namesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        int countBlacklisted = 0;
        int lostName = 0;
        while (!command.equals("Report")){
            String [] commandPart = command.split(" ");



                if (command.contains("Blacklist")) {
                    String name = commandPart[1];

                    int index = 0;
                    if (!namesList.contains(name)){
                        System.out.printf("%s was not found.%n",name);
                    } else {
                        for (int i = 0; i < namesList.size(); i++) {
                            if (namesList.get(i).equals(name)) {
                                index = i;

                                namesList.set(index, "Blacklisted");
                                countBlacklisted++;
                                System.out.printf("%s was blacklisted.%n", name);
                                break;
                            }
                        }
                    }

                } else if (command.contains("Error")) {
                    int index = Integer.parseInt(commandPart[1]);
                    String username = namesList.get(index);
                    String blacklisted = "Blacklisted";
                    if (index >= 0 && index <= namesList.size() - 1 && !username.equals(blacklisted) && !username.equals("Lost")){
                        namesList.set(index,"Lost");
                        lostName++;
                        System.out.printf("%s was lost due to an error.%n",username);
                    }
                } else if (command.contains("Change")) {
                    int index = Integer.parseInt(commandPart[1]);

                    String name = commandPart[2];
                    if (index >= 0 && index <= namesList.size() - 1){
                        String currentName = namesList.get(index);
                        namesList.set(index,name);
                        System.out.printf("%s changed his username to %s.%n",currentName,name);
                    }
                }

            command = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n",countBlacklisted);
        System.out.printf("Lost names: %d%n",lostName);

        for (String item:namesList) {
            System.out.print(item + " ");
        }
    }
}
