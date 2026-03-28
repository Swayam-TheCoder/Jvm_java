package Questions_in_to_advance.String_questions;

public class CountVowelAndCon {

    public static void main(String[] args) {
        String s = "SWAyam";
        int vowels = 0;
        int consonants = 0;

        for(char c : s.toCharArray()){  //character array
            if(Character.isLetter(c)) {  // check if the character is a letter
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println(vowels+" Vowels");
        System.out.println(consonants+" Consonants");

    }
}
