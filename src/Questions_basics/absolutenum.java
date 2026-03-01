package Questions_basics;

import java.util.Scanner;

public class absolutenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // 12 --> 12, -12 --> 12
        int cal = num >= 0 ? num : -num;
        System.out.println(cal);
    }
}
