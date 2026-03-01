package Questions_basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime = true;

        if(num <= 1){
            isprime = false;
        } else{
            for(int i=2; i<num/2; i++){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println("The number is prime");
        } else{
            System.out.println("The number is not prime..");
        }

        sc.close();
    }
}
