package Questions_in_to_advance.String_questions;

import basics_to_Intermediate.Stringbuilder;

import java.util.HashSet;

public class rm_duplicates {

    String rmdupli(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c: str.toCharArray()){
            if(set.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        rm_duplicates rm = new rm_duplicates();
        String st = "ababbabbababbababa";

        System.out.println(rm.rmdupli(st));
    }
}
