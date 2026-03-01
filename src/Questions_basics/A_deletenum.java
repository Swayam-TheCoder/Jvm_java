package Questions_basics;

import java.util.Scanner;

public class A_deletenum {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }
        System.out.println("Enter the number you want to delete: ");
        int delete = read();
        int[] newarr = delete(arr, delete);
        System.out.println("Array after deletion:");
        for(int i: newarr){
            System.out.print(i+" ");
        }
    }

    public static int[] delete(int[] arr, int delete){
        int occ = A_occurences.occ(arr, delete);
        int newsize = arr.length - occ;
        int[] newarr = new int[newsize];

        for(int i=0,j=0; i< arr.length; i++){
            if(arr[i] != delete){
                newarr[j] = arr[i];
                j++;
            }
        }
        return newarr;
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

}
