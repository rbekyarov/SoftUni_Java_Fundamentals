package FU22_Exercise_Objects_and_Classes.zzzzzzzzzzzVehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle (String type, String model, String color, int hp){
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }
}
