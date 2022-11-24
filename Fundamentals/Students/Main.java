package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= countStudents ; i++) {
            String command = scanner.nextLine();
            String [] commandPart = command.split("\\s+");

            String firstName = commandPart[0];
            String lastName = commandPart[1];
            double grade = Double.parseDouble(commandPart[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student :studentList) {
            System.out.println(student);
        }
    }
}
