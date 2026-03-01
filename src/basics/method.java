package basics;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        int first = Number();
        int second = Number();
        System.out.println(first+second);
    }

    public static int Number(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}

