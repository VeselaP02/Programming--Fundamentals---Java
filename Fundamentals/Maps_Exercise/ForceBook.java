package Maps_Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String , List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){
            if (command.contains(" | ")){
                String side = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];
                if (!map.containsKey(side)){
                    map.put(side,new ArrayList<>());
                }
                boolean isExist = false;
                for (List<String> listUsers:map.values()) {
                    if (listUsers.contains(user)){
                        isExist = true;
                        break;
                    }
                }
                if (!isExist){
                    map.get(side).add(user);
                }
                
            } else if (command.contains(" -> ")) {
                String side = command.split("\\s+->\\s+")[1];
                String user = command.split("\\s+->\\s+")[0];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (map.containsKey(side)){
                    map.get(side).add(user);
                } else {
                    map.put(side,new ArrayList<>());
                    map.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);
            }


            command = scanner.nextLine();
        }
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.printf("! %s%n", user));
                }
                );
    }
}
