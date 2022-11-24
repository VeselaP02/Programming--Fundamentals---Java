package Maps_Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapStudent = new LinkedHashMap<>();


        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            mapStudent.putIfAbsent(name, new ArrayList<>());
            mapStudent.get(name).add(grade);

        }
        Map<String, Double> averageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : mapStudent.entrySet()) {
            String name = entry.getKey();
            List<Double> listGrades = entry.getValue();
             double averageGrade =getAverageGrade(listGrades);

             if (averageGrade >= 4.50){
                 averageGradeMap.put(name,averageGrade);
             }

        }
        for (Map.Entry<String, Double> entryGrade : averageGradeMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entryGrade.getKey(),entryGrade.getValue());
        }


    }
    private static double getAverageGrade(List<Double> listGrade){
        double sumGrade = 0;
        for (double grade: listGrade) {
            sumGrade += grade;
        }
        return sumGrade / listGrade.size();

    }
}
