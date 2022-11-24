package Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String,Integer> mapPoints = new LinkedHashMap<>();
        Map<String,Integer> mapLanguage = new LinkedHashMap<>();

        while (!command.equals("exam finished")){
            String [] commandArr = command.split("-");

            if (commandArr.length == 3) {
                String username = commandArr[0];
                String language = commandArr[1];
                int points = Integer.parseInt(commandArr[2]);
                if (!mapPoints.containsKey(username)) {
                    mapPoints.put(username, points);
                } else {
                    int currentPoints = mapPoints.get(username);
                    if (points > currentPoints){
                        mapPoints.put(username,points);
                    }
                }

                if (!mapLanguage.containsKey(language)){
                    mapLanguage.put(language,1);
                } else {
                    mapLanguage.put(language,mapLanguage.get(language) + 1);
                }
            } else {
                String username = commandArr[0];
                String language = commandArr[1];
                mapPoints.remove(username);
            }

            command = scanner.nextLine();
        }
        System.out.println("Results:");
        mapPoints.entrySet().forEach(entry -> System.out.printf("%s | %d%n",entry.getKey(),entry.getValue()));

        System.out.println("Submissions:");
        mapLanguage.entrySet().forEach(entry -> System.out.printf("%s - %d%n",entry.getKey(),entry.getValue()));
    }
}