package Questions_basics;

import java.util.Scanner;

public class A_sumave2d {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int rows = read();
        System.out.print("Enter number of columns: ");
        int col = read();

        int[][] arr = new int[rows][col];
        System.out.println("Enter the Elements: ");
        for(int i=0; i< rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = read();
            }
        }

        System.out.println(sum(arr, rows, col));
        System.out.println(average(arr, rows, col));


        // PENDING...
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

    public static int sum(int[][] arr, int rows, int col){
        int sum=0;
        for(int i=0; i< rows; i++){
            for(int j=0; j<col; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static double average(int[][] arr, int rows, int col){
        int length = rows * col;
        double average = (double)sum(arr, rows, col)/length;
        return average;
    }

}
