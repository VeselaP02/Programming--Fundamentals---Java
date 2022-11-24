package Maps_Exercise;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countCommand = Integer.parseInt(scanner.nextLine());
        Map<String, String> registerMap = new LinkedHashMap<>();

        for (int i = 1; i <= countCommand ; i++) {
            String command = scanner.nextLine();


            if (command.split(" ")[0].equals("register")){
                String name = command.split("\\s+")[1];
                String license = command.split("\\s+")[2];

                if (registerMap.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s%n",license);
                } else {
                    registerMap.putIfAbsent(name, "");
                    registerMap.put(name, registerMap.get(name) + license);

                    System.out.printf("%s registered %s successfully%n", name, license);
                }


            } else if (command.split(" ")[0].equals("unregister")) {
                String name = command.split("\\s+")[1];
                if (registerMap.containsKey(name)){
                    registerMap.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                } else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }
            }
        }
        for (Map.Entry<String, String> entry : registerMap.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
