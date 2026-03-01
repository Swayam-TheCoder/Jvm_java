package basics;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(fact(3));
        int i=0; int n = sc.nextInt();
        while(i<=n){
            System.out.print(fibo(i) + "  ");
            i++;
        }
    }

    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }

    public static int fibo(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibo(num-1) + fibo(num-2);
    }
}
