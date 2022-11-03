package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();
        int car = 0;
        int trucks = 0;
        int sumCars = 0;
        int sumTracks = 0;
        
        while (!command.equals("End")){
            String [] commandPart = command.split(" ");

            String type = commandPart[0];
            String model = commandPart[1];
            String color = commandPart[2];
            int power = Integer.parseInt(commandPart[3]);
            
            if (type.equals("car")){
                sumCars += power;
                car++;
            } else if (type.equals("truck")) {
                sumTracks += power;
                trucks++;
            }

            Vehicle vehicle = new Vehicle(type,model,color,power);
            vehicleList.add(vehicle);

            command = scanner.nextLine();
        }
        String enterModelCar = scanner.nextLine();

        while (!enterModelCar.equals("Close the Catalogue")){
            for (Vehicle item: vehicleList) {
                if (enterModelCar.equals(item.getModel())){
                    System.out.println(item);
                    break;
                }
            }


            enterModelCar = scanner.nextLine();
        }
        double averageCarsSum = 0;
        double averageTrucksSum = 0;
        if (sumCars == 0) {
            averageCarsSum = 0;
            averageTrucksSum = sumTracks * 1.0/ trucks;
        } else if (sumTracks == 0) {
            averageTrucksSum = 0;
            averageCarsSum = sumCars * 1.0 / car;
        } else {
            averageTrucksSum = sumTracks * 1.0/ trucks;
            averageCarsSum = sumCars * 1.0 / car;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCarsSum);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTrucksSum);
    }
}
