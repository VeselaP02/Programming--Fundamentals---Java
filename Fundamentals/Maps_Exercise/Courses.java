package Maps_Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        while (!command.equals("end")){
            String [] commandArr = command.split("\\s+:\\s+");
            String nameCourses = commandArr[0];
            String studentName = commandArr[1];


            coursesMap.putIfAbsent(nameCourses, new ArrayList<>());
            coursesMap.get(nameCourses).add(studentName);



            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (String item: entry.getValue()) {
                System.out.printf("-- %s%n",item);
            }
        }

    }
}
