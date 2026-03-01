package Questions_basics;

import basics.A_utility;

import java.util.Scanner;

public class A_search2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] arr = A_utility.input2d(rows,col);

        System.out.println("Search an element: ");
        int ele = sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<col; j++){
                if(arr[rows-1][col-1] == ele) {
                    System.out.println("Found");
                    return;
                }
            }
        }
        System.out.println("not found");

    }
}
