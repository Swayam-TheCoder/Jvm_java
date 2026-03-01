package Questions_basics;

import java.util.Scanner;

public class reversedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        int rev = 0;
        //123 ---> 321

        while (num != 0){
            rem = num % 10; //3
            num /= 10;
            rev = rev * 10 + rem;
        }

        System.out.println("The reversed number is "+rev);
    }
}
