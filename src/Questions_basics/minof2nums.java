package Questions_basics;

import java.util.Scanner;

public class minof2nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int first = sc.nextInt();
        System.out.print("Enter Second num: ");
        int second = sc.nextInt();
        int min = first > second ? second : first;
        System.out.println(min+ " is the minimum number");
    }
}
