package basics;

import java.util.Scanner;

public class A_utility {
    public static int[] inputarray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static int[][] input2d(int rows, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][col];
        System.out.println("Enter the Elements: ");

        for(int i=0; i< rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void display2d(int[][] arr){
        int rows = arr.length;
        int col = arr[0].length;
        for(int i=0;i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
