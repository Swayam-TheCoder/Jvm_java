package Questions_basics;

import java.util.Scanner;

public class A_maxminel {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        if(arr.length == 0){
            System.out.println("Enter a valid length");
        } else{
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }


            System.out.println(max(arr));
            System.out.println(min(arr));
        }
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
