package Questions_basics;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        int a=0, b=1;
////
////        for(int i=0; i<n; i++){
////            System.out.print(a + " ");
////            int next = a + b;
////            a = b;
////            b = next;
////        }


//recursion

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }

    }

    public static int fibo(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
