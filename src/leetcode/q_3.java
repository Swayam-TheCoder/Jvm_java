package leetcode;

import java.util.HashSet;
import java.util.Set;

public class q_3 {
    public static int lengthOfLongestSubstring(String s) {
        Set <Character> chset = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right=0; right<s.length(); right++){
            while(chset.contains(s.charAt(right))){
                chset.remove(s.charAt(left));
                left++;
            }
            chset.add(s.charAt(right));
            max = Math.max(max, right-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "swayam";
        System.out.println(lengthOfLongestSubstring(s));
// try again
    }
}