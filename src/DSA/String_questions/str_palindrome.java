package DSA.String_questions;

public class str_palindrome {
    public static void main(String[] args) {
        String str = "";
        if(palindrome(str)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean palindrome(String str){
        int i=0, j=str.length()-1;
        if(str.isEmpty()){  // check the string if it is empty
            return false;
        }
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
