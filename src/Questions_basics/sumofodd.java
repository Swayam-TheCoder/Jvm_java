package Questions_basics;

import java.util.Scanner;

public class sumofodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n<=0){
            sum = 1;
        }
        for(int i=1; i<=n; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
