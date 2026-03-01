package inter_to_advance.Enums;

public class testingEnums {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        light = TrafficLight.GREEN;
        System.out.println(light);

        grade gra = grade.valueOf("C"); // C is present in the enum
//        grade gra = grade.valueOf("X"); // X is not present, So It will throw an error
        System.out.println(gra);
        for(grade value : grade.values()){
            System.out.println(value);
        }
    }
}
