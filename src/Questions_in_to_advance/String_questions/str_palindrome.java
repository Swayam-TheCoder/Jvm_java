package Questions_in_to_advance.String_questions;

import OOPS.pillars.encapsulations.world.Packages;

public class str_palindrome {
    public static void main(String[] args) {
        String str = "nitin";
        if(palindrome(str)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean palindrome(String str){
        int i=0, j=str.length()-1;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
