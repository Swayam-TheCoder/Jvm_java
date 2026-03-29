package Questions_in_to_advance.String_questions;

public class FirstNonRepChar {
    public static void main(String[] args) {
        String str = "dwaubbudaiswiss";

        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;  // if the char is 'c' then its 99-97 = 2, so at the second index, it will going to store..
        }

        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("no unique char");
    }
}
