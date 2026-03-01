package basics;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my world!");
        String name = sc.nextLine();
        System.out.println("My name is "+name);
        int var = sc.nextInt();
        int age = sc.nextInt();
        System.out.println("Roll no: "+var+" with age "+age+ " years");
    }
}
