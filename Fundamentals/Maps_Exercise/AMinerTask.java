package Maps_Exercise;

import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            resourceMap.putIfAbsent(command,0);
            resourceMap.put(command,resourceMap.get(command) + quantity);

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> printEntry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n",printEntry.getKey(),printEntry.getValue());
        }


    }
}
