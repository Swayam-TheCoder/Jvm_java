package OOPS;

public class Car1 {

    int noofwheels;
    String color;
    double maxspeed;
    double currentfuelLitres;
    int noofseats;

    Car1(String color){
        noofseats = 7;
        noofwheels = 4;
        maxspeed = 400;
        currentfuelLitres = 2;
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car1{");
        sb.append("noofwheels=").append(noofwheels);
        sb.append(", color='").append(color).append('\'');
        sb.append(", maxspeed=").append(maxspeed);
        sb.append(", currentfuelLitres=").append(currentfuelLitres);
        sb.append(", noofseats=").append(noofseats);
        sb.append('}');
        return sb.toString();
    }

    public Car1 start(){
        if (currentfuelLitres == 0) {
            System.out.println("Car is out of fuel, can not start..");
        } else if(currentfuelLitres < 5){
            System.out.println("Car is in reserved mode, please refuel..");
        } else{
            System.out.println("Car is starting..");
        }
        return this;
    }

    public void drive() {
        currentfuelLitres--;
        System.out.println("Car is driving..");
    }

    public void addfuel(double currentfuelLitres){
        this.currentfuelLitres += currentfuelLitres;
    }

    public double getCurrentfuelLevel(){
        return currentfuelLitres;
    }

}
