package DSA.String_questions;

public class reverse_str {
    public static void main(String[] args) {
        //Method 1
//        String rev = new StringBuilder("hello").reverse().toString();
//        System.out.println(rev);

        //Method 2
        String str = "hello";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
