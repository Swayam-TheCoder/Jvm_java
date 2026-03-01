package Questions_basics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0, rem;
        int original = num;

        while(num > 0){
            rem = num % 10;
            num /= 10;
            rev = rev * 10 + rem;
        }

        System.out.println(rev);
        if(original == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome..");
        }
    }
}
