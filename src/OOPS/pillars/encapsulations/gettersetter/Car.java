package OOPS.pillars.encapsulations.gettersetter;

public class Car {
    private String color; //public
    private String brand; //public
    private double fuelLevel;
    private long cost; //default

    public Car(String color, String brand, double fuelLevel, long cost) {
        this.color = color;
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        this.cost = cost;
    }

    public String getColor(){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    // NAHI SAMJHA GETTER SETTER
    // LEARN IT AGAIN

}
