package basics;

import java.util.Scanner;

public class A_Array {
    public static void main(String[] args) {
        System.out.print("Enter the number ");
        int number = read();
        System.out.print("Enter the size of the array: ");
        int size = read();
        System.out.println("Enter the elements ");
        int[] num = new int[size];
        for(int i=0;i< num.length; i++){
            num[i] = read();
        }
        if(isfound(num, number)){
            System.out.println("Found");
        } else{
            System.out.println("Not found");
        }

    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

    public static boolean isfound(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

}
