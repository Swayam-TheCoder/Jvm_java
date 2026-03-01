package OOPS.pillars.encapsulations.hello;

public class Car {
    public String color;
    public String brand;
    private double fuelLevel;
    long cost;

    public Car(){}

    public Car(String color, String brand, double fuelLevel, long cost) {
        this.color = color;
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }


}
