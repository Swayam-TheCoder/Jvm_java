package Questions_basics;

import java.util.Scanner;

public class A_sumave {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }

        int sum = sum(arr);
        System.out.println("Sum is "+sum);
        int average = average(arr);
        System.out.println("Average is "+average);
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

    public static int sum(int[] arr){
        int sum=0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }

    public static int average(int[] arr){
        int length = arr.length;
        int average = sum(arr)/length;
        return average;
    }

}
