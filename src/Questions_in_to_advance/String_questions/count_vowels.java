package Questions_in_to_advance.String_questions;

public class count_vowels {

    public static void main(String[] args) {
        String s = "hll";
        int count = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) != -1){
                count++;
            }
        }

        System.out.println(count);
    }
}
