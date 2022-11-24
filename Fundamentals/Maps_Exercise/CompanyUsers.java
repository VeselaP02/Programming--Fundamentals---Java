package Maps_Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!command.equals("End")){
            String companyName = command.split("\\s+->\\s+")[0];
            String employeeID = command.split("\\s+->\\s+")[1];


            if (!companyMap.containsKey(companyName)){
                List<String> employee = new ArrayList<>();
                employee.add(employeeID);
                companyMap.put(companyName,employee);
            } else {
                List<String> employee = companyMap.get(companyName);
                if (!employee.contains(employeeID)){
                    employee.add(employeeID);
                }
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            for (String ID: entry.getValue()) {
                System.out.printf("-- %s%n",ID);
            }
        }

    }
}
