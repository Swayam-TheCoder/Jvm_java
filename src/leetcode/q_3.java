package leetcode;

public class q_3 {
    public static int lengthOfLongestSubstring(String s) {
        int st = 0;
        return st;
    }

    public static void main(String[] args) {
        String s = "swayam";
//        int len = lengthOfLongestSubstring(s);
//        System.out.println(len);

        for(int i=0; i<s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                System.out.print(str.length()+ " " + str+ " ");
            }
            System.out.println();
        }

    }
}
