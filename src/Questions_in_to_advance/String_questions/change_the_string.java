package Questions_in_to_advance.String_questions;

// input: Abcd    output: ABCD    because in input, first letter is capital
// input: abCD    output: abcd    because in input, first letter is small

public class change_the_string {
    static void modify(String s){
        s = "hello";
        s += "world";
        s += "\n";
        s += "10";
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "";
        modify(s);
    }
}
