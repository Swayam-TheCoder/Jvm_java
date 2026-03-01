package Questions_basics;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        for(int i=1; i<11; i++){
            int table = num * i;
            System.out.println(num+" * "+i+" = "+table);
        }
    }
}
