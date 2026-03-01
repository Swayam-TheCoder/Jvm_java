package leetcode;

import java.util.Scanner;

public class q_19 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int s=0;
        for(int i=0; i<n; i++){
            s = (int)(s + a + (Math.pow(2,i) * b));
            System.out.print(s+ " ");
        }
    }
}
