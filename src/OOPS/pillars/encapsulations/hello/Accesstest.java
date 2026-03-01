package OOPS.pillars.encapsulations.hello;

public class Accesstest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.brand = "Mercedes";
//        car.cost = 10000000; // Throws an error
        System.out.println(car);

        Car newcar = new Car("Black", "BMW", 1, 10);
        System.out.println(newcar);

        Default def = new Default(); // I can make an object of Default class here in the same package but can't make outside the package
    }
}
