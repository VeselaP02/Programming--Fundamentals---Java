package Object_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public Student(String firstName, String lastName, int age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();
        while (!command.equals("end")){
            String [] studentArrData = command.split("\\s+");
            Student currentStudent = new Student(studentArrData[0],studentArrData[1],Integer.parseInt(studentArrData[2]),studentArrData[3] );

            studentList.add(currentStudent);

            command = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item:studentList) {
            if (item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }
        }
    }
}
