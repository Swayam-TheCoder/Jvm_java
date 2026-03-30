package DSA.String_questions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
//        System.out.println(Anagram(s1, s2));
        Ana2(s1, s2);
    }

    public static Boolean Anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void Ana2(String s1, String s2){

        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Strings are empty");
            return;
        }

        if(s1.length() != s2.length()){
            System.out.println("Not");
            return;
        }

        int[] freq = new int[26];
        for (char ch: s1.toCharArray()){
            freq[ch - 'a']++;
        }
        for (char ch: s2.toCharArray()){
            freq[ch - 'a']--;
        }

        for(int arr : freq){
            if (arr != 0){
                System.out.println("Not");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}

// issue: What about capital letter??