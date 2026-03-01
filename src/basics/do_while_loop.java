package basics;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1-10");
        int num;
        do{
            System.out.print("Guess the number: ");
            num = sc.nextInt();
        } while (num != 9);
        System.out.println("Congratulations, you found the right number");
    }
}
