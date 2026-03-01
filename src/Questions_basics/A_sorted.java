package Questions_basics;

import java.util.Scanner;

public class A_sorted {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }

        if(isSorted(arr)){
            System.out.println("Sorted");
        } else{
            System.out.println("Not");
        }
    }

    public static boolean isSorted(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;

    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }
}


//OR This is also an approach with high complexity

//  for(int i=0; i< arr.length; i++){
//      for(int j=i+1; j< arr.length;j++){
//          if(arr[i] > arr[j]){
//              return false;
//          }
//      }
//  }