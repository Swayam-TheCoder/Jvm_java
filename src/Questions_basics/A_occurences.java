package Questions_basics;

import java.util.Scanner;

public class A_occurences {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int size = read();
        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = read();
        }

        System.out.println("Enter the number you want to find the occ..s ");
        int num = read();
        int occ = occ(arr, num);
        System.out.println("The occ are: "+occ);
    }

    public static int read(){
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        return read;
    }

    public static int occ(int [] arr, int num){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

}


