package DSA.String_questions;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "Hsaaaabssheeeeello";
        int[] freq = new int[26];
        int largest = 0;
        char maxchar = ' ';
        for(char c : s.toLowerCase().toCharArray()){
            freq[c - 'a']++;  // imp step
        }

        for(int i=0; i<26; i++){
            if(freq[i] > 0){
                System.out.println((char)(i+'a') +": "+freq[i]);
                if(freq[i] > largest){
                    largest = freq[i];
                    maxchar = (char)(i+'a');
                }
            }
        }

        System.out.println("largest freq is " +largest);
        // we have found the largest frequency
        System.out.println("largest freq character: "+maxchar);
        // also that max freq character

    }
}
