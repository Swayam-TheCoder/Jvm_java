package OOPS;

public class driver2 {
    public static void main(String[] args) {
        Car1 mycar = new Car1("white");
//        Book3 mycar = new Book3("l", "2", 21); // Garbage Collection --> Very important
        mycar.addfuel(5);
        mycar.start().drive();
        System.out.println(mycar.color);

    }
}
