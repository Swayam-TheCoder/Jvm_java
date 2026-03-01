package Questions_basics;

import java.util.Scanner;

public class S_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "madam";
        palindrome(str);

        /*
            recursive palindrome pending..
         */


    }

    public static void palindrome (String str){
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("String "+str+ " is a palindrome..");
        } else{
            System.out.println("String "+str+" is not a palindrome..");
        }
    }

    public static boolean recursivePalindrome(String str){

        //pending
        return true;
    }
}
