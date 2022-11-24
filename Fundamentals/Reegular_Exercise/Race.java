package Reegular_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> raceName = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String,Integer> raceDistance = new LinkedHashMap<>();
        raceName.forEach(name -> raceDistance.put(name,0));



        String regexLetter = "[A-Za-z]";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexDigit = "[\\d]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")){
            Matcher matcherLetter = patternLetter.matcher(input);
            StringBuilder name = new StringBuilder();

            while (matcherLetter.find()){
                name.append(matcherLetter.group());
            }
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()){
                distance += Integer.parseInt(matcherDigit.group());
            }

            if (raceName.contains(name.toString())){
                int currentDistance = raceDistance.get(name.toString());
                raceDistance.put(name.toString(),currentDistance + distance);
            }



            input = scanner.nextLine();
        }

        List<String> top3names = raceDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + top3names.get(0));
        System.out.println("2nd place: " + top3names.get(1));
        System.out.println("3rd place: " + top3names.get(2));
    }
}
