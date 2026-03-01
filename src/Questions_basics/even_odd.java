package Questions_basics;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        String check = num % 2 == 0 ? "even" : "odd";
        System.out.println(num+" is the "+check+" number");
    }
}
