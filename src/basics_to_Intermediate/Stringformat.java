package basics_to_Intermediate;

public class Stringformat {
    public static void main(String[] args) {
        String name = "Swayam";
        int age = 20;
        System.out.println("Hello, My name is "+name+" and my age is "+age);

        System.out.printf("Hello, my name is %s and my age is %d", name, age);
        System.out.println();

        //pending topic
        int num = 123456789;
        System.out.printf("Hello, my name is %s\n", name);
        System.out.printf("Hello, my name is %15s\n", name);
        System.out.printf("Hello, my name is %-15s hello\n", name);
        System.out.printf("Hello, my name is %15S\n", name);
        System.out.printf("my age is %d\n", num);
        System.out.printf("my age is %,15d\n", num);
        System.out.printf("my age is %+,15d\n", num);
        System.out.printf("my age is %-+,15d\n", num);
        System.out.printf("my age is %0,15d\n", num);

    }
}
