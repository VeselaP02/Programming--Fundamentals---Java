package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            int age = Integer.parseInt(command.split(" ")[1]);

            Person person = new Person(name,age);

            if (age > 30) {
                personList.add(person);
            }
        }
        for (Person item:personList) {
            System.out.printf("%s - %d%n",item.getName(),item.getAge());
        }
    }
}
