package leetcode;

// Not working
public class q_5 {
    public static String longestPalindrome(String s) {
        int i = 0;
        for (int j=s.length()-1; j>=0; j--){
            if(s.charAt(i) != s.charAt(j)){
                return "Not a palindrome";
            }
            i++;
        }
        return "not a palindrome";
    }

    public static void main(String[] args) {
        String s = "babab";
        System.out.println(longestPalindrome(s));
    }
}
