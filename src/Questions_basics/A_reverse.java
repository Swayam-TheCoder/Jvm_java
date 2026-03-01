package Questions_basics;

import java.util.Scanner;

public class A_reverse {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }

        int[] rev = newarr(arr);
        for(int i: rev){
            System.out.print(i+ " ");
        }
    }

    public static int[] newarr(int[] arr){
        int[] rev = new int[arr.length];
        for(int i=0; i< arr.length; i++){
                rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }
}
