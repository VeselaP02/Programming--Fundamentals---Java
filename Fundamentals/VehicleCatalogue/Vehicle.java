package VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int power;


    public Vehicle(String type, String model, String color, int power) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;


    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String formattedType = "";
        if (this.type.equals("car")){
            formattedType = "Car";
        } else if (this.type.equals("truck")) {
            formattedType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",formattedType,this.model,this.color,this.power);
    }
}
