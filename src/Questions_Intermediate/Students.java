package Questions_Intermediate;

public class Students {
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students Details: { name: "+name+", age: " +age+" }";
    }

    public static void main(String[] args) {
        Students st = new Students("Swayam", 20);
        System.out.println(st);
    }
}
