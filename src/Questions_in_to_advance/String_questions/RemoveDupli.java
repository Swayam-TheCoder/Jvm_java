package Questions_in_to_advance.String_questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupli {
    public static void main(String[] args) {
        String s = "Hello World";
        String result = "";

        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result += ch;
            }
        }
        System.out.println(result);
    }
}
