package basics;

import java.util.Scanner;

public class parameter_arguments {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        int x = read();
        System.out.println("Enter num2: ");
        int y = read();
        int sum = Sum(x,y); // here x and y are arguments
        System.out.println(sum);
    }

    public static int Sum(int x, int y){ // here x and y are parameters
        return x + y;
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }
}
