package Questions_basics;

import java.util.Scanner;

public class A_reverse2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }
        reverse(arr);
    }

    public static void reverse(int[] arr){
        for(int i=0; i< arr.length/2; i++){
            int swap = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = swap;
        }
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }
}
