package Questions_basics;

import java.util.Scanner;

public class A_palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }

        boolean pal = newarr(arr);
        if(pal){
            System.out.println("Your array is palindrome");
        } else{
            System.out.println("Your array is not palindrome");
        }
    }

    public static boolean newarr(int[] arr){

        for(int i=0; i< arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
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


// OR
//        int[] arr = {1,2,3,4,1};
//        int i=0, j= arr.length-1;
//        while(i < j){
//        if(arr[i] != arr[j]){
//        System.out.println("Not a palindrome");
//           return;
//        }
//          i++;
//          j--;
//        }
//        System.out.println("palin");