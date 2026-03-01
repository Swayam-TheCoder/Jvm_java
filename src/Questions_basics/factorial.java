package Questions_basics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // iterative
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);

        //recursive

        System.out.println(fact(n));

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


}
