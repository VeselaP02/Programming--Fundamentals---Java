package Order_By_Age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        while (!input.equals("End")){
            String [] dataPerson = input.split(" ");
            String name = dataPerson[0];
            String ID = dataPerson[1];
            int age = Integer.parseInt(dataPerson[2]);

            Person person = new Person(name,ID,age);
            personList.add(person);

            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person:personList) {
            System.out.println(person);
        }
    }
}
